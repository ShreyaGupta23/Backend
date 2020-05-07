package com.ibm.springbootdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springbootdemo.entities.Employee;
import com.ibm.springbootdemo.repos.EmployeeRepository;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> fetchAllEmployees(){
		return employeeRepository.findAll();
	}

	public void addEmployee(Employee toAdd) {
		try {
//			employeeRepository.addEmployee(toAdd);
			employeeRepository.save(toAdd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Employee findEmployeeById(int id) {
		if(id<=0){
			
		}
		return employeeRepository.findById(id);
		
	}

	public void deleteEmployeeById(int id) {
		
		employeeRepository.deleteById(id);
		
	}

	@Transactional
	public void updateEmployee(Employee updatedEmployee) {
//		employeeRepository.updateEmployee(updatedEmployee);
		Employee employee = employeeRepository.findById(updatedEmployee.getId());
		employee.setName(updatedEmployee.getName());
		employee.setSalary(updatedEmployee.getSalary());
		
	}

	public List<Employee> fetchAllEmployeesByName(String name) {
		return employeeRepository.findByName(name);
		
	}

	public List<Employee> fetchAllEmployeesBySalary(Double salary) {
		// TODO Auto-generated method stub
		return employeeRepository.findBySalary(salary);
	}

	public List<Employee> findSalaryRange(Double salary1, Double salary2) {
		// TODO Auto-generated method stub
		return employeeRepository.findBySalaryBetween(salary1,salary2);
	}

}
