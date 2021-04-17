package com.employee.Service;


import java.util.Optional;

import com.employee .model.db.Employee;
import com.employee .model.request.EmployeeRequest;

public interface EmployeeService {
	public Integer addEmployee(EmployeeRequest employeeRequest);
	public Optional<Employee> getAll(int id);
	public Integer getDelete(int id);
	public Integer getUpdate(EmployeeRequest employeeRequest);
	
	

}
