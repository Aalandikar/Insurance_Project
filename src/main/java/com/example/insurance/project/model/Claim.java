package com.example.insurance.project.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "claim")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Claim {
	@Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer claimId;
	private String claimNumber;
	private String description;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;
	private double claimAmount;
	private Integer userId;

	public Integer getClaimId() {
		return claimId;
	}

	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", claimNumber=" + claimNumber + ", description=" + description + ", date="
				+ date + ", claimAmount=" + claimAmount + ", userId=" + userId + "]";
	}

}
