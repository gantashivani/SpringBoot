package com.emp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.emp.entity.Employee;


@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public String createEmp(Object employee) {
		entityManager.persist(employee); 
		return "Added Successfully";
	}

	
	@Override
	public Employee findEmpById(Integer empId) {
		return  entityManager.find(Employee.class,empId);
		
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		Query q=entityManager.createQuery("select a from Employee a");
		@SuppressWarnings("unchecked")
		List<Employee> l= q.getResultList();
		return l;
	}


	@Override
	public String deleteEmp(Integer empId) {
		entityManager.remove(empId);
		return "Deleted Succesfully";
	}


	@Override
	public String updateEmp(Employee employee) {
		entityManager.merge(employee);
		return "Updated Succesfully";
	}

}
