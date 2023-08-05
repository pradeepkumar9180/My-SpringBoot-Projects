package com.example.demo.dto;

public class PaymentDto {
	private Long paymentId;
	private double amount;
	private Long orderId;
	private String paymentMethod;
	private Long customerId;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public PaymentDto(Long paymentId, double amount, Long orderId, String paymentMethod, Long customerId) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.orderId = orderId;
		this.paymentMethod = paymentMethod;
		this.customerId = customerId;
	}
	public PaymentDto() {
		super();
	}
	

}
