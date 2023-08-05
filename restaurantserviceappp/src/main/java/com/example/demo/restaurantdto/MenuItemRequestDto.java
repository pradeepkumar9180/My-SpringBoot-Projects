package com.example.demo.restaurantdto;

public class MenuItemRequestDto {
	private long menuItemId;
	private long foodMenuId;
	private String itemName;
	private String description;
	private int quantity;
	private double price;
	public long getMenuItemId() {
		return menuItemId;
	}
	public void setMenuItemId(long menuItemId) {
		this.menuItemId = menuItemId;
	}
	public long getFoodMenuId() {
		return foodMenuId;
	}
	public void setFoodMenuId(long foodMenuId) {
		this.foodMenuId = foodMenuId;
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
	public MenuItemRequestDto(long menuItemId, long foodMenuId, String itemName, String description, int quantity,
			double price) {
		super();
		this.menuItemId = menuItemId;
		this.foodMenuId = foodMenuId;
		this.itemName = itemName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	public MenuItemRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
