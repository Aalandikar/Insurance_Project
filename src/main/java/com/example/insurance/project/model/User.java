package com.example.insurance.project.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private String mobile;

	@OneToMany(mappedBy = "userId")
	private List<Policy> policyList;

	@OneToMany(mappedBy = "userId")
	private List<Claim> claimsList;

	@OneToMany(mappedBy = "userId")
	private List<Premium> PremiumList;

	@OneToMany(mappedBy = "userId")
	private List<PaymentMode> paymentModeList;

	@OneToMany(mappedBy = "userId")
	private List<Nominee> nomineeList;

	@OneToMany(mappedBy = "userId")
	private List<Coverage> coverageList;

	public List<Policy> getPolicyList() {
		return policyList;
	}

	public void setPolicyList(List<Policy> policyList) {
		this.policyList = policyList;
	}

	public List<Claim> getClaimsList() {
		return claimsList;
	}

	public void setClaimsList(List<Claim> claimsList) {
		this.claimsList = claimsList;
	}

	public List<Premium> getPremiumList() {
		return PremiumList;
	}

	public void setPremiumList(List<Premium> premiumList) {
		PremiumList = premiumList;
	}

	public List<PaymentMode> getPaymentModeList() {
		return paymentModeList;
	}

	public void setPaymentModeList(List<PaymentMode> paymentModeList) {
		this.paymentModeList = paymentModeList;
	}

	public List<Nominee> getNomineeList() {
		return nomineeList;
	}

	public void setNomineeList(List<Nominee> nomineeList) {
		this.nomineeList = nomineeList;
	}

	public List<Coverage> getCoverageList() {
		return coverageList;
	}

	public void setCoverageList(List<Coverage> coverageList) {
		this.coverageList = coverageList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", mobile=" + mobile + ", policyList="
				+ policyList + ", claimsList=" + claimsList + ", PremiumList=" + PremiumList + ", paymentModeList="
				+ paymentModeList + ", nomineeList=" + nomineeList + ", coverageList=" + coverageList + "]";
	}

}
