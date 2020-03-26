package com.wildcards.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
// @Table(name = "order_items")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class OrderItems {

  // composite key for orderItems table
  @EmbeddedId
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // @Column(name = "order_items_id")
  private OrderItemsId orderItemsId;

  // have many to one with the other two models (Order and Items)
  @ManyToOne
  @JoinColumn(name = "Order", referencedColumnName = "order_id")
  @JsonBackReference
  public Order order;

  @ManyToOne
  @JoinColumn(name = "Item", referencedColumnName = "item_id")
  @JsonBackReference
  public Inventory item;

  @Column
  private int quantity;

  @Column
  private int price;

  public OrderItemsId getOrderItemsId() {
    return orderItemsId;
  }

  public void setOrderItemsId(OrderItemsId orderItemsId) {
    this.orderItemsId = orderItemsId;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Inventory getItem() {
    return item;
  }

  public void setItem(Inventory item) {
    this.item = item;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((item == null) ? 0 : item.hashCode());
    result = prime * result + ((order == null) ? 0 : order.hashCode());
    result = prime * result + ((orderItemsId == null) ? 0 : orderItemsId.hashCode());
    result = prime * result + price;
    result = prime * result + quantity;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    OrderItems other = (OrderItems) obj;
    if (item == null) {
      if (other.item != null)
        return false;
    } else if (!item.equals(other.item))
      return false;
    if (order == null) {
      if (other.order != null)
        return false;
    } else if (!order.equals(other.order))
      return false;
    if (orderItemsId == null) {
      if (other.orderItemsId != null)
        return false;
    } else if (!orderItemsId.equals(other.orderItemsId))
      return false;
    if (price != other.price)
      return false;
    if (quantity != other.quantity)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "OrderItems [item=" + item + ", order=" + order + ", orderItemsId=" + orderItemsId + ", price=" + price
        + ", quantity=" + quantity + "]";
  }

  public OrderItems(OrderItemsId orderItemsId, Order order, Inventory item, int quantity, int price) {
    this.orderItemsId = orderItemsId;
    this.order = order;
    this.item = item;
    this.quantity = quantity;
    this.price = price;
  }

  public OrderItems() {
  }

}
