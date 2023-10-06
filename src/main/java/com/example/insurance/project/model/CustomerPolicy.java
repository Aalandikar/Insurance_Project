package com.example.insurance.project.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customertable")
public class CustomerPolicy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer userId;
	private Integer policyId;
	private String policyName;
	private int no_OfYears;
	private String premiumPaymentCycle;
	private LocalDate startDate;
	private LocalDate endDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getNo_OfYears() {
		return no_OfYears;
	}

	public void setNo_OfYears(int no_OfYears) {
		this.no_OfYears = no_OfYears;
	}

	public String getPremiumPaymentCycle() {
		return premiumPaymentCycle;
	}

	public void setPremiumPaymentCycle(String premiumPaymentCycle) {
		this.premiumPaymentCycle = premiumPaymentCycle;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "CustomerPolicy [id=" + id + ", userId=" + userId + ", policyId=" + policyId + ", policyName="
				+ policyName + ", no_OfYears=" + no_OfYears + ", premiumPaymentCycle=" + premiumPaymentCycle
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

}
