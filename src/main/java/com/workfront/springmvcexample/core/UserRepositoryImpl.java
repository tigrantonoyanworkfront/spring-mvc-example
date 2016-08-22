package com.workfront.springmvcexample.core;

import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository{

	@Override
	public User getById(String id) {
		User user = new User();
		user.setId(id);
		user.setName("Gago");
		return user;
	}
}
