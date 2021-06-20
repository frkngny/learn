package com.daysixhwtwo.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daysixhwtwo.demo.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
