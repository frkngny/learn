package com.daysixhwtwo.demo.business.abstracts;

import java.util.List;

import com.daysixhwtwo.demo.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
	void add(Employer employer);
}
