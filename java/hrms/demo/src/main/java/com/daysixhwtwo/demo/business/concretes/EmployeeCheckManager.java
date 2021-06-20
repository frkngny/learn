package com.daysixhwtwo.demo.business.concretes;

import java.util.List;

import com.daysixhwtwo.demo.business.abstracts.EmployeeCheckService;
import com.daysixhwtwo.demo.dataAccess.abstracts.EmployeeDao;
import com.daysixhwtwo.demo.entities.concretes.Employee;

public class EmployeeCheckManager implements EmployeeCheckService {
	
	private Employee employee;
	private EmployeeDao employeeDao;
	
	public EmployeeCheckManager() {}
	
	public EmployeeCheckManager(Employee employee, EmployeeDao employeeDao) {
		this.employee = employee;
		this.employeeDao = employeeDao;
	}
	
	@Override
	public boolean checkIfReal() {
		return true;
	}

	@Override
	public boolean checkIfAlreadyExists() {
		List<Employee> employees = this.employeeDao.findAll();
		
		boolean exists = false;
		for(Employee eachEmployee : employees) {
			if(this.employee.getTcno() == eachEmployee.getTcno() || this.employee.getEmail().equals(eachEmployee.getEmail())) {
				exists = true;
				break;
			}
		}
		
		return exists;
	}

	@Override
	public boolean emailVerified() {
		return true;
	}
}
