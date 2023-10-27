package com.example.insurance.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coverage")
public class Coverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer coverageId;
    private String name;
    private String description;
    private double coverageAmount;
    private Integer userId;

    public Integer getUserId() {
		return userId;
	}
    public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCoverageId() {
		return coverageId;
	}

	public void setCoverageId(Integer coverageId) {
		this.coverageId = coverageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	@Override
	public String toString() {
		return "Coverage [coverageId=" + coverageId + ", name=" + name + ", description=" + description + ", coverageAmount="
				+ coverageAmount + "]";
	}



}

