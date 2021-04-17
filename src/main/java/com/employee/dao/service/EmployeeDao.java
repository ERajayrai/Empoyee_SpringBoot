package com.employee.dao.service;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee .model.db.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Serializable>{
	

}
