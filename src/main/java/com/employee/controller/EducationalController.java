package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee .model.response.JsonResponse;
import com.employee .model.request.EducationalQualificationRequest;
import com.employee.Service.EducationalQualificationService;



@RestController
@CrossOrigin
public class EducationalController {
	
	@Autowired
	EducationalQualificationService service;
	
	@Value("${aplication.security-key}")
	private String security;
	
	@RequestMapping(value="/qulification/add",method=RequestMethod.POST)
	public @ResponseBody JsonResponse getAddQulafication(@RequestBody EducationalQualificationRequest  req,@RequestHeader("security-key") String securityKey ) {
		
		
		if(security.equals(securityKey))
			return  new  JsonResponse(0,"1 Record Inserted Sucessfully",service.addDetails(req ));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
	}
	@RequestMapping(value="/search/qulification",method= RequestMethod.GET)
	public  @ResponseBody JsonResponse  getQulification(@RequestParam("q") int employeeId, @RequestHeader("security-key") String securityKey) {
		if(security.equals(securityKey))
			return new  JsonResponse(0,"",service.getAddQulifaction(employeeId));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
	}
	
	@RequestMapping(value="/qulification/delete",method= RequestMethod.DELETE)
	public  @ResponseBody JsonResponse  getDeleteQulification(@RequestParam("q") int employeeId,@RequestHeader("security-key") String securityKey) {
		if(security.equals(securityKey))	
			return  new  JsonResponse(0,"1 Record Deleted Sucessfully",service.getDeleteQlfy(employeeId));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
	}
	
	@RequestMapping(value="/qulification/update",method= RequestMethod.GET)
	public  @ResponseBody JsonResponse  getUpdateQulification(@RequestBody EducationalQualificationRequest  ureq, @RequestHeader("security-key") String securityKey) {
		if(security.equals(securityKey))
			return  new  JsonResponse(0,"1 Record Updated Sucessfully",service.getUpdateQlfy(ureq));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
	}
	

	

}
