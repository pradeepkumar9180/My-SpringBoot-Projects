package com.example.demo.restaurantcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Restaurant;
import com.example.demo.restaurantdto.RestaurantRequestDto;
import com.example.demo.restaurantdto.RestaurantResponseDto;
import com.example.demo.restaurantservice.FoodMenuService;
import com.example.demo.restaurantservice.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@Autowired
	private FoodMenuService foodMenuService;

	@PostMapping("/restaurant/add")
	public ResponseEntity<String> addRestaurant(@RequestBody RestaurantRequestDto restaurantRequestDto) {
		restaurantService.addRestaurant(restaurantRequestDto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Restaurant Details Successfully Saved");

	}

	@GetMapping("/restaurant/getByRestaurantId/{restaurantId}")
	public Restaurant getByRestaurantId(@PathVariable Long restaurantId) {
		return restaurantService.getByRestaurantId(restaurantId);

	}

	@GetMapping("/restaurant/getByName/{name}")
	public ResponseEntity<RestaurantResponseDto> getByName(@PathVariable String name) {
		RestaurantResponseDto restaurantResponseDto = restaurantService.findByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(restaurantResponseDto);
	}

	@GetMapping("/restaurant/getByLocation/{location}")
	public ResponseEntity<RestaurantResponseDto> getByLocation(@PathVariable String location) {
		RestaurantResponseDto restaurantResponseDto = restaurantService.findByLocation(location);
		return ResponseEntity.status(HttpStatus.OK).body(restaurantResponseDto);
	}
	@GetMapping("/restaurant/getByCuisine/{cuisine}")
	public ResponseEntity<RestaurantResponseDto> getByCuisine(@PathVariable String cuisine)
	{
		RestaurantResponseDto restaurantResponseDto=restaurantService.findByCuisine(cuisine);
		return ResponseEntity.status(HttpStatus.OK).body(restaurantResponseDto);
	}
	@GetMapping("/restaurant/getByDistance/{distance}")
	public ResponseEntity<RestaurantResponseDto> getByDistance(@PathVariable Double distance)
	{
	RestaurantResponseDto restaurantResponseDto=restaurantService.findByDistance(distance);
		return ResponseEntity.status(HttpStatus.OK).body(restaurantResponseDto);
	}
	
	@GetMapping("/restaurant/getByBudget/{budget}")
	public ResponseEntity<RestaurantResponseDto> getByBudget(@PathVariable Double budget)
	{
		RestaurantResponseDto restaurantResponseDto=restaurantService.findByBudget(budget);
		return ResponseEntity.status(HttpStatus.OK).body(restaurantResponseDto);
	}

}
