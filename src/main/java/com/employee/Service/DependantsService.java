package com.employee.Service;

import java.util.Optional;

import com.employee .model.db.Dependants;
import com.employee .model.request.DependantsRequest;

public interface DependantsService {
	
	public Integer addDependants(DependantsRequest dReq);
	public Optional<Dependants>getDependants(int employeeId);
	public Integer getDeleteDep( int employeeId);
	public Integer getUpateDep(DependantsRequest req);

}
