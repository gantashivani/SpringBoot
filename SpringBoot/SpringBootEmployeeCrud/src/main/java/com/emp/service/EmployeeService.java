package com.emp.service;

import java.util.List;

import com.emp.entity.Employee;

public interface EmployeeService {

	String createEmp(Employee employee);

	List<Employee> findAllEmployees();

	Employee findEmpById(Integer empId);

	String deleteEmp(Integer empId);

	String updateEmp(Employee employee);
}
