package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_user_role_relation
 */
public class SystemUserRoleRelation implements Serializable {
    /**
     * 主键
     * t_system_user_role_relation.id
     */
    private Long id;

    /**
     * 用户id
     * t_system_user_role_relation.user_id
     */
    private Long userId;

    /**
     * 角色id
     * t_system_user_role_relation.role_id
     */
    private Long roleId;

    /**
     * 创建时间
     * t_system_user_role_relation.created
     */
    private Date created;

    /**
     * 修改时间
     * t_system_user_role_relation.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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