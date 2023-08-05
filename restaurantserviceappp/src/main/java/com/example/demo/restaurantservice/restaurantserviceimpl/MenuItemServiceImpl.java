package com.example.demo.restaurantservice.restaurantserviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FoodMenu;
import com.example.demo.entity.MenuItem;
import com.example.demo.restaurantdto.MenuItemRequestDto;
import com.example.demo.restaurantrepository.MenuItemRepository;
import com.example.demo.restaurantservice.FoodMenuService;
import com.example.demo.restaurantservice.MenuItemService;

@Service
public class MenuItemServiceImpl implements MenuItemService {
	@Autowired
	private MenuItemRepository menuItemRepository;
	@Autowired
	private FoodMenuService foodMenuService;

	@Override
	public MenuItem saveMenuItem(MenuItemRequestDto menuItemRequestDto) {
		Optional<FoodMenu> foodMenu=foodMenuService.getByFoodMenuId(menuItemRequestDto.getFoodMenuId());
		if(foodMenu.isPresent())
		{
			FoodMenu savedFoodMemu=foodMenu.get();
			MenuItem menuItem=new MenuItem();
			menuItem.setItemName(menuItemRequestDto.getItemName());
			menuItem.setDescription(menuItemRequestDto.getDescription());
			menuItem.setQuantity(menuItemRequestDto.getQuantity());
			menuItem.setPrice(menuItemRequestDto.getPrice());
			menuItem.setFoodMenu(savedFoodMemu);
			return menuItemRepository.save(menuItem);	

		}

		return null;
	}

	@Override
	public MenuItem getByMenuItemId(Long menuItemId) {
		Optional<MenuItem> menuItem= menuItemRepository.findById(menuItemId);
		if(menuItem.isPresent())
		{
			return menuItem.get();
		}
		return null;
	}

	@Override
	public MenuItem updateQuantity(Long menuItemId, int quantity) {
		Optional<MenuItem>menuItem=menuItemRepository.findById(menuItemId);
		if(menuItem.isPresent())
		{
			MenuItem updateQuantity=menuItem.get();
			updateQuantity.setQuantity(menuItem.get().getQuantity()+quantity);
			menuItemRepository.save(updateQuantity);
			return updateQuantity;
			
		}
		return null;
	}
}
