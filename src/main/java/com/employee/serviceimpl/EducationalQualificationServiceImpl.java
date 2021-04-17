package com.employee.serviceimpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee .model.request.EducationalQualificationRequest;
import com.employee .model.db.EducationalQualification;
import com.employee.Service.EducationalQualificationService;
import com.employee.dao.service.EducationalQualificationDao;
import com.employee.data.service.EducationQualificationRepository;


@Service
public class EducationalQualificationServiceImpl implements EducationalQualificationService {
	
	@Autowired
	private EducationalQualificationDao edqDao;
	@Autowired
	private EducationQualificationRepository eduqlfyRepository;
	

	@Override
	@Transactional
	public Integer addDetails(EducationalQualificationRequest edqfy) {
		try {
			EducationalQualification eql=new EducationalQualification (edqfy);
			
			eql=eduqlfyRepository.save(eql);
			eql=edqDao.save(eql);
			return 1;
		} catch (Exception e) {
			
			e.printStackTrace();
			return 0;
		}
		
		
	}


	@Override
	public Optional<EducationalQualification> getAddQulifaction(int employeeId) {
		eduqlfyRepository.findById(employeeId);
		return edqDao.findById(employeeId);
	}


	@Override
	public Integer getDeleteQlfy(int employeeId) {
		try {
			eduqlfyRepository.deleteById(employeeId);
			edqDao.deleteById(employeeId);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return 0;
	}


	@Override
	public Integer getUpdateQlfy(EducationalQualificationRequest req) {
		
		try {
			EducationalQualification uql=new EducationalQualification (req);
			
			uql=eduqlfyRepository.save(uql);
			uql=edqDao.save(uql);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
