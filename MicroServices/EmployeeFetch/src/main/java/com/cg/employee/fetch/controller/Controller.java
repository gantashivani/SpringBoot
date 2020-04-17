package com.cg.employee.fetch.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.fetch.entity.Employee;
import com.cg.employee.fetch.service.EmployeeService;


@RestController
@RequestMapping(value="/FetchEmployee")
@CrossOrigin(origins="http://localhost:2003")
public class Controller {
	
	@Autowired 
	private EmployeeService service;

	@GetMapping("/findall")
	public List<Employee> fetchAll()
	{
		return service.fetchAll();
	}
	
	@GetMapping("/find/{id}")
	public  Optional<Employee> fetchById(@PathVariable Integer id)
	{
		return service.fetchByid(id);
	}
	
}
