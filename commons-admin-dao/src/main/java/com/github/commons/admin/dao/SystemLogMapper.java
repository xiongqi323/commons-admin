package com.github.commons.admin.dao;

import com.github.commons.admin.domain.entity.SystemLog;
import java.util.List;

public interface SystemLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemLog record);

    List<SystemLog> selectAll();
}