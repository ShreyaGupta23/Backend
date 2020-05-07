package com.ibm.springbootdemo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springbootdemo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByName(String name);

	public List<Employee> findBySalary(Double salary);

	public List<Employee> findBySalaryBetween(Double salary1, Double salary2);
	public Employee findById(int id);

}