package com.itwill.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import com.itwill.summer.Controller;

public class UserLogoutController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		//String forwardPath = "forward:/WEB-INF/testview/emoInsertForm.jsp";
		String forwardPath = "";
		
		//session session = request.getSession();
		//Session session = (Session) request.getSession();
		request.getSession().invalidate();
		//session.invalidate();
		forwardPath="redirect:emo_main.do";
		
		return forwardPath;
	}
	
	
}
