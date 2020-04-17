package com.cg.employee.fetch.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employee.fetch.dao.EmployeeDao;
import com.cg.employee.fetch.entity.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired 
	private EmployeeDao dao;

	@Override
	public List<Employee> fetchAll() {
		return dao.findAll();
	}

	@Override
	public Optional<Employee> fetchByid(Integer id) {
		return  dao.findById(id);
	}	
}
