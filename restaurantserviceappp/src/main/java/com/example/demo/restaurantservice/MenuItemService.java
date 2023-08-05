package com.example.demo.restaurantservice;

import com.example.demo.entity.MenuItem;
import com.example.demo.restaurantdto.MenuItemRequestDto;

public interface MenuItemService {

	MenuItem saveMenuItem(MenuItemRequestDto menuItemRequestDto);

	MenuItem getByMenuItemId(Long menuItemId);

    MenuItem updateQuantity(Long menuItemId, int quantity);

}
