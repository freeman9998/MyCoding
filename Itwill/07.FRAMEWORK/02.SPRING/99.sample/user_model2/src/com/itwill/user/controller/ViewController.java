package com.itwill.user.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.user.User;
import com.itwill.user.UserManager;
import com.itwill.user.UserNotFoundException;

public class ViewController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		String userId=request.getParameter("userId");
		if(userId==null){
			//response.sendRedirect("user_list.jsp");
			forwardPath="redirect:list.do";
			return forwardPath;
		}
		User user =null;
		try{
			
			user = UserManager.getInstance().findUser(userId);
			request.setAttribute("user", user);
			forwardPath="user_view.jsp";
			return forwardPath;
		}catch(UserNotFoundException e){
			request.setAttribute("MSG", e.getMessage());
			//RequestDispatcher rd= request.getRequestDispatcher("user_list.jsp");
			//rd.forward(request,response);
			forwardPath="list.do";
			return forwardPath;		
		}catch(Exception e){
			forwardPath="user_error.jsp";
			return forwardPath;
		}
	}

}
