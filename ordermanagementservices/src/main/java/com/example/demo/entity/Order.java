package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private int customerId;
	private int restaurantId;
	private double totalPrice;
	private String status;
	
	@OneToMany(mappedBy="order",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<OrderedItem> orderItems;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<OrderedItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderedItem> orderItems) {
		this.orderItems = orderItems;
	}
	public Order(int orderId, int customerId, int restaurantId, double totalPrice, String status,
			List<OrderedItem> orderItems) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.totalPrice = totalPrice;
		this.status = status;
		this.orderItems = orderItems;
	}
	public Order() {
		super();
	}

	

}
