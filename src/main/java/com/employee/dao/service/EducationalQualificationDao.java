package com.employee.dao.service;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee .model.db.EducationalQualification;

@Repository
public interface EducationalQualificationDao  extends CrudRepository<EducationalQualification,Serializable>{

}
