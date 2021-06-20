package com.daysixhwtwo.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daysixhwtwo.demo.business.abstracts.EmployerService;
import com.daysixhwtwo.demo.dataAccess.abstracts.EmployerDao;
import com.daysixhwtwo.demo.entities.concretes.Employer;

@Service
public class EmployerManager extends BaseUserManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

	@Override
	public void add(Employer employer) {
		EmployerCheckManager employerCheckManager = new EmployerCheckManager(employer, this.employerDao);
		
		if(employerCheckManager.emailVerified() || employerCheckManager.isConfirmed()) {
			if(!employerCheckManager.emailAlreadyExists()) {
				this.employerDao.save(employer);
				super.save(employer);
			} else {
				super.cannotSave("email already exists.");
			}
		} else {
			super.cannotSave("email needs verification or personel should confirm.");
		}
		
	}

}
