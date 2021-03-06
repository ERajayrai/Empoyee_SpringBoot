package com.employee.serviceimpl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee .model.request.DependantsRequest;
import com.employee .model.db.Dependants;

import com.employee.Service.DependantsService;
import com.employee.dao.service.DependantsDao;
import com.employee.data.service.DependantsRepository;
@Service
public class DependantsServiceImpl implements DependantsService {
	@Autowired
	DependantsDao dDao;
	@Autowired
	private DependantsRepository dependantsRepository;
	
	@Transactional
	@Override
	public Integer addDependants(DependantsRequest dReq) {
		
		try {
			Dependants dp=new Dependants(dReq);
			dp=dependantsRepository.save(dp);
			dp=dDao.save(dp);
			return 1;
			
			
		} catch (Exception e) {
			e.printStackTrace();;
		}
		
		return 0;
	}


	@Override
	public List<Dependants> getDependants(int employeeId) {
		List<Dependants> result=new ArrayList<>();
		
		dependantsRepository.findById(employeeId).ifPresent(result::add);
	
		return result;
	}


	@Override
	public Integer getDeleteDep(int employeeId) {
		try {
			dependantsRepository.deleteById(employeeId);
			dDao.deleteById(employeeId);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}


	@Override
	public Integer getUpateDep(DependantsRequest req) {
		try {
			Dependants dp=new Dependants(req);
			dp=dependantsRepository.save(dp);
			dp=dDao.save(dp);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}

}
