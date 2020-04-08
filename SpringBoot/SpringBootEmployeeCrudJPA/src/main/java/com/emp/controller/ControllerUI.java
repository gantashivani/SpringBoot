package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.exceptions.EmployeeNotFound;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping(value="/Employee")
//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(origins="http://localhost:2020")
public class ControllerUI {
	
	@Autowired
	private EmployeeService empservice;
	
	@PostMapping(value="/create")
	public String createEmp(@RequestBody Employee employee)
	{
		return empservice.createEmp(employee);
	}
	
	@GetMapping("/findById/{empId}")
	public Employee findEmpById(@PathVariable Integer empId) {
		return empservice.findEmpById(empId);
	}
	
	@GetMapping("/fetchall")
	public List<Employee> findAllEmployees() {
		return empservice.findAllEmployees();
	}
	
	@PutMapping("/update")
	public String updateEmp(@RequestBody Employee employee) {
		return empservice.updateEmp(employee);
	}
	
	@DeleteMapping("/delete/{empId}")
	public String deleteEmp(@PathVariable Integer empId)
	{
		return empservice.deleteEmp(empId);
	}
	
	@GetMapping("/view/{empId}")
	public String fetchName(@PathVariable Integer empId)
	{
		return empservice.fetchName(empId);
	}
	
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	 @ExceptionHandler(EmployeeNotFound.class) public ResponseEntity
	  userNotFound(EmployeeNotFound e) { 
		 return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		 }
}
