package com.github.commons.admin.dao;

import com.github.commons.admin.domain.entity.SystemUserRoleRelation;
import java.util.List;

public interface SystemUserRoleRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemUserRoleRelation record);

    SystemUserRoleRelation selectByPrimaryKey(Long id);

    List<SystemUserRoleRelation> selectAll();

    int updateByPrimaryKey(SystemUserRoleRelation record);
}