package com.hao.web;

import com.hao.bean.Employee;
import com.hao.service.EmployeeService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({ "employee" })
public class EmployeeController {
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = { "doSave" }, method = { RequestMethod.POST })
	public void save(HttpServletRequest request, HttpServletResponse response, Employee employee) {
		int save = this.employeeService.save(employee);
		log.info("save success..." + save);
	}

	@RequestMapping(value = { "doGet" }, method = { RequestMethod.GET })
	public void get(HttpServletRequest request, HttpServletResponse response, String id) {
		if (StringUtils.isNotEmpty(id)) {
			Employee employee = this.employeeService.getById(Long.valueOf(id));
			log.info("employee data..." + employee);
		}
	}
}
