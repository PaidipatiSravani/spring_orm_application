package com.ojas.spring_orm_application.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.spring_orm_application.dao.UsersDAO;
import com.ojas.spring_orm_application.model.Users;
import com.ojas.spring_orm_application.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDAO dao;

	@Override
	public int register(Users user) {
		return dao.register(user);
	}

	@Override
	public List<Users> login(String username, String password) {
		// TODO Auto-generated method stub
		return dao.login(username, password);
	}

}
