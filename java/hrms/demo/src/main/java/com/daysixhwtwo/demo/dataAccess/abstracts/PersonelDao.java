package com.daysixhwtwo.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daysixhwtwo.demo.entities.concretes.Personel;

public interface PersonelDao extends JpaRepository<Personel, Integer>{

}
