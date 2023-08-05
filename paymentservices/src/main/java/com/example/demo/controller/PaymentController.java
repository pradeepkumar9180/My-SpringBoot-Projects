package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PaymentDto;
import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	@PostMapping("/payments/makepayment")
	public ResponseEntity<String> makePayment(@RequestBody PaymentDto paymentDto)
	{
		 paymentService.makePayment(paymentDto);
		return  ResponseEntity.status(HttpStatus.CREATED).body("Payment Successfully Saved");
		
		
	}	

}
