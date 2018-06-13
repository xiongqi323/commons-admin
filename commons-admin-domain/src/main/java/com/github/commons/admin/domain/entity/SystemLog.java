package com.github.commons.admin.domain.entity;

import java.io.Serializable;

/**
 * t_system_log
 */
public class SystemLog implements Serializable {
    /**
     * 主键
     * database column t_system_log.id
     */
    private Long id;

    private static final long serialVersionUID = 1L;

    /**
     * @return the value of t_system_log.id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the value for t_system_log.id
     */
    public void setId(Long id) {
        this.id = id;
    }
}