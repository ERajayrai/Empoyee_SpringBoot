package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.request.EmployeeRequest;
import com.employee .model.response.JsonResponse;

import com.employee.Service.EmployeeService;
import com.employee.Service.SearchSearvice;


@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	SearchSearvice searchSearvice;
	
	
	  @Value("${aplication.security-key}")
	    private String security;
	
	
	@RequestMapping(value="/employee/add",method=RequestMethod.POST)
	public @ResponseBody  JsonResponse getEmployee(@RequestBody EmployeeRequest employeeRequest, @RequestHeader("security-key") String securityKey) {
		if(security.equals(securityKey))
			 
			return  new  JsonResponse(0,"1 Record Inserted Sucessfully",employeeService.addEmployee(employeeRequest));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
	}
	
	

	@RequestMapping(value="/employee/search",method= RequestMethod.GET)
	public JsonResponse getEmployeeAll(@RequestParam("q")int id, @RequestHeader("security-key") String securityKey){
		
		if(security.equals(securityKey))
			return  new JsonResponse(0,"",employeeService.getAll(id) );
		else
			return new  JsonResponse(-1,"unauthorized user",null);
		
	}
	@RequestMapping(value="/employee/{id}",method= RequestMethod.DELETE)
	public JsonResponse getEmployeeDelete(@PathVariable("id")int id,@RequestHeader("security-key") String securityKey){
		
		if(security.equals(securityKey))
			return  new JsonResponse(0,"1 Record Delete Sucessfully",employeeService.getDelete(id));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
			
		
	}
	
	@RequestMapping(value="/employee/update",method= RequestMethod.POST)
	public @ResponseBody JsonResponse getEmployeeUpdate(@RequestBody EmployeeRequest eReq ,@RequestHeader("security-key") String securityKey){
		
		if(security.equals(securityKey))
			return  new JsonResponse(0,"1 Record Updated Sucessfully",null);
		else 
			return new  JsonResponse(-1,"unauthorized user",employeeService.getUpdate(eReq));
			
		
	}
	
	@RequestMapping(value="/search",method= RequestMethod.GET)
	public JsonResponse getSearch(@RequestParam("q") String q ,@RequestHeader("security-key") String securityKey){
		
		if(security.equals(securityKey))
			return  new JsonResponse(0,"",searchSearvice.searchByQuery(q));
		else
			return new  JsonResponse(-1,"unauthorized user",null);
		
	}
}