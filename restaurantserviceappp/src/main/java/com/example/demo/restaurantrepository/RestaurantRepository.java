package com.example.demo.restaurantrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

	List<Restaurant> findByName(String name);

	List<Restaurant> findByLocation(String location);

	List<Restaurant> findByCuisine(String cuisine);

	List<Restaurant> findByDistance(Double distance);


	List<Restaurant> findByBudget(Double budget);

//	@Query("FROM Restaurant r WHERE r.name = ?1")
//	List<Restaurant> getAllResturantsByName(String name);
//	
//	@Query("FROM Restaurant r WHERE r.name = :name")
//	List<Restaurant> getResturantsByName( @Param("name") String name);
}
