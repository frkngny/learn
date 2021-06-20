package com.daysixhwtwo.demo.business.concretes;

import java.util.List;

import com.daysixhwtwo.demo.business.abstracts.JobPositionCheckService;
import com.daysixhwtwo.demo.dataAccess.abstracts.JobPositionDao;
import com.daysixhwtwo.demo.entities.concretes.JobPosition;

public class JobPositionCheckManager implements JobPositionCheckService{
	
	private JobPosition jobPosition;
	private JobPositionDao jobPositionDao;
	
	public JobPositionCheckManager() {}
	
	public JobPositionCheckManager(JobPosition jobPosition, JobPositionDao jobPositionDao) {
		this.jobPosition = jobPosition;
		this.jobPositionDao = jobPositionDao;
	}
	
	@Override
	public boolean positionAlreadyExists() {
		List<JobPosition> jobPositions = this.jobPositionDao.findAll();
		
		boolean exists = false;
		for(JobPosition position : jobPositions) {
			if(this.jobPosition.getJobPosition().equals(position.getJobPosition())) {
				exists = true;
				break;
			}
		}
		return exists;
	}

}
