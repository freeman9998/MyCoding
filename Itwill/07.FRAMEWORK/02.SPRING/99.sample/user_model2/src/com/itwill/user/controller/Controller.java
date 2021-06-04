package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 모든 컨트롤러들이 구현해야하는클래스 
 */
public interface Controller {
	public String handleRequest(HttpServletRequest request,HttpServletResponse response);
	
}
