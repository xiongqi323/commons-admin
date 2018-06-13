package com.github.commons.admin.domain.annotation;

import java.lang.annotation.*;

/**
 * 标记pojo实体类对应数据表的主键字段
 * Created by xiongqi on 2017/3/19.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PrimaryKey {

    /**
     * pojo实体类对应的表名称
     * @return
     */
    String tableName() default "";

}
