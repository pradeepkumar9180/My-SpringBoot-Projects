package com.example.demo.restaurantservice;

import java.util.Optional;

import com.example.demo.entity.FoodMenu;
import com.example.demo.restaurantdto.RestaurantResponseDto;

public interface FoodMenuService {

	void addFoodMenu(FoodMenu foodMenu);

	Optional<FoodMenu> getByFoodMenuId(Long foodMenuId);



}
