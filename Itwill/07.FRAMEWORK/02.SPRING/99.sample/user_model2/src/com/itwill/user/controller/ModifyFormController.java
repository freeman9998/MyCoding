package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.user.User;
import com.itwill.user.UserManager;
import com.itwill.user.UserNotFoundException;

public class ModifyFormController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		String userId=request.getParameter("userId");
		if(request.getMethod().equalsIgnoreCase("GET")|| userId==null){
			//response.sendRedirect("user_list.jsp");
			forwardPath="redirect:list.do";
			return forwardPath;
		}
		
		try {
			
			User user=UserManager.getInstance().findUser(userId);
			request.setAttribute("user", user);
			forwardPath="user_modify.jsp";
		} catch (Exception e) {
			forwardPath="user_error.jsp";
		}
		
		return forwardPath;
	}

}
