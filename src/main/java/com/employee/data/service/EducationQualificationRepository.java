package com.employee.data.service;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.employee.model.db.EducationalQualification;
public interface EducationQualificationRepository  extends ElasticsearchRepository<EducationalQualification, Integer>{

}
