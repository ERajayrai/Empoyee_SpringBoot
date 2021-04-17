package com.employee.Service;

import java.util.List;

import com.employee.model.db.Employee;

public interface SearchSearvice {
	
	public List<Employee> searchByQuery(String q);
	

}
