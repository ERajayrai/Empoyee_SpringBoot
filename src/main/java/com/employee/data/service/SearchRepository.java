package com.employee.data.service;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.employee .model.db.Employee;

public interface SearchRepository extends ElasticsearchRepository<Employee, String>{
	
}
