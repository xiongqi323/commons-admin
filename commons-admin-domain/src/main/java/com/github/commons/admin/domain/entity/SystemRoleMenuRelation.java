package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_role_menu_relation
 */
public class SystemRoleMenuRelation implements Serializable {
    /**
     * 主键
     * database column t_system_role_menu_relation.id
     */
    private Long id;

    /**
     * 角色id
     * database column t_system_role_menu_relation.role_id
     */
    private Long roleId;

    /**
     * 菜单id
     * database column t_system_role_menu_relation.menu_id
     */
    private Long menuId;

    /**
     * 创建时间
     * database column t_system_role_menu_relation.created
     */
    private Date created;

    /**
     * 修改时间
     * database column t_system_role_menu_relation.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    /**
     * @return the value of t_system_role_menu_relation.id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the value for t_system_role_menu_relation.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the value of t_system_role_menu_relation.role_id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the value for t_system_role_menu_relation.role_id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the value of t_system_role_menu_relation.menu_id
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * @param menuId the value for t_system_role_menu_relation.menu_id
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * @return the value of t_system_role_menu_relation.created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the value for t_system_role_menu_relation.created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the value of t_system_role_menu_relation.modified
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified the value for t_system_role_menu_relation.modified
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }
}