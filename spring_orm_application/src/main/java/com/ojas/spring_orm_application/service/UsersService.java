package com.ojas.spring_orm_application.service;

import java.util.List;

import com.ojas.spring_orm_application.model.Users;

public interface UsersService {
	public int register(Users user);
	public List<Users>login(String username, String password);
	}

