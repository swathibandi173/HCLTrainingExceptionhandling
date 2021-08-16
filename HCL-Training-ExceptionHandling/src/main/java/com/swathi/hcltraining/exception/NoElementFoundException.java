package com.swathi.hcltraining.exception;

import org.springframework.stereotype.Component;

@Component
public class NoElementFoundException extends RuntimeException{
	
	private String errorCode;
	private String errorMessage;
	public NoElementFoundException() {
		super();
	}
	public NoElementFoundException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

}
