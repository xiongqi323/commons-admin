package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_role
 */
public class SystemRole implements Serializable {
    /**
     * 主键
     * database column t_system_role.id
     */
    private Long id;

    /**
     * 角色名称
     * database column t_system_role.role_name
     */
    private String roleName;

    /**
     * 创建时间
     * database column t_system_role.created
     */
    private Date created;

    /**
     * 修改时间
     * database column t_system_role.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    /**
     * @return the value of t_system_role.id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the value for t_system_role.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the value of t_system_role.role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName the value for t_system_role.role_name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * @return the value of t_system_role.created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the value for t_system_role.created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the value of t_system_role.modified
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified the value for t_system_role.modified
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }
}