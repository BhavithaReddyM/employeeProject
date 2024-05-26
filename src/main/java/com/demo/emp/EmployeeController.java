package com.demo.emp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Employees addEmploee(@RequestBody Employee employee) {
		
		return em.addEmployee(employee);
	}
	
	@PutMapping("/updateEmployees/{id}")
	public Employees updateEmployee(@PathVariable Integer id,@RequestBody Employee employee) {
			return em.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/deleteEmployees/{id}")
	public Employees deleteEmployeeDetails(@PathVariable Integer id) {
		return em.deleteEmployeeDetails(id);
		
	}

}
