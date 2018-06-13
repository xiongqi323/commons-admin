package com.github.commons.admin.dao.helper;

import com.github.commons.admin.domain.annotation.PrimaryKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Properties;

/**
 * mybatis插件，执行insert操作前自动注入自增id
 * Created by xiongqi on 2017/3/19.
 */
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
})
public class SqlInsertInterceptor implements Interceptor {

    private IdCreator idCreator;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        /**
         * 获取拦截方法实参，有两个参数，args[0]:MappedStatement, args[1]:Object(对应的pojo对象)
         */
        Object[] args = invocation.getArgs();

        MappedStatement mappedStatement = (MappedStatement) args[0];
        if (mappedStatement.getSqlCommandType() == SqlCommandType.INSERT) { // 只处理insert语句
            if (args[1] instanceof Map) {
                /**
                 * 批量插入
                 * arg[1]是一个继承自hashmap的内部类，分两种情况：
                 * 1）mapper接口方法参数带注解@Param, 则arg[1]的类型为org.apache.ibatis.binding.MapperMethod.ParamMap，存在2个key(param1，用注解@Param标注的参数名)，值相同
                 * 2) mapper接口方法参数不带注解，则args[1]的类型为org.apache.ibatis.session.defaults.DefaultSqlSession.StrictMap，也存在两个key(collection,list)，值相同
                 *
                 * 可以debug去验证
                 */
                Map map = (Map) args[1];
                Object obj;
                try {
                    obj = map.get("list");
                } catch (Exception e) {
                    obj = map.get("param1");
                }
                if (obj != null) {
                    if (obj instanceof Iterable) {
                        Iterable iterable = (Iterable) obj;
                        iterable.forEach(this::setId);
                    }
                }
            } else {
                /**
                 * 单个插入
                 */
                setId(args[1]);
            }
        }

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        this.idCreator = (IdCreator) properties.get("idCreator");
    }

    private void setId(Object obj) {
        Class<?> clazz = obj.getClass();
        for (Field field: clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(PrimaryKey.class)) {
                // 找到主键字段，注入自增值
                PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
                String tableName = primaryKey.tableName();
                if (tableName != null && tableName.trim().length() > 0) {
                    throw new RuntimeException("tableName is empty");
                }

                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }

                try {
                    if (field.get(obj) == null) {
                        Long id = idCreator.assignId(tableName);
                        if (id == null) {
                            throw new RuntimeException("failed to assign id");
                        }

                        field.set(obj, id);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

                break;
            }
        }
    }

}

