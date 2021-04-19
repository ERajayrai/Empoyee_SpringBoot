package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee .model.response.JsonResponse;
import com.employee .model.request.DependantsRequest;
import com.employee.Service.DependantsService;

@RestController
@CrossOrigin
public class DependantsController {
	@Autowired
	DependantsService dService;
	
	@Value("${aplication.security-key}")
	private String security;
	
	@RequestMapping(value="/dependants/add",method=RequestMethod.POST)
	public @ResponseBody JsonResponse getDependans(@RequestBody DependantsRequest  req ,@RequestHeader("security-key") String securityKey) {
		if(security.equals(securityKey))
			return  new  JsonResponse(0,"1 Record Inserted Sucessfully",dService.addDependants(req ));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
	}
	
	@RequestMapping(value="/dependants/search/{id}",method=RequestMethod.GET)
	public @ResponseBody JsonResponse getSearchDependans(@PathVariable("id") int id,@RequestHeader("security-key") String securityKey ) {
		if(security.equals(securityKey))
			return  new  JsonResponse(0,"sucessFully search",dService. getDependants(id));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
			
			
		
	}
	@RequestMapping(value="/dependants/delete/{employeeId,}",method=RequestMethod.DELETE)
	public @ResponseBody JsonResponse getDeleteDependans(@PathVariable("employeeId,") int employeeId,@RequestHeader("security-key") String securityKey  ) {
		if(security.equals(securityKey))
			return  new  JsonResponse(0,"1 Record Deleted Sucessfully",dService.getDeleteDep(employeeId));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
	}
	@RequestMapping(value="/dependants/update",method=RequestMethod.POST)
	public @ResponseBody JsonResponse getUpdateDependans(@RequestBody DependantsRequest dpReq,@RequestHeader("security-key") String securityKey ) {
		if(security.equals(securityKey))
			return  new  JsonResponse(0,"Record Updated Sucessfully",dService. getUpateDep(dpReq));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
			
	}
	


}
