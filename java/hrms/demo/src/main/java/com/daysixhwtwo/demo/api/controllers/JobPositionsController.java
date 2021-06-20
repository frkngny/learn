package com.daysixhwtwo.demo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daysixhwtwo.demo.business.abstracts.JobPositionService;
import com.daysixhwtwo.demo.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job-positions")
public class JobPositionsController {
	@Autowired
	private JobPositionService jobPositionService;
	
	public JobPositionsController() {}
	
	public JobPositionsController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/get-positions")
	public List<JobPosition> getPositions(){
		return this.jobPositionService.getPositions();
	}
	
	@PostMapping("/add-position")
	public void addPosition(@RequestBody JobPosition jobPosition) {
		this.jobPositionService.addPosition(jobPosition);
	}
	
}
