package com.wildcards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

}
