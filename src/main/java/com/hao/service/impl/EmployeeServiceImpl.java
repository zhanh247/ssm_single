package com.hao.service.impl;

import com.hao.bean.Employee;
import com.hao.dao.EmployeeMapper;
import com.hao.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;

	public int save(Employee record) {
		return this.employeeMapper.insert(record);
	}

	public int update(Employee record) {
		return this.employeeMapper.updateByPrimaryKeySelective(record);
	}

	public int delete(Long id) {
		return this.employeeMapper.deleteByPrimaryKey(id);
	}

	public Employee getById(Long id) {
		return this.employeeMapper.selectByPrimaryKey(id);
	}

	public List<Employee> getAll(Employee record) {
		return this.employeeMapper.getAll(record);
	}
}
