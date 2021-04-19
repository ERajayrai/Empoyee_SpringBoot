package com.employee.model.db;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.elasticsearch.annotations.Document;

import com.employee .model.request.EducationalQualificationRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="eduqfy")
@Document(indexName= "eduqfy")
public class EducationalQualification {
	@Id
	@Column(name="EmployeeId")
	private int id;
	@Column(name="Type")
	private String type ;
	@Column(name="Institution")
	private String institution;
	@Column(name="Ntype")
	private String nType;
	@Column(name="StartDate")
	private Date startDate;
	@Column(name=" EndDate")
	private Date endDate;
	@Column(name=" Address")
	private String adress;
	@Column(name="Percentage")
	private String percentage;
	
	
	public EducationalQualification(EducationalQualificationRequest  edqReq) {
		this.type =edqReq.getType();
		this.institution =edqReq.getInstitution();
		this.nType = edqReq.getType();
		this.startDate = edqReq.getStartDate();
		this.endDate = edqReq.getEndDate();
		this.percentage = edqReq.getPercentage();
		this.adress = edqReq.getAdress();
		this.id=edqReq.getEmployeeId();
	}
	



}
