package org.mma.training.java.springboot.cache.service;

import java.util.List;

import org.mma.training.java.springboot.cache.model.Employee;
import org.mma.training.java.springboot.cache.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	@Cacheable(value = "employeeCache", key = "#id")
	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id).get();
	}
	
	//@Cacheable("employeeCache")
	public List<Employee> getAllEmployees() {
		
	    return employeeRepository.findAll();
	}
	
	@CachePut(value = "employeeCache", key = "#employee.id")
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	@CacheEvict(value = "employeeCache", key = "#id")
	public String deleteEmployee(Long id) {
		
		employeeRepository.deleteById(id);
		return "Successfully deleted employee";
	}
	

}
