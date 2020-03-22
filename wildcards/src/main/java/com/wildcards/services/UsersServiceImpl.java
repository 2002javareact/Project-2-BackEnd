package com.wildcards.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildcards.dao.UsersDao;
import com.wildcards.models.Users;

@Service
public class UsersServiceImpl implements UsersService {
	
	private UsersDao ud;
	
	@Autowired
	public UsersServiceImpl(UsersDao ud) {
		this.ud = ud;
	}	
	
	@Override
	public List<Users> getAllUsers() {
		return ud.findAll();
	}

	@Override
	public Users createUsers(Users u) {
		// TODO Auto-generated method stub
		return ud.save(u);
	}
	


}
