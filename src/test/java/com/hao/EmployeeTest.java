package com.hao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hao.bean.Employee;
import com.hao.service.EmployeeService;

public class EmployeeTest extends BaseTest{
	
	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void test1() {
		Employee employee = employeeService.getById(1L);
		System.out.println(employee);
	}

}
