package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="menu_items")
public class MenuItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long menuItemId;
	private String itemName;
	private String description;
	private int quantity;
	private double price;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "foodMenuId", nullable = false)
	private FoodMenu foodMenu;

	public long getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(long menuItemId) {
		this.menuItemId = menuItemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public FoodMenu getFoodMenu() {
		return foodMenu;
	}

	public void setFoodMenu(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}

	public MenuItem(long menuItemId, String itemName, String description, int quantity, double price,
			FoodMenu foodMenu) {
		super();
		this.menuItemId = menuItemId;
		this.itemName = itemName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.foodMenu = foodMenu;
	}

	public MenuItem() {
		super();
	}

}
