package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.PaymentDto;

public interface PaymentService {

	ResponseEntity<String> makePayment(PaymentDto paymentDto);


	

}
