package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordered_items")
public class OrderedItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderedItemId;
	private String name;
	private int quantity;
	private double price;
	private int itemId;

	@ManyToOne
	private Order order;

	public int getOrderedItemId() {
		return orderedItemId;
	}

	public void setOrderedItemId(int orderedItemId) {
		this.orderedItemId = orderedItemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderedItem(int orderedItemId, String name, int quantity, double price, int itemId, Order order) {
		super();
		this.orderedItemId = orderedItemId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.itemId = itemId;
		this.order = order;
	}

	public OrderedItem() {
		super();
	}

}
