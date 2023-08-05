package com.example.demo.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PaymentDto;
import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public ResponseEntity<String> makePayment(PaymentDto paymentDto) {
	Payment payments=new Payment();
	payments.setAmount(paymentDto.getAmount());
	payments.setCustomerId(paymentDto.getCustomerId());
	payments.setOrderId(paymentDto.getOrderId());
	payments.setPaymentMethod(paymentDto.getPaymentMethod());
	paymentRepository.save(payments);
	return ResponseEntity.status(HttpStatus.CREATED).body("Payment Successfully Saved");
	}



}
