package com.daysixhwtwo.demo.business.abstracts;

import java.util.List;

import com.daysixhwtwo.demo.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
	void add(Employee employee);
	
}
