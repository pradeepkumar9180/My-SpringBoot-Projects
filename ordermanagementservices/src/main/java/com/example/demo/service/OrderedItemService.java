package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OrderedItem;

public interface OrderedItemService {

	OrderedItem saveItem(OrderedItem orderedItem);

	List<OrderedItem> findByOrderedItemId(Integer orderId);

}
