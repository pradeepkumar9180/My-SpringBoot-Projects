package com.example.demo.restaurantcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MenuItem;
import com.example.demo.restaurantdto.MenuItemRequestDto;
import com.example.demo.restaurantservice.MenuItemService;

@RestController
public class MenuItemController {
	@Autowired
	private MenuItemService menuItemService;
	@PostMapping("/restaurant/menuitem/add")
	public ResponseEntity<String> addMenuItem(@RequestBody MenuItemRequestDto menuItemRequestDto)
	{
		menuItemService.saveMenuItem(menuItemRequestDto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Item Added Successfully");
	}

	@GetMapping("/restaurant/menuitem/getById/{menuItemId}")
public MenuItem getByMenuItemId(@PathVariable Long menuItemId)
{
	return menuItemService.getByMenuItemId(menuItemId);
}
@PutMapping("/restaurant/menuitem/updatebyid/{menuItemId}/{quantity}")
public ResponseEntity<String> updateQuantity(@PathVariable Long menuItemId,@ PathVariable int quantity){
	menuItemService.updateQuantity(menuItemId,quantity);
	return ResponseEntity.status(HttpStatus.OK).body("item Updated Successfully");
	
}

}
