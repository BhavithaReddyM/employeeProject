package com.demo.emp;

import java.util.List;
import java.util.function.IntPredicate;

public class Employees {

	private List<Employee> employeeList;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public IntPredicate size() {
		// TODO Auto-generated method stub
		return null;
	}

}
