package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_menu
 */
public class SystemMenu implements Serializable {
    /**
     * 主键
     * database column t_system_menu.id
     */
    private Long id;

    /**
     * 父菜单id
     * database column t_system_menu.parent_id
     */
    private Long parentId;

    /**
     * 菜单名称
     * database column t_system_menu.menu_name
     */
    private String menuName;

    /**
     * 菜单地址
     * database column t_system_menu.menu_url
     */
    private String menuUrl;

    /**
     * 菜单等级
     * database column t_system_menu.menu_level
     */
    private Byte menuLevel;

    /**
     * 菜单排序
     * database column t_system_menu.menu_order
     */
    private Byte menuOrder;

    /**
     * 创建时间
     * database column t_system_menu.created
     */
    private Date created;

    /**
     * 修改时间
     * database column t_system_menu.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    /**
     * @return the value of t_system_menu.id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the value for t_system_menu.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the value of t_system_menu.parent_id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId the value for t_system_menu.parent_id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return the value of t_system_menu.menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName the value for t_system_menu.menu_name
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * @return the value of t_system_menu.menu_url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl the value for t_system_menu.menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * @return the value of t_system_menu.menu_level
     */
    public Byte getMenuLevel() {
        return menuLevel;
    }

    /**
     * @param menuLevel the value for t_system_menu.menu_level
     */
    public void setMenuLevel(Byte menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * @return the value of t_system_menu.menu_order
     */
    public Byte getMenuOrder() {
        return menuOrder;
    }

    /**
     * @param menuOrder the value for t_system_menu.menu_order
     */
    public void setMenuOrder(Byte menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * @return the value of t_system_menu.created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created the value for t_system_menu.created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return the value of t_system_menu.modified
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified the value for t_system_menu.modified
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }
}