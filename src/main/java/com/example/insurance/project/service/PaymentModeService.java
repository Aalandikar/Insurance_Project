package com.example.insurance.project.service;

import java.util.List;

import com.example.insurance.project.model.Claim;
import com.example.insurance.project.model.PaymentMode;

public interface PaymentModeService {
	public PaymentMode savePaymentMode(PaymentMode paymentModes);
	
	public PaymentMode updatePaymentMode(PaymentMode paymentMode);

	public void deletePaymentMode(Integer paymentId);

	public PaymentMode getPaymentModeById(Integer paymentId);

	public List<PaymentMode> getAllpayments();
	
}
