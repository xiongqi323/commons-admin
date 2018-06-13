package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_user
 */
public class SystemUser implements Serializable {
    /**
     * 主键
     * database column t_system_user.id
     */
    private Long id;

    /**
     * 用户名
     * database column t_system_user.user_name
     */
    private String userName;

    /**
     * 密码
     * database column t_system_user.password
     */
    private String password;

    /**
     * 用户状态
     * database column t_system_user.user_status
     */
    private Byte userStatus;

    /**
     * 昵称
     * database column t_system_user.nick_name
     */
    private String nickName;

    /**
     * 性别
     * database column t_system_user.gender
     */
    private Byte gender;

    /**
     * 年龄
     * database column t_system_user.age
     */
    private Byte age;

    /**
     * 手机
     * database column t_system_user.mobile
     */
    private String mobile;

    /**
     * 邮箱
     * database column t_system_user.email
     */
    private String email;

    /**
     * 创建时间
     * database column t_system_user.created
     */
    private Date created;

    /**
     * 修改时间
     * database column t_system_user.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    /**
     * @return the value of t_system_user.id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the value for t_system_user.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the value of t_system_user.user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the value for t_system_user.user_name
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return the value of t_system_user.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the value for t_system_user.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return the value of t_system_user.user_status
     */
    public Byte getUserStatus() {
        return userStatus;
    }

    /**
     * @param userStatus the value for t_system_user.user_status
     */
    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * @return the value of t_system_user.nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName the value for t_system_user.nick_name
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * @return the value of t_system_user.gender
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * @param gender the value for t_system_user.gender
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * @return the value of t_system_user.age
     */
    public Byte getAge() {
        return age;
    }

    /**
     * @param age the value for t_system_user.age
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * @return the value of t_system_user.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the value for t_system_user.mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @return the value of t_system_user.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the value for t_system_user.email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return the value of t_system_user.created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the value for t_system_user.created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the value of t_system_user.modified
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified the value for t_system_user.modified
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }
}