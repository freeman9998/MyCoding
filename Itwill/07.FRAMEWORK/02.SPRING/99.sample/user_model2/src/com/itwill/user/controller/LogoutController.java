package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		request.getSession().invalidate();
		//response.sendRedirect("user_login.jsp");
		String forwardPath="user_login.jsp";
		return forwardPath;
	}

}
