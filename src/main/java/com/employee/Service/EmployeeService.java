package com.employee.Service;


import java.util.List;


import com.employee .model.db.Employee;
import com.employee .model.request.EmployeeRequest;

public interface EmployeeService {
	public Integer addEmployee(EmployeeRequest employeeRequest);
	public List<Employee> getAll(int id);
	public Integer getDelete(int id);
	public Integer getUpdate(EmployeeRequest employeeRequest);
	
	

}
