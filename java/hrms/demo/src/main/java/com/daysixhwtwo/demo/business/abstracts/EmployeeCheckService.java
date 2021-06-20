package com.daysixhwtwo.demo.business.abstracts;


public interface EmployeeCheckService {
	boolean checkIfReal();
	boolean checkIfAlreadyExists();
	boolean emailVerified();
}
