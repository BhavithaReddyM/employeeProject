package com.demo.emp;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "employees_list")
public class Employee {
@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employee_id;
@Column
@NonNull
	private String first_name;
@Column
@NonNull
	private String last_name;
@Column
@NonNull
	private String gmail;
@Column
@NonNull
	private String title;
public Integer getEmployee_id() {
	return employee_id;
}
public void setEmployee_id(Integer employee_id) {
	this.employee_id = employee_id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Employee(Integer employee_id, String first_name, String last_name, String gmail, String title) {
	super();
	this.employee_id = employee_id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.gmail = gmail;
	this.title = title;
}
@Override
public String toString() {
	return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
			+ ", gmail=" + gmail + ", title=" + title + "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
/*
 * public static Object builder() { // TODO Auto-generated method stub return
 * null; }
 */


	

}
