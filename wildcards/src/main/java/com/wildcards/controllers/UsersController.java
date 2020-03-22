package com.wildcards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcards.models.Users;
import com.wildcards.services.UsersService;

@RestController
@RequestMapping("users")
public class UsersController {
	
	private UsersService us;
	
	@Autowired
	public UsersController(UsersService us) {
		this.us = us;
	}
	
	//LIST USERS
	@GetMapping
	public ResponseEntity<List<Users>> getAllUsers(){
		
		return new ResponseEntity(us.getAllUsers(), HttpStatus.OK);
	}
	
	//CREATE A USERS
	@PostMapping// this matches post key word
	public ResponseEntity<Users> createUsers(@RequestBody Users u){// will try and turn the body into the object type on its right
		if(u.getUserId() != 0) {
			return new ResponseEntity("userId must be 0", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Users>(us.createUsers(u), HttpStatus.CREATED);
	}
	

}
