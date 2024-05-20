package com.demo.emp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeManager em;
	public Employees employees;
	
	
	Employees emp= new Employees();

	@GetMapping("/employees")
	public Employees getEmployee() {
		return em.employeeService();

	}
	
	@PostMapping("/employees")
	public String addEmploee(@RequestBody Employee employee) {

		return em.addEmployee(employee);

		
	}

}
