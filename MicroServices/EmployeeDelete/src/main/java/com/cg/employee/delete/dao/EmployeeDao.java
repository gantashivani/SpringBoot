package com.cg.employee.delete.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.employee.delete.entity.Employee;


@Repository
public interface EmployeeDao  extends JpaRepository<Employee, Integer>{

}
