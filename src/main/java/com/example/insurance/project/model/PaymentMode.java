package com.example.insurance.project.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "paymentMode")
public class PaymentMode {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentModeId;
	private String paymentType;
	private double amount;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate paymentDate;
	private String status;
	private Integer userId;

	public int getpaymentModeId() {
		return paymentModeId;
	}

	public void setpaymentModeId(int paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "PaymentMode [paymentModeId=" + paymentModeId + ", paymentType=" + paymentType 
			 + ", amount=" + amount + ", paymentDate=" + paymentDate + ", status=" + status
				+ ", userId=" + userId + "]";
	}

}
