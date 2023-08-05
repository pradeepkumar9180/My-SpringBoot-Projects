package com.example.demo.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import com.example.demo.dto.MenuItemDto;
import com.example.demo.dto.OrderRequestDto;
import com.example.demo.dto.OrderedItemRequestDto;
import com.example.demo.entity.Order;
import com.example.demo.entity.OrderedItem;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;
import com.example.demo.service.OrderedItemService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class OrderServiceImpl implements OrderService {
	//without using cloud gateway
//	private static final String ENDPOINT_URL = "http://RESTAURANT-SEARCH-SERVICE/menuitem/getById/";
//	private static final String PAYMENT_ENDPOINT_URL = "http://PAYMENT-SERVICE/payments/makepayment";
	private static final String ENDPOINT_URL = "http://API-GATEWAY/restaurant/menuitem/getById/";
	private static final String PAYMENT_ENDPOINT_URL = "http://API-GATEWAY/payments/makepayment";

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderedItemService orderedItemService;

	@Autowired(required = true)
	RestOperations restTemplate;

	@Override
	@CircuitBreaker(name="restaurantService")
	public Order placeOrder(OrderRequestDto orderRequestDto) {
		double totalPrice = 0;
		Order order = new Order();
		order.setOrderId(orderRequestDto.getOrderId());
		order.setCustomerId(orderRequestDto.getCustomerId());
		order.setRestaurantId(orderRequestDto.getRestaurantId());
		order.setStatus("created");
		order.setTotalPrice(totalPrice);
		orderRepository.save(order);
		List<OrderedItemRequestDto> orderItems = orderRequestDto.getOrderItems();

		for (OrderedItemRequestDto items : orderItems) {
			MenuItemDto menuItemDto = restTemplate.getForObject(ENDPOINT_URL + items.getItemId(), MenuItemDto.class);
			totalPrice = totalPrice + (menuItemDto.getPrice() * items.getQuantity());
			OrderedItem orderedItem = new OrderedItem();
			orderedItem.setName(menuItemDto.getItemName());
			orderedItem.setQuantity(menuItemDto.getQuantity());
			orderedItem.setPrice(menuItemDto.getPrice());
			orderedItem.setOrder(order);
			orderedItem.setItemId((int) menuItemDto.getMenuItemId());
			orderedItemService.saveItem(orderedItem);

		}
		order.setTotalPrice(totalPrice);
		orderRepository.save(order);
		order.getOrderId();

//		PaymentDto payments = new PaymentDto();
//		payments.setPaymentId((long) 1);
//		payments.setAmount(order.getTotalPrice());
//		payments.setPaymentMethod("G-PAY");
//		payments.setOrderId((long) order.getOrderId());
//		payments.setCustomerId((long) order.getCustomerId());
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		
//		HttpEntity<PaymentDto> paymentRequest = new HttpEntity<PaymentDto>(payments,headers);
//		ResponseEntity<String> paymentResponse = restTemplate.exchange(PAYMENT_ENDPOINT_URL, HttpMethod.POST, paymentRequest, String.class);
//		paymentResponse.getBody();
//        System.out.println(paymentResponse.getBody());
		return null;
	}

	@Override
	public String cancelOrder(Integer orderId) {
		Optional<Order> ifOrder = orderRepository.findById(orderId);
		if (ifOrder.isPresent()) {
			Order cancelStatus = ifOrder.get();
			cancelStatus.setStatus("Cancelled");
			orderRepository.save(cancelStatus);
			return "Order Cancelled Successfully";

		}
		return null;
	}

	@Override
	public Order getOrderByOrderId(Integer orderId) {
		Optional<Order> ifOrder = orderRepository.findById(orderId);
		if (ifOrder.isPresent()) {
			return ifOrder.get();
		}
		return null;
	}

	@Override
	public double getOrderAmountByOrderId(Integer orderId) {
		Optional<Order> ifOrder = orderRepository.findById(orderId);
		if (ifOrder.isPresent()) {
			List<OrderedItem> orderedItems = orderedItemService.findByOrderedItemId(orderId);
			double totalPrice = 0;
			for (OrderedItem items : orderedItems) {
				totalPrice = totalPrice + (items.getPrice() * items.getQuantity());
			}
			return totalPrice;
		}
		return 0;
	}

}
