package com.example.demo.restaurantservice.restaurantserviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FoodMenu;
import com.example.demo.restaurantrepository.FoodMenuRepository;
import com.example.demo.restaurantservice.FoodMenuService;
@Service
public class FoodMenuServiceImpl implements FoodMenuService{
	@Autowired
	private FoodMenuRepository foodMenuRepository;

	@Override
	public void addFoodMenu(FoodMenu foodMenu) {
		foodMenuRepository.save(foodMenu);
	}

	@Override
	public Optional<FoodMenu> getByFoodMenuId(Long foodMenuId) {
		return foodMenuRepository.findById(foodMenuId);
	}

}
