package com.wildcards.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ShoppingCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int cartId;
	
	@OneToOne(mappedBy = "shoppingCart", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JsonBackReference
	private Users u;
	
	
	@Column
	private int totalItems;
	
	@Column
	private int totalPrice;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Users getU() {
		return u;
	}

	public void setU(Users u) {
		this.u = u;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cartId;
		result = prime * result + totalItems;
		result = prime * result + totalPrice;
		result = prime * result + ((u == null) ? 0 : u.hashCode());
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
		ShoppingCart other = (ShoppingCart) obj;
		if (cartId != other.cartId)
			return false;
		if (totalItems != other.totalItems)
			return false;
		if (totalPrice != other.totalPrice)
			return false;
		if (u == null) {
			if (other.u != null)
				return false;
		} else if (!u.equals(other.u))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ShoppingCart [cartId=" + cartId + ", u=" + u + ", totalItems=" + totalItems + ", totalPrice="
				+ totalPrice + "]";
	}

	public ShoppingCart(int cartId, Users u, int totalItems, int totalPrice) {
		super();
		this.cartId = cartId;
		this.u = u;
		this.totalItems = totalItems;
		this.totalPrice = totalPrice;
	}

	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
