package com.github.commons.admin.dao;

import com.github.commons.admin.domain.entity.SystemJob;
import java.util.List;

public interface SystemJobMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemJob record);

    SystemJob selectByPrimaryKey(Long id);

    List<SystemJob> selectAll();

    int updateByPrimaryKey(SystemJob record);
}