package com.example.springboot.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.web.model.Employee;
import com.example.springboot.web.repository.EmployeeRepositoryInterface;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepositoryInterface employeeRepositoryInterface;

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.findAll();
	}
	
	public void addEmployee(Employee employee) {
		this.employeeRepositoryInterface.save(employee);
	}
	
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional = employeeRepositoryInterface.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}
		else
		{
			throw new RuntimeException("Employee not found");
		}
		return employee;
	}
	
	public void deleteEmployeeById(int id) {
		this.employeeRepositoryInterface.deleteById(id);;
	}
}
