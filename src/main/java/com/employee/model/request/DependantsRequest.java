package com.employee.model.request;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class DependantsRequest {
	@Id
	private int employeeId;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dob;
	private String relationship; 

}
