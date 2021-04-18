package com.employee.model.db;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.elasticsearch.annotations.Document;

import com.employee .model.request.DependantsRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name=" dependants")
@NoArgsConstructor
@Document(indexName= "dependants")
public class Dependants {
	@Id
	@Column(name="EmployeeId")
	private int id;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="Gender")
	private String gender;
	@Column(name="Dob")
	private Date dob;
	@Column(name="Relationship")
	private String relationship;
	
	public Dependants(DependantsRequest req ) {
		
		this.firstName=req.getFirstName();
		this.lastName=req.getLastName();
		this.gender=req.getGender();
		this.dob=req.getDob();
		this.relationship=req.getRelationship();
		this.id=req.getEmployeeId();
		
		
	}
	

}
