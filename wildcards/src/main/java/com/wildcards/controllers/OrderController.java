package com.wildcards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcards.dtos.LoginCredentials;
import com.wildcards.models.Users;
import com.wildcards.services.OrderService;
import com.wildcards.services.UsersService;


@RestController
@RequestMapping("order")
public class OrderController {

	private OrderService os;
	@Autowired
	public OrderController(OrderService os) {
		this.os = os;
	}
	
}
