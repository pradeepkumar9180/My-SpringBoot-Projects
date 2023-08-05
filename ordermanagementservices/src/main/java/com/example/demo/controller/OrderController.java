

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderRequestDto;
import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping("/order/placeorder")
	public ResponseEntity<Order> placeOrder(@RequestBody OrderRequestDto orderRequestDto) {
		Order order = orderService.placeOrder(orderRequestDto);
		return ResponseEntity.status(HttpStatus.OK).body(order);
	}

	@PutMapping("/order/cancelorder/{orderId}")
	public ResponseEntity<String> cancelOrder(@PathVariable Integer orderId) {
		orderService.cancelOrder(orderId);
		return ResponseEntity.status(HttpStatus.OK).body("Order Cancelled Successfully");
	}

	@GetMapping("/order/getOrderByOrderId/{orderId}")
	public Order getOrderByOrderId(@PathVariable Integer orderId) {
		return orderService.getOrderByOrderId(orderId);
	}
@GetMapping("/order/getOrderAmountByOrderId/{orderId}")
public double getOrderAmountByOrderId(@PathVariable Integer orderId)
{
	return orderService.getOrderAmountByOrderId(orderId);
}
}
