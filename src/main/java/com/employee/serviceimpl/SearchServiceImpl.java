package com.employee.serviceimpl;



import java.util.List;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import com.employee.Service.SearchSearvice;
import com.employee.data.service.SearchRepository;
import com.employee.model.db.Employee;
import com.google.common.collect.Lists;
@Service
public class SearchServiceImpl implements SearchSearvice{
	@Autowired
	SearchRepository sRp;
	@Autowired
	ElasticsearchOperations eelasticTemplateOperations;
	
	
	@SuppressWarnings("deprecation")
	@Override
	public List<Employee> searchByQuery(String q) {
		QueryBuilder matchQuery=  QueryBuilders.multiMatchQuery(q, "firstName");
		//System.out.println(matchQuery);
		return Lists.newArrayList( sRp.search(matchQuery));
	}

}
