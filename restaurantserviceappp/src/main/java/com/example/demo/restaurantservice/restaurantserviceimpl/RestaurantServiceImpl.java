package com.example.demo.restaurantservice.restaurantserviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FoodMenu;
import com.example.demo.entity.Restaurant;
import com.example.demo.restaurantdto.RestaurantRequestDto;
import com.example.demo.restaurantdto.RestaurantResponseDto;
import com.example.demo.restaurantrepository.RestaurantRepository;
import com.example.demo.restaurantservice.FoodMenuService;
import com.example.demo.restaurantservice.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;
	@Autowired
	private FoodMenuService foodMenuService;

	@Override
	public ResponseEntity<String> addRestaurant(RestaurantRequestDto restaurantRequestDto) {
		Restaurant restaurant = new Restaurant();
		restaurant.setName(restaurantRequestDto.getName());
		restaurant.setLocation(restaurantRequestDto.getLocation());
		restaurant.setCuisine(restaurantRequestDto.getCuisine());
		restaurant.setDistance(restaurantRequestDto.getDistance());
		restaurant.setBudget(restaurantRequestDto.getBudget());
		Restaurant savedRestaurant = restaurantRepository.save(restaurant);
		FoodMenu foodMenu = new FoodMenu();
		foodMenu.setClosingTime(restaurantRequestDto.getClosingTime());
		foodMenu.setOpeningTime(restaurantRequestDto.getOpeningTime());
		foodMenu.setRestaurant(savedRestaurant);
		foodMenuService.addFoodMenu(foodMenu);
		return ResponseEntity.status(HttpStatus.CREATED).body("Restaurant Details Successfully Saved");
	}

	@Override
	public Restaurant getByRestaurantId(Long restaurantId) {
		Optional<Restaurant> restaurant = restaurantRepository.findById(restaurantId);
		if (restaurant.isPresent()) {
			return restaurant.get();

		}
		return null;

	}

	@Override
	public RestaurantResponseDto findByName(String name) {
		List<Restaurant> restaurants = restaurantRepository.findByName(name);
		return new RestaurantResponseDto(restaurants);
	}

	@Override
	public RestaurantResponseDto findByLocation(String location) {
		List<Restaurant> restaurants = restaurantRepository.findByLocation(location);
		return new RestaurantResponseDto(restaurants);
	}

	@Override
	public RestaurantResponseDto findByCuisine(String cuisine) {
		List<Restaurant> restaurants = restaurantRepository.findByCuisine(cuisine);
		return new RestaurantResponseDto(restaurants);
	}

	@Override
	public RestaurantResponseDto findByDistance(Double distance) {
		List<Restaurant> restaurants = restaurantRepository.findByDistance(distance);
		return new RestaurantResponseDto(restaurants);
	}

	@Override
	public RestaurantResponseDto findByBudget(Double budget) {
		List<Restaurant>restaurants=restaurantRepository.findByBudget(budget);
		return new RestaurantResponseDto(restaurants);
	}

}
