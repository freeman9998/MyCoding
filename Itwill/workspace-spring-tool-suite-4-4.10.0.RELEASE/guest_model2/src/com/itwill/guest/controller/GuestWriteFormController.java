package com.itwill.guest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.summer.Controller;

public class GuestWriteFormController implements Controller{
	
	public String handleRequest(HttpServletRequest request,HttpServletResponse response) {
		/******************guest_write_form.do******************/
		String forwardPath="forward:/WEB-INF/views/guest_write_form.jsp";
		return forwardPath;
	}
}
