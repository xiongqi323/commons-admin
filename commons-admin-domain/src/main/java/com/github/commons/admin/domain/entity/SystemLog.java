package com.github.commons.admin.domain.entity;

import java.io.Serializable;

/**
 * t_system_log
 */
public class SystemLog implements Serializable {
    /**
     * 主键
     * t_system_log.id
     */
    private Long id;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}