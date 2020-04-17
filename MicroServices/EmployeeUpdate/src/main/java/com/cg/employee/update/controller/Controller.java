package com.cg.employee.update.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.update.entity.Employee;
import com.cg.employee.update.service.EmployeeService;

@RestController
@RequestMapping(value="/UpdateEmployee")
@CrossOrigin(origins="http://localhost:2004")
public class Controller {

	@Autowired 
	private EmployeeService service;
	
	@PostMapping("/update")
	public Employee updateEmp(@RequestBody Employee emp)
	{ 
		return	service.updateEmp(emp);	  
	}

}
