package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_role
 */
public class SystemRole implements Serializable {
    /**
     * 主键
     * t_system_role.id
     */
    private Long id;

    /**
     * 角色名称
     * t_system_role.role_name
     */
    private String roleName;

    /**
     * 创建时间
     * t_system_role.created
     */
    private Date created;

    /**
     * 修改时间
     * t_system_role.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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