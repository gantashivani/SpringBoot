package com.cg.employee.update.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employee.update.dao.EmployeeDao;
import com.cg.employee.update.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired 
	private EmployeeDao dao;

	@Override
	public Employee updateEmp(Employee emp) {
	
		boolean result=dao.existsById(emp.getId());
		if(result)
		{
			return dao.save(emp);
			
		}
		else
		{
				return null;
		}	
	}
}
