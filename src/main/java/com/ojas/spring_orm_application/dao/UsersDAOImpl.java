package com.ojas.spring_orm_application.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ojas.spring_orm_application.model.Users;
@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public Users register(Users users) {
		
		return (Users) hibernateTemplate.save(users);
	}

	@Override
	public List<Users> logIn(String userName, String password) {
		String query = "select u.type from Users u where u.userName=?0 and u.password=?1";
		System.out.println("userdaoimpl"+userName+""+password);
		Object[] queryparam = {userName,password};
		return (List<Users>) hibernateTemplate.find(query,queryparam);

	}

}
