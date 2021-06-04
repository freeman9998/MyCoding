package com.itwill.user.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {
	@ExceptionHandler(Exception.class)
	public String  handleException(Exception e) {
		return "user_error";
	}
}
