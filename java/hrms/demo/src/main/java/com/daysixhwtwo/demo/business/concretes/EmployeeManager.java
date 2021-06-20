package com.daysixhwtwo.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daysixhwtwo.demo.business.abstracts.EmployeeService;
import com.daysixhwtwo.demo.dataAccess.abstracts.EmployeeDao;
import com.daysixhwtwo.demo.entities.concretes.Employee;

@Service
public class EmployeeManager extends BaseUserManager implements EmployeeService  {
	
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public List<Employee> getAll() {
		return this.employeeDao.findAll();
	}
	
	@Override
	public void add(Employee employee) {
		EmployeeCheckManager employeeCheckManager = new EmployeeCheckManager(employee, this.employeeDao);
		if(employeeCheckManager.checkIfReal()) {
			if(!employeeCheckManager.checkIfAlreadyExists() && employeeCheckManager.emailVerified()) {
				this.employeeDao.save(employee);
				super.save(employee);
			} else {
				super.userExists();
			}
		} else {
			super.invalidTC();
		}
	}

	
		

}
