package org.mma.training.java.springboot.cache.controller;

import java.util.List;

import org.mma.training.java.springboot.cache.model.Employee;
import org.mma.training.java.springboot.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("employee")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK);
	}
	
	@GetMapping("employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}
	
	@PostMapping("employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.CREATED);
	}
	
	@PutMapping("employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee), HttpStatus.OK);
	}
	
	@DeleteMapping("employee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable long id) {
		
		return new ResponseEntity<>(employeeService.deleteEmployee(id), HttpStatus.OK);		
	}

}
