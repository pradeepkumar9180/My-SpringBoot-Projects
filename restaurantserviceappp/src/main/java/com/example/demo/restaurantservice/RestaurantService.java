package com.example.demo.restaurantservice;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Restaurant;
import com.example.demo.restaurantdto.RestaurantRequestDto;
import com.example.demo.restaurantdto.RestaurantResponseDto;

public interface RestaurantService {

	ResponseEntity<String> addRestaurant(RestaurantRequestDto restaurantRequestDto);

	Restaurant getByRestaurantId(Long restaurantId);

	RestaurantResponseDto findByName(String name);

	RestaurantResponseDto findByLocation(String location);

	RestaurantResponseDto findByCuisine(String cuisine);

	RestaurantResponseDto findByDistance(Double distance);

	RestaurantResponseDto findByBudget(Double budget);

}
