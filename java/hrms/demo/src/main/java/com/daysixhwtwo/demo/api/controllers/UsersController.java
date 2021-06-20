package com.daysixhwtwo.demo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daysixhwtwo.demo.business.abstracts.EmployeeService;
import com.daysixhwtwo.demo.business.abstracts.EmployerService;
import com.daysixhwtwo.demo.business.abstracts.PersonelService;
import com.daysixhwtwo.demo.entities.concretes.Employee;
import com.daysixhwtwo.demo.entities.concretes.Employer;
import com.daysixhwtwo.demo.entities.concretes.Personel;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	private PersonelService personelService;
	
	@Autowired
	private EmployerService employerService;
	
	@Autowired
	private EmployeeService employeeService;
	
	
	public UsersController() {}
	
	
	public UsersController(PersonelService personelService) {
		this.personelService = personelService;
	}
	
	
	public UsersController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	
	public UsersController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	@GetMapping("/getallpersonel")
	public List<Personel> getAllPersonel() {
		return this.personelService.getAll();
	}
	
	@GetMapping("/getallemployer")
	public List<Employer> getAllEmployer() {
		return this.employerService.getAll();
	}
	
	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployee() {
		return this.employeeService.getAll();
	}
	
	@PostMapping("/addPersonel")
	public void addPersonel(@RequestBody Personel personel) {
		this.personelService.add(personel);
	}
	
	@PostMapping("/addEmployer")
	public void addEmployer(@RequestBody Employer employer) {
		this.employerService.add(employer);
	}
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee employee) {
		this.employeeService.add(employee);
	}
	
	

}
