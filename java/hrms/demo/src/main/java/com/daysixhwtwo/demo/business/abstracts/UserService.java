package com.daysixhwtwo.demo.business.abstracts;

import java.util.List;

import com.daysixhwtwo.demo.entities.concretes.User;

public interface UserService {
	List<User> getAll();
	void add(User user);
}
