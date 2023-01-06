package com.ojas.spring_orm_application.dao;

import java.util.List;

import com.ojas.spring_orm_application.model.Users;

public interface UsersDAO {

	public Users register(Users users);

	public List<Users> logIn(String userName, String password);

}
