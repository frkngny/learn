package com.daysixhwtwo.demo.business.abstracts;

public interface EmployerCheckService {
	boolean emailVerified();
	boolean emailAlreadyExists();
	boolean isConfirmed();
}
