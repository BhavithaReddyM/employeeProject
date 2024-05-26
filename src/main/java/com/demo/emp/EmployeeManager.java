package com.demo.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

	public Employees addEmployee(Employee employee) {
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
		return emp;

	}

	public Employees updateEmployee(Integer id,  Employee updateemployee) {
		Employees employees = new Employees();
		Employee employee1 = new Employee();
		
		List<Employee> updatedEmpDetails = new ArrayList<Employee>();
		updatedEmpDetails.add(updateemployee);
		Optional<Employee> employeedetailsbyId = err.findById(id);
		if(!employeedetailsbyId.isEmpty()) {
		employee1 =employeedetailsbyId.get();
		employee1.setFirst_name(updateemployee.getFirst_name());
		employee1.setLast_name(updateemployee.getLast_name());
		employee1.setGmail(updateemployee.getGmail());
		employee1.setTitle(updateemployee.getTitle());
		
		err.save(employee1);
		employees.setEmployeeList(updatedEmpDetails);

		//return "updated";
	
	}else {
		employees.setStatus("notUpdated");
	}
		return employees;
	}
	
 
	public Employees deleteEmployeeDetails(Integer id) {
		Employees employees = new Employees();
		Employee employee1 = new Employee();
		 List<Employee> employeedetails = new ArrayList<Employee>();
		//err.deleteAllById(id);
	//	employeedetails =err.findAll();
	//	employeedetails.removeIf(de -> de.getEmployee_id().equals(id));
		err.deleteById(id);
		employeedetails =err.findAll();
		err.saveAll(employeedetails);
		employees.setEmployeeList(employeedetails);
        
		return employees;

	
	}

	
	
	}
