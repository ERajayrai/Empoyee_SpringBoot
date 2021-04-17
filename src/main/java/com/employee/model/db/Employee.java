package com.employee.model.db;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.elasticsearch.annotations.Document;

import com.employee .model.request.EmployeeRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee")
@NoArgsConstructor
@Document(indexName= "employee")
public class Employee {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="StartDate")
	private Date startDate;
	@Column(name="Designation")
	private String designation;
	@Column(name="Department")
	private String department;
	@Column(name="Status")
	private String status;
	@Column(name="Dob")
	private Date dob;
	@Column(name="ReportingManager")
	private String reportingManager;
	@Column(name="Gender")
	private String gender;
	@Column(name="BloodGroup")
	private String bloodGroup;
	@Column(name="Adress")
	private String adress;
	@Column(name="Pincod")
	private String pincode;
	@Column(name="EndDate")
	private Date endDate;
	


	public Employee(EmployeeRequest req) {
		
		this.id = req.getId();
		this.firstName=req.getFirstName();
		this.lastName=req.getLastName();
		this.startDate=req.getStartDate();
		this.designation=req.getDesignation();
		this.department=req.getDepartment();
		this.status=req.getStatus();
		this.dob=req.getDob();
		this.reportingManager=req.getReportingManager();
		this.gender=req.getGender();
		this.bloodGroup=req.getBloodGroup();
		this.adress=req.getAdress();
		this.pincode=req.getPincode();
		this.endDate=req.getEndDate();
		
		
	}

}
