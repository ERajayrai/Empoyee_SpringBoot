package com.employee.serviceimpl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.employee .model.request.EmployeeRequest;
import com.employee .model.db.Employee;
import com.employee.Service.EmployeeService;
import com.employee.dao.service.EmployeeDao;
import com.employee.data.service.SearchRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao; 
	@Autowired
	private SearchRepository searchRepository;
	
	@Transactional
	@Override
	public Integer addEmployee(EmployeeRequest employeeRequest) {
		try {
			System.out.println(employeeRequest.getDob());
			
		Employee emp=	new Employee(employeeRequest);
		
		System.out.println("emp=>"+emp.getFirstName());
		emp=searchRepository.save(emp);
		emp=employeeDao.save(emp);
			System.out.println(emp.getFirstName());
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return 0;
	}

	@Override
	public List<Employee> getAll(int id) {
	List<Employee> result=new ArrayList<>();
		
		employeeDao.findById(id).ifPresent(result::add);
		
		return result;
	}

	@Override
	public  Integer getDelete(int id) {
		try {
			employeeDao.deleteById(id);
			return 1;
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return  0;
	}

	@Override
	public Integer getUpdate(EmployeeRequest employeeRequest) {
		try {
			Employee upd=	new Employee(employeeRequest);
			upd=employeeDao.save(upd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}	




	
	


