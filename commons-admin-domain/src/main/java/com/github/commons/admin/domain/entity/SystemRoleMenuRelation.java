package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_role_menu_relation
 */
public class SystemRoleMenuRelation implements Serializable {
    /**
     * 主键
     * t_system_role_menu_relation.id
     */
    private Long id;

    /**
     * 角色id
     * t_system_role_menu_relation.role_id
     */
    private Long roleId;

    /**
     * 菜单id
     * t_system_role_menu_relation.menu_id
     */
    private Long menuId;

    /**
     * 创建时间
     * t_system_role_menu_relation.created
     */
    private Date created;

    /**
     * 修改时间
     * t_system_role_menu_relation.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
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