package com.wildcards.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildcards.dao.OrderDao;
import com.wildcards.models.Order;
@Service
public class OrderServiceImpl implements OrderService {
	
	 private OrderDao od;
	 @Autowired
	public OrderServiceImpl(OrderDao od) {
		 this.od=od;
	 }

}
