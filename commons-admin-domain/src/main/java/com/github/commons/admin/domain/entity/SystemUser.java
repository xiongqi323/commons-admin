package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_user
 */
public class SystemUser implements Serializable {
    /**
     * 主键
     * t_system_user.id
     */
    private Long id;

    /**
     * 用户名
     * t_system_user.user_name
     */
    private String userName;

    /**
     * 密码
     * t_system_user.password
     */
    private String password;

    /**
     * 用户状态
     * t_system_user.user_status
     */
    private Byte userStatus;

    /**
     * 昵称
     * t_system_user.nick_name
     */
    private String nickName;

    /**
     * 性别
     * t_system_user.gender
     */
    private Byte gender;

    /**
     * 年龄
     * t_system_user.age
     */
    private Byte age;

    /**
     * 手机
     * t_system_user.mobile
     */
    private String mobile;

    /**
     * 邮箱
     * t_system_user.email
     */
    private String email;

    /**
     * 创建时间
     * t_system_user.created
     */
    private Date created;

    /**
     * 修改时间
     * t_system_user.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}