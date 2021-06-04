package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.user.User;
import com.itwill.user.UserManager;

public class ModifyController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		
		String forwardPath="";
		if(request.getMethod().equalsIgnoreCase("GET")){
			//response.sendRedirect("user_list.jsp");
			forwardPath="redirect:list.do";
			return forwardPath;
		}

		String userId=request.getParameter("userId");	
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String email=request.getParameter("email");

		try {
			UserManager.getInstance().update(new User(userId,password,name,email));
			//response.sendRedirect("user_view.jsp?userId="+userId);
			forwardPath="view.do";
		} catch (Exception e) {
			forwardPath="user_error.jsp";
			e.printStackTrace();
		}
		
		
		return forwardPath;
	}

}
