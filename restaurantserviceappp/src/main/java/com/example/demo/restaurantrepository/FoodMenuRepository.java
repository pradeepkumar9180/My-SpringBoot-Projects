package com.example.demo.restaurantrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FoodMenu;

public interface FoodMenuRepository extends JpaRepository<FoodMenu, Long> {

}
