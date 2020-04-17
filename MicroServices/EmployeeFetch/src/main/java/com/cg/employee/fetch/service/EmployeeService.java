package com.cg.employee.fetch.service;

import java.util.List;
import java.util.Optional;

import com.cg.employee.fetch.entity.Employee;

public interface EmployeeService {

	List<Employee> fetchAll();

	Optional<Employee> fetchByid(Integer id);

}
