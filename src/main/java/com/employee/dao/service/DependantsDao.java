package com.employee.dao.service;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.db.Dependants;



@Repository
public interface DependantsDao  extends CrudRepository<Dependants,Serializable>{

}
