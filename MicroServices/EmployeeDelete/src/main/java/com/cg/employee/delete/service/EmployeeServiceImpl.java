package com.cg.employee.delete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employee.delete.dao.EmployeeDao;


@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired 
	private EmployeeDao dao;
	
	@Override
	public String deleteEmp(Integer empId) {
		boolean result=dao.existsById(empId);
		if(result)
		{
			dao.deleteById(empId);
			return "Deleted Successfully";
		}
		else{
			return  "User Doesn't exist";
		}
		
	}
}
