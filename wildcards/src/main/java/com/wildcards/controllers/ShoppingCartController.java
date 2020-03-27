package com.wildcards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildcards.models.ShoppingCart;
import com.wildcards.models.ShoppingCartItems;
//import com.wildcards.services.OrderService;
import com.wildcards.services.ShoppingCartService;

@RestController
@RequestMapping("shopping_cart")
public class ShoppingCartController {
	
	private ShoppingCartService sc;
	
	@Autowired
	public ShoppingCartController(ShoppingCartService sc) {
		this.sc = sc;
	}
		
	@GetMapping
	public ResponseEntity<List<ShoppingCartItems>> getAllCartItems(){
		return new ResponseEntity(sc.getAllItems(), HttpStatus.OK);
	}
}
