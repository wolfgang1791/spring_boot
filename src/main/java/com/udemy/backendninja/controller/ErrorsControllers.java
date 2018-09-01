package com.udemy.backendninja.controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsControllers {
	
	public static final String error = "error/500";
	
	@ExceptionHandler(Exception.class)
	public String showInternalServerError() {
		return error;
	}
	
}
