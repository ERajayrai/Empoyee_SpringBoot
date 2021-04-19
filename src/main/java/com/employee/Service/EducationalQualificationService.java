package com.employee.Service;

import java.util.List;


import com.employee .model.db.EducationalQualification;
import com.employee .model.request.EducationalQualificationRequest;

public interface EducationalQualificationService {
	 public Integer addDetails(EducationalQualificationRequest edqfy);
		public List<EducationalQualification> getAddQulifaction(int employeeId);
		public Integer getDeleteQlfy( int employeeId);
		public Integer getUpdateQlfy(EducationalQualificationRequest req);
	

	
	

}
