package com.employee.data.service;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.employee .model.db.Employee;
@Repository
public interface SearchRepository extends ElasticsearchRepository<Employee, String>{
	
}
