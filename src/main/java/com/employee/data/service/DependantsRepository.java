package com.employee.data.service;

import java.io.Serializable;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.employee.model.db.Dependants;

public interface DependantsRepository  extends ElasticsearchRepository<Dependants,Serializable> {

}
