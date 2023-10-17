package com.example.insurance.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) 
public class InsuranceExceptionHandling extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public InsuranceExceptionHandling(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public InsuranceExceptionHandling() {
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
