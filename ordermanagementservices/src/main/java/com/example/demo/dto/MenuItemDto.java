package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuItemDto {
	private long menuItemId;
	private String itemName;
	private String description;
	private int quantity;
	private double price;
	@JsonProperty("foodMenu")
	private FoodMenuDto foodMenu;
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
	public FoodMenuDto getFoodMenu() {
		return foodMenu;
	}
	public void setFoodMenu(FoodMenuDto foodMenu) {
		this.foodMenu = foodMenu;
	}
	public MenuItemDto(long menuItemId, String itemName, String description, int quantity, double price,
			FoodMenuDto foodMenu) {
		super();
		this.menuItemId = menuItemId;
		this.itemName = itemName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.foodMenu = foodMenu;
	}
	public MenuItemDto() {
		super();
	}
	

}
