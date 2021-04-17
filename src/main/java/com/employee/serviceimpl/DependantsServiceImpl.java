package com.employee.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Optional<Dependants> getDependants(int employeeId) {
		dependantsRepository.findById(employeeId);
		return dDao.findById(employeeId );
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
