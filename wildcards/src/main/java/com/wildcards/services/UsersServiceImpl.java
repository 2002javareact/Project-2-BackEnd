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
	

	@Override
	public Users getUserByID(int id) {
		// TODO Auto-generated method stub
		return ud.getOne(id);
	}

	@Override
	public Users updateUsers(Users u) {
		// TODO Auto-generated method stub
		Users previousUser = ud.getOne(u.getUserId());
		if(u.getFirstName() != null) {
			previousUser.setFirstName(u.getFirstName());
		}
		if(u.getLastName() != null) {
			previousUser.setLastName(u.getLastName());
		}
		if(u.getUsername() != null) {
			previousUser.setUsername(u.getUsername());
		}
		if(u.getPassword() != null) {
			previousUser.setPassword(u.getPassword());
		}
		
		if(u.getEmail() != null) {
			previousUser.setEmail(u.getEmail());
		}
		return previousUser;
	}

	
	


}
