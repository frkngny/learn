package com.daysixhwtwo.demo.business.concretes;

import com.daysixhwtwo.demo.entities.concretes.Employee;
import com.daysixhwtwo.demo.entities.concretes.Employer;
import com.daysixhwtwo.demo.entities.concretes.Personel;

public class BaseUserManager {
	public void save(Personel personel) {
		System.out.println("Saved to db: " + personel.getFirstName());
	}
	
	public void save(Employee employee) {
		System.out.println("Saved to db: " + employee.getFirstName());
	}
	
	public void save(Employer employer) {
		System.out.println("Saved to db: " + employer.getFirstName());
	}
	
	public void userExists() {
		System.out.println("Cannot save the user because user already exists.");
	}
	
	public void invalidTC() {
		System.out.println("Invalid TC no!");
	}
	
	public void cannotSave(String cause) {
		System.out.println("Cannot save the user because " + cause);
	}
	
}
