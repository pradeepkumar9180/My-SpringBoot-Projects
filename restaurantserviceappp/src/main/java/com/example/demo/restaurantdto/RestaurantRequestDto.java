package com.example.demo.restaurantdto;

public class RestaurantRequestDto {
	private String name;
	private String location;
	private String cuisine;
	private double distance;
	private double budget;
	private String openingTime;
	private String closingTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
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

	public RestaurantRequestDto(long restaurantId, String name, String location, String cuisine, double distance,
			double budget, long foodMenuId, String openingTime, String closingTime) {
		super();
		this.name = name;
		this.location = location;
		this.cuisine = cuisine;
		this.distance = distance;
		this.budget = budget;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public RestaurantRequestDto() {
		super();
	}

}
