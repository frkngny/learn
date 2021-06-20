package com.daysixhwtwo.demo.business.abstracts;

import java.util.List;

import com.daysixhwtwo.demo.entities.concretes.Personel;

public interface PersonelService {
	List<Personel> getAll();
	void add(Personel personel);
}
