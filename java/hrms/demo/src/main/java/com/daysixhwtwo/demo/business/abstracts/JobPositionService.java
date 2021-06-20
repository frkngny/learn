package com.daysixhwtwo.demo.business.abstracts;

import java.util.List;

import com.daysixhwtwo.demo.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getPositions();
	void addPosition(JobPosition jobPosition);
}
