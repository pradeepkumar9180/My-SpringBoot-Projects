package com.example.demo.service;

import com.example.demo.dto.OrderRequestDto;
import com.example.demo.entity.Order;

public interface OrderService {

	Order placeOrder(OrderRequestDto orderRequestDto);

	String cancelOrder(Integer orderId);

	Order getOrderByOrderId(Integer orderId);

	double getOrderAmountByOrderId(Integer orderId);

}
