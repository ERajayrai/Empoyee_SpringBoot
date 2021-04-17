package com.employee.model.request;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmployeeRequest {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private Date startDate;
	private String designation;
	private String department;
	private String status;
	private Date dob;
	private String reportingManager;
	private String gender;
	private String bloodGroup;
	private String adress;
	private String pincode;
	private Date endDate;

}
