package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "food_menu")
public class FoodMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long foodMenuId;
	private String openingTime;
	private String closingTime;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurant_Id_fk", nullable = false)
	private Restaurant restaurant;

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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public FoodMenu(long foodMenuId, String openingTime, String closingTime, Restaurant restaurant) {
		super();
		this.foodMenuId = foodMenuId;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.restaurant = restaurant;
	}

	public FoodMenu() {
		super();
	}

	

}
