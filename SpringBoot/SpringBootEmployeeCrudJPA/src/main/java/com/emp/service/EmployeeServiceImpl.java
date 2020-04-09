package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.emp.dao.EmployeeDao;
import com.emp.entity.Employee;
import com.emp.exceptions.EmployeeNotFound;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public String createEmp(Employee employee) {
		empDao.save(employee);
		return "Employee Added" ;
	}

	@Override
	public Employee findEmpById(Integer empId) {
		//return empDao.findById(empId);
		
		if(empDao.findOne(empId) == null)
			 throw  new EmployeeNotFound("User Doesn't exist");
		else 
			return empDao.findOne(empId);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return empDao.findAll();
	}

	@Override
	public String updateEmp(Employee employee) {
		//boolean result=empDao.existsById(employee.getId());
		boolean result=empDao.exists(employee.getId());
		if(result)
		{
			empDao.save(employee);
			return "Updated Successfully";
		}else
		{
			empDao.save(employee);
			return "Update not possible user added ";
		}
	}

	@Override
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Emloyee based on id not found")
    @ExceptionHandler({EmployeeNotFound.class})
	public String deleteEmp(Integer empId) {
		@SuppressWarnings("unused")
		boolean result=empDao.exists(empId);
//		if(result)
//		{
//			//empDao.deleteById(empId);
//			empDao.delete(empId);
//			return "Deleted Successfully";
//		}
//		else{
//			return "Id Not Found";
//		}
		return "Deleted Successfully";
	}

	@Override
	public String fetchName(Integer empId) {
		
		if(empDao.fetchName(empId) == null)
			 throw  new EmployeeNotFound("User Doesn't exist");
		else 
			return empDao.fetchName(empId);
		
	}
	
	
	

}
