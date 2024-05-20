package com.demo.emp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class EmployeeManager {

	@Autowired
	public EmployeeRepo err;

	public Employees employeeService() {
		
		Employees emps= new Employees();

  List<Employee> emp = new ArrayList<Employee>();
		/*
		 * List<Employee> employee = new ArrayList<Employee>(); Employee employee1 = new
		 * Employee(1, "Vinayak", "Chamakura", "vb@gmail.com", "A"); Employee employee2
		 * = new Employee(2, "Bhavitha", "Medam", "vbc@gmail.com", "B"); Employee
		 * employee3 = new Employee(3, "Bhavya", "Medam", "br@gmail.com", "C");
		 * 
		 * 
		 * emp.getEmployeeList().add(employee1); emp.getEmployeeList().add(employee2);
		 * emp.getEmployeeList().add(employee3);
		 * 
		 * // emp.getEmployeeList().add(employee1); employee.add(employee1);
		 * employee.add(employee2); employee.add(employee3);
		 * //emp.setEmployeeList(employee);
		 */
       emp=err.findAll();
		
		emps.setEmployeeList(emp);
		//emps.getEmployeeList().add((Employee) err.findAll());
		return emps;

	}

	public String addEmployee(Employee employee) {
		String emprslt;
		Employees emp = new Employees();
		List<Employee> employee1 = new ArrayList<Employee>();
		employee1.add(employee);
		emp.setEmployeeList(employee1);
		err.save(employee);

		if (!CollectionUtils.isEmpty(employee1)) {

			emprslt = "added";
		} else {
			emprslt = "not added";

		}
		return emprslt;

	}

}
