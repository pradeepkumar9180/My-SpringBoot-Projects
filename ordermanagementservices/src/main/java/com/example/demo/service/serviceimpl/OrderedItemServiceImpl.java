package com.example.demo.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderedItem;
import com.example.demo.repository.OrderedItemRepository;
import com.example.demo.service.OrderedItemService;

@Service
public class OrderedItemServiceImpl implements OrderedItemService{
	@Autowired
	private OrderedItemRepository orderedItemRepository;

	@Override
	public OrderedItem saveItem(OrderedItem orderedItem) {
		return orderedItemRepository.save(orderedItem) ;
	}

	@Override
	public List<OrderedItem> findByOrderedItemId(Integer orderId) {
		return orderedItemRepository.findByOrderOrderId(orderId);
		}

}
