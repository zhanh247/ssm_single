package com.hao.dao;

import com.hao.bean.Employee;
import java.util.List;

public abstract interface EmployeeMapper {
	public abstract int deleteByPrimaryKey(Long paramLong);

	public abstract int insert(Employee paramEmployee);

	public abstract int insertSelective(Employee paramEmployee);

	public abstract Employee selectByPrimaryKey(Long paramLong);

	public abstract int updateByPrimaryKeySelective(Employee paramEmployee);

	public abstract int updateByPrimaryKey(Employee paramEmployee);

	public abstract List<Employee> getAll(Employee paramEmployee);
}
