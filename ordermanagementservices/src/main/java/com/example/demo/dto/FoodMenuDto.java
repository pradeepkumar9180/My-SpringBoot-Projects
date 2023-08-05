package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FoodMenuDto {
	private long foodMenuId;
	private String openingTime;
	private String closingTime;
	@JsonProperty("restaurantDto")
	private RestaurantDto restaurantDto;

	public long getFoodMenuId() {
		return foodMenuId;
	}

	public void setFoodMenuId(long foodMenuId) {
		this.foodMenuId = foodMenuId;
	}

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

	public RestaurantDto getRestaurantDto() {
		return restaurantDto;
	}

	public void setRestaurantDto(RestaurantDto restaurantDto) {
		this.restaurantDto = restaurantDto;
	}

	public FoodMenuDto(long foodMenuId, String openingTime, String closingTime, RestaurantDto restaurantDto) {
		super();
		this.foodMenuId = foodMenuId;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.restaurantDto = restaurantDto;
	}

	public FoodMenuDto() {
		super();
	}

}
