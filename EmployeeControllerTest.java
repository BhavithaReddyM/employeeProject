package com.demo.emp;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(EmployeeControllerTest.class)

public class EmployeeControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	ObjectMapper objm;
	
	@MockBean
	EmployeeRepo emplrepo;
	
	Employee emp = new Employee(1, "john", "abhram", "john@gmail.com", "A");
	Employee emp1 = new Employee(1, "johnsh", "abh", "johnabh@gmail.com", "Ap");
	
	
	@Test
	public void createRecord_success() throws Exception {
		/*
		 * Employee record = Employee.builder().
		 * 
		 * Mockito.when(patientRecordRepository.save(record)).thenReturn(record);
		 * 
		 * MockHttpServletRequestBuilder mockRequest =
		 * MockMvcRequestBuilders.post("/patient")
		 * .contentType(MediaType.APPLICATION_JSON) .accept(MediaType.APPLICATION_JSON)
		 * .content(this.mapper.writeValueAsString(record));
		 * 
		 * mockMvc.perform(mockRequest) .andExpect(status().isOk())
		 * .andExpect(jsonPath("$", notNullValue())) .andExpect(jsonPath("$.name",
		 * is("John Doe")));
		 */}

}
