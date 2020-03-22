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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PaymentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paymentInfo_id")
	private int paymentInfoId;
	
	@OneToOne(mappedBy = "pi", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JsonBackReference
	private Users u;
	
	@Column
	private String billingAddress;
	
	@Column
	private String cardNumber;

}
