package com.hao.service;

import com.hao.bean.Employee;
import java.util.List;

public abstract interface EmployeeService
{
  public abstract int save(Employee paramEmployee);
  
  public abstract int update(Employee paramEmployee);
  
  public abstract int delete(Long paramLong);
  
  public abstract Employee getById(Long paramLong);
  
  public abstract List<Employee> getAll(Employee paramEmployee);
}
