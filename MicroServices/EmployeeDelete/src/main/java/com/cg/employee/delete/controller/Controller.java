package com.cg.employee.delete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.delete.service.EmployeeService;

@RestController
@RequestMapping(value="/DeleteEmployee")
@CrossOrigin(origins="http://localhost:2099")
public class Controller {

	@Autowired 
	private EmployeeService service;
	
	
	@DeleteMapping("/delete/{id}")
	public  String deleteEmp(@PathVariable Integer id)
	{
		return  service.deleteEmp(id);
		
	}
	
}
