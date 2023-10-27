package com.example.insurance.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.project.model.PaymentMode;
import com.example.insurance.project.repository.PaymentModeRepository;
import com.example.insurance.project.service.PaymentModeService;

@Service
public class PaymentModeServiceImpl implements PaymentModeService {
	
	@Autowired
	private PaymentModeRepository paymentModeRepository;

	@Override
	public PaymentMode savePaymentMode(PaymentMode paymentMode) {
		PaymentMode paymentMode1=	paymentModeRepository.save(paymentMode);
		return paymentMode1;
	}

	@Override
	public PaymentMode updatePaymentMode(PaymentMode paymentMode) {
		PaymentMode paymentMode1=paymentModeRepository.save(paymentMode);
		return paymentMode1;
	}

	@Override
	public void deletePaymentMode(Integer paymentId) {	
		paymentModeRepository.deleteById(paymentId);	
	}

	@Override
	public PaymentMode getPaymentModeById(Integer paymentId) {
		PaymentMode paymentMode1=paymentModeRepository.getById(paymentId);
		return paymentMode1;
	}

	@Override
	public List<PaymentMode> getAllpayments() {
		return paymentModeRepository.findAll();
	}

}
