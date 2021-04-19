package com.employee.model.request;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class EducationalQualificationRequest {
	
	@Id
	
	private int employeeId;
	private String type ;
	private String institution;
	private String nType;
	private Date startDate;
	private Date endDate;
	private String percentage;
	private String adress;

}
