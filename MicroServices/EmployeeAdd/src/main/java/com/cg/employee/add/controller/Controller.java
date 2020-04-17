package com.cg.employee.add.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.add.entity.Employee;
import com.cg.employee.add.service.EmployeeService;


@RestController
@RequestMapping(value="/AddEmployee")
@CrossOrigin(origins="http://localhost:2001")
public class Controller{
	
	@Autowired 
	private EmployeeService service;

	@RequestMapping("/add")
	public Employee addEmp(@RequestBody Employee emp) {
		 return service.addEmp(emp);
	}
}
