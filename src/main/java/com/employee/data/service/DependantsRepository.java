package com.employee.data.service;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.employee.model.db.Dependants;

public interface DependantsRepository  extends ElasticsearchRepository<Dependants,Integer> {

}
