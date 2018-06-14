package com.github.commons.admin.dao;

import com.github.commons.admin.domain.entity.SystemUser;
import java.util.List;

public interface SystemUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemUser record);

    SystemUser selectByPrimaryKey(Long id);

    List<SystemUser> selectAll();

    int updateByPrimaryKey(SystemUser record);
}