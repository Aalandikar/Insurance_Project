package com.example.insurance.project.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="nominee")
public class Nominee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nomineeId;
	private Integer userId;
	private String firstName;
	private String lastName;
	private String relation;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	private String mobile;
	
	public Integer getnomineeId() {
		return nomineeId;
	}
	public void setnomineeId(Integer nomineeId) {
		this.nomineeId = nomineeId;
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
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
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
	@Override
	public String toString() {
		return "Nominee [nomineeId=" + nomineeId + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", relation=" + relation + ", dateOfBirth=" + dateOfBirth + ", mobile=" + mobile + "]";
	}

	

}
