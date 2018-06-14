package com.github.commons.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * t_system_menu
 */
public class SystemMenu implements Serializable {
    /**
     * 主键
     * t_system_menu.id
     */
    private Long id;

    /**
     * 父菜单id
     * t_system_menu.parent_id
     */
    private Long parentId;

    /**
     * 菜单名称
     * t_system_menu.menu_name
     */
    private String menuName;

    /**
     * 菜单地址
     * t_system_menu.menu_url
     */
    private String menuUrl;

    /**
     * 菜单等级
     * t_system_menu.menu_level
     */
    private Byte menuLevel;

    /**
     * 菜单排序
     * t_system_menu.menu_order
     */
    private Byte menuOrder;

    /**
     * 创建时间
     * t_system_menu.created
     */
    private Date created;

    /**
     * 修改时间
     * t_system_menu.modified
     */
    private Date modified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public Byte getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Byte menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Byte getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Byte menuOrder) {
        this.menuOrder = menuOrder;
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