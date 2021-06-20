package com.daysixhwtwo.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daysixhwtwo.demo.business.abstracts.PersonelService;
import com.daysixhwtwo.demo.dataAccess.abstracts.PersonelDao;
import com.daysixhwtwo.demo.entities.concretes.Personel;

@Service
public class PersonelManager extends BaseUserManager implements PersonelService {
	
	private PersonelDao personelDao;
	
	@Autowired
	public PersonelManager(PersonelDao personelDao) {
		this.personelDao = personelDao;
	}
	
	@Override
	public List<Personel> getAll() {
		return this.personelDao.findAll();
	}

	@Override
	public void add(Personel personel) {
		this.personelDao.save(personel);
	}
	
}
