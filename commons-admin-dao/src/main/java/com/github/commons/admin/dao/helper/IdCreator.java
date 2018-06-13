package com.github.commons.admin.dao.helper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jiadongxu on 14-11-30.
 * id生成器
 */
public class IdCreator {

    private String url;
    private String userName;
    private String password;
    private String driverClassName;

    private DataSource dataSource;

    private void initDriver(){
        //加载驱动
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private ConcurrentHashMap<String,IdEntity> map = new ConcurrentHashMap<String, IdEntity>();

    public Long assignId(String name){
        if(name == null || name.trim().length() == 0){
            throw new RuntimeException("param name is null");
        }
        Long id = generateId(name);
        return id;
    }

    private Long generateId(String tableName){
        if(tableName == null || tableName.trim().length() == 0){
            throw new IllegalArgumentException("param tableName is empty");
        }
        Long ret = null;
        synchronized (tableName){
            IdEntity entity = map.get(tableName);
            if(entity==null){
                loadIdEntity(tableName);
            }else{
                ret = entity.getId();
                if(ret==null){
                    loadIdEntity(tableName);
                }
            }
            if(ret==null){
                entity = map.get(tableName);
                if(entity!=null){
                    ret = entity.getId();
                }
            }
        }
        return  ret;
    }

    private void loadIdEntity(String tableName){

        Connection conn = null;
        CallableStatement callableStatement = null;
        try {
            conn = getConnection();
            callableStatement = conn.prepareCall("{call idSequenceProc(?,?,?)}");
            callableStatement.setString(1,tableName);
            callableStatement.registerOutParameter(2, Types.BIGINT);
            callableStatement.registerOutParameter(3, Types.BIGINT);
            callableStatement.execute();

            IdEntity entity = new IdEntity(callableStatement.getLong(2),callableStatement.getLong(3));
            map.put(tableName,entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(callableStatement!=null){
                try {
                    callableStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private Connection getConnection(){
        Connection connection = null;
        if(dataSource!=null){
            try {
                connection = dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("从 datasource 获取连接");
        }else{
            try {
                connection = DriverManager.getConnection(url, userName, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
        initDriver();
    }

}

class IdEntity{
    private AtomicLong id = new AtomicLong(0);
    private Long max;
    public IdEntity(Long id,Long max){
        this.id.set(id);
        this.max = max;
    }
    public Long getId(){
        Long tmp = id.getAndIncrement();
        if(tmp>max){
            return null;
        }
        return tmp;
    }
}

