package com.wildcards.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcards.models.ShoppingCartItems;

public interface ShoppingCartItemsDao extends JpaRepository<ShoppingCartItems, Integer>{

}
