package com.cg.employee.add.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employee.add.dao.EmployeeDao;
import com.cg.employee.add.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired 
	private EmployeeDao dao;

	@Override
	public Employee addEmp(Employee emp) {
		return dao.save(emp);
	}
	
}
