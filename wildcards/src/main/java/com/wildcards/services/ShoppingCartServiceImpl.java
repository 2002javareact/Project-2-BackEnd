package com.wildcards.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildcards.dao.ShoppingCartDao;
import com.wildcards.dao.ShoppingCartItemsDao;
import com.wildcards.models.ShoppingCart;
import com.wildcards.models.ShoppingCartItems;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	
	private ShoppingCartDao scd;
	private ShoppingCartItemsDao id;

	@Autowired
	public ShoppingCartServiceImpl(ShoppingCartDao scd, ShoppingCartItemsDao id) {
		this.scd = scd;
		this.id = id;
	}

	@Override
	public List<ShoppingCartItems> getAllItems() {
		return id.findAll();
	}
	
}
