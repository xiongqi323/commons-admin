package com.github.commons.admin.dao;

import com.github.commons.admin.domain.SystemRoleMenuRelation;
import java.util.List;

public interface SystemRoleMenuRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemRoleMenuRelation record);

    SystemRoleMenuRelation selectByPrimaryKey(Long id);

    List<SystemRoleMenuRelation> selectAll();

    int updateByPrimaryKey(SystemRoleMenuRelation record);
}