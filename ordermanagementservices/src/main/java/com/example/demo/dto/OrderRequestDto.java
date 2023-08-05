package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.OrderedItem;

public class OrderRequestDto {
	private int orderId;
	private int customerId;
	private int restaurantId;
	private List<OrderedItemRequestDto> orderItems;
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
	public List<OrderedItemRequestDto> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderedItemRequestDto> orderItems) {
		this.orderItems = orderItems;
	}
	public OrderRequestDto(int orderId, int customerId, int restaurantId, List<OrderedItemRequestDto> orderItems) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.orderItems = orderItems;
	}
	public OrderRequestDto() {
		super();
	}


}
