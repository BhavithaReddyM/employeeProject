package com.demo.emp;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
	
	@Mock
	  private EmployeeRepo empRepo;
	
	@InjectMocks
	private EmployeeManager emMan;
	
	@Test
	void getAllempp() {
		
		Employee emp = new Employee(1, "john", "abhram", "john@gmail.com", "A");
		Employee emp1 = new Employee(1, "johnsh", "abh", "johnabh@gmail.com", "Ap");
		
		/*
		 * ((Object) given(empRepo.findAll())) .willReturn(List.of(emp,emp1));
		 */
		 
		 var  personList = emMan.employeeService();
	         assertThat(personList).isNotNull();
	         assertThat(personList.size()).isEqualTo(2);
	}

	private List<Employee> given(List<Employee> all) {
		// TODO Auto-generated method stub
		return (List<Employee>) emMan;
	}


}
