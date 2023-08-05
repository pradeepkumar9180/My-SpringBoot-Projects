package com.example.demo.restaurantdto;

import java.util.List;

import com.example.demo.entity.MenuItem;

public class FoodMenuResponseDto {
	private String openingTime;
	private String closingTime;
	private List<MenuItem> menuItem;

	public String getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public List<MenuItem> getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(List<MenuItem> menuItem) {
		this.menuItem = menuItem;
	}

	public FoodMenuResponseDto(String openingTime, String closingTime, List<MenuItem> menuItem) {
		super();
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.menuItem = menuItem;
	}

	public FoodMenuResponseDto() {
		super();
	}

}
