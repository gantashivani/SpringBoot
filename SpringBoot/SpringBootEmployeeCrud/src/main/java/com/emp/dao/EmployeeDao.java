package com.emp.dao;

import java.util.List;

import com.emp.entity.Employee;

public interface EmployeeDao {

	String createEmp(Object employee);

	List<Employee> findAllEmployees();

	Employee findEmpById(Integer empId);

	String deleteEmp(Integer empId);

	String updateEmp(Employee employee);

}
