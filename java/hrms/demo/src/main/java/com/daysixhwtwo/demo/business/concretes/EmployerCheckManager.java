package com.daysixhwtwo.demo.business.concretes;

import java.util.List;

import com.daysixhwtwo.demo.business.abstracts.EmployerCheckService;
import com.daysixhwtwo.demo.dataAccess.abstracts.EmployerDao;
import com.daysixhwtwo.demo.entities.concretes.Employer;

public class EmployerCheckManager implements EmployerCheckService{
	
	private Employer employer;
	private EmployerDao employerDao;
	
	public EmployerCheckManager() {}
	
	public EmployerCheckManager(Employer employer, EmployerDao employerDao) {
		this.employer = employer;
		this.employerDao = employerDao;
	}

	@Override
	public boolean emailVerified() {
		return true;
	}

	@Override
	public boolean emailAlreadyExists() {
		List<Employer> employerList = this.employerDao.findAll();
		
		boolean exists = false;
		for(Employer eachEmployer : employerList) {
			if(this.employer.getEmail().equals(eachEmployer.getEmail())) {
				exists = true;
				break;
			}
		}
		
		return exists;
	}

	@Override
	public boolean isConfirmed() {
		return true;
	}

}
