package com.wildcards.services;

import com.wildcards.models.Order;

public interface OrderService {

  public Order createNewOrder(Order o);

  public Order updateOrder(Order o);

  public Order getOrderByID(int id);

}
