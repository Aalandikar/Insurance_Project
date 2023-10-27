package com.example.insurance.project.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "premiums")
public class Premium {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer premiumId;

	@ManyToOne
	@JoinColumn(name = "policy_id")
	private Policy policy;

	private float amount;
	private Integer userId;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate premiumDate;

	public Integer getpremiumId() {
		return premiumId;
	}

	public void setpremiumId(Integer premiumId) {
		this.premiumId = premiumId;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public LocalDate getPremiumDate() {
		return premiumDate;
	}

	public void setPremiumDate(LocalDate premiumDate) {
		this.premiumDate = premiumDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Premium [premiumId=" + premiumId + ", policy=" + policy + ", amount=" + amount + ", userId=" + userId
				+ ", premiumDate=" + premiumDate +  "]";
	}

}
