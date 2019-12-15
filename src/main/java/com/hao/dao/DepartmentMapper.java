package com.hao.dao;

import com.hao.bean.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Long deptId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long deptId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}