package com.example.demo.restaurantdto;

import java.util.List;

import com.example.demo.entity.Restaurant;

public class RestaurantResponseDto {
	private List<Restaurant> restaurant;

	public List<Restaurant> getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(List<Restaurant> restaurant) {
		this.restaurant = restaurant;
	}

	public RestaurantResponseDto(List<Restaurant> restaurant) {
		super();
		this.restaurant = restaurant;
	}

	public RestaurantResponseDto() {
		super();
	}

}
