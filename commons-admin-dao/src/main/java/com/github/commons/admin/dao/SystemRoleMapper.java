package com.github.commons.admin.dao;

import com.github.commons.admin.domain.SystemRole;
import java.util.List;

public interface SystemRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemRole record);

    SystemRole selectByPrimaryKey(Long id);

    List<SystemRole> selectAll();

    int updateByPrimaryKey(SystemRole record);
}