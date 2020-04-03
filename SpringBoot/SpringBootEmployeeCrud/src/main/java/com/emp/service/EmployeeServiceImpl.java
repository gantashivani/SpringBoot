package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.EmployeeDao;
import com.emp.entity.Employee;


@Service
public class EmployeeServiceImpl  implements EmployeeService{

	
	@Autowired
	private EmployeeDao dao;
	
	
	@Override
	public String createEmp(Employee employee) {
		return dao.createEmp(employee);
	}


	@Override
	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}


	@Override
	public Employee findEmpById(Integer empId) {
		return dao.findEmpById(empId);
	}


	@Override
	public String deleteEmp(Integer empId) {
		return dao.deleteEmp(empId);
	}


	@Override
	public String updateEmp(Employee employee) {
		return dao.updateEmp(employee);
	}
	
	

}
