package com.employee.data.service;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.db.EducationalQualification;
@Repository
public interface EducationQualificationRepository  extends ElasticsearchRepository<EducationalQualification, Integer>{

}
