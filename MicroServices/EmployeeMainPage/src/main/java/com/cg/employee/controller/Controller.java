package com.cg.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.employee.entity.Employee;

@RestController
@RequestMapping(value="/Employee")
@CrossOrigin(origins="http://localhost:1999")
public class Controller {
	
	@Autowired
	RestTemplate rest;
	
	@RequestMapping("/create")
	public String createEmp(@RequestBody Employee emp)
	{
		rest.postForObject("http://localhost:2001/AddEmployee/add",emp,Employee.class);
		return "Added Emp";
	}
	
	@PostMapping("/update")
	public String updateEmp(@RequestBody Employee emp)
	{
		rest.postForObject("http://localhost:2004/UpdateEmployee/update",emp,Employee.class);
		return "Updated";
	}
	
	
	@RequestMapping("/deleted/{id}")
	public Employee deleteEmp(@PathVariable("id") Integer id)
	{
		return rest.getForObject("http://localhost:2099/DeleteEmployee/delete/"+id,Employee.class);
		
	}
	
	/*
	@GetMapping("/fetchall")
	public Employee fetchEmp()
	{
		return rest.getForObject("http://localhost:2003/FetchEmployee/findall",Employee.class);
	}*/

	@GetMapping("/fetch/{id}")
	public Employee fetchEmpById(@PathVariable("id") Integer id)
	{
		return rest.getForObject("http://localhost:2003/FetchEmployee/find/"+id,Employee.class);
	}
	
}
