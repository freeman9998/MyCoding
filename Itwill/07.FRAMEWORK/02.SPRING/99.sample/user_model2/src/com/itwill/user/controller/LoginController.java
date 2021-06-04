package com.itwill.user.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.user.PasswordMismatchException;
import com.itwill.user.User;
import com.itwill.user.UserManager;
import com.itwill.user.UserNotFoundException;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		if(request.getMethod().equalsIgnoreCase("GET")){
			//response.sendRedirect("user_login.jsp");
			forwardPath="redirect:user_login.jsp";
			return forwardPath;
		}
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		try{
			User user=UserManager
						.getInstance()
							.login(userId,password);
			HttpSession session=request.getSession();
			//login성공
			session.setAttribute("sUserId", userId);
			session.setAttribute("sUser", user);
			forwardPath="redirect:list.do";
			//response.sendRedirect(forwardPath);
			return forwardPath;
		}catch(UserNotFoundException e){
			
			request.setAttribute("MSG", e.getMessage());
			User fuser=new User(userId,password,null,null);
			request.setAttribute("fuser", fuser);
			forwardPath="user_login.jsp";
		}catch(PasswordMismatchException e){
			
			request.setAttribute("MSG", e.getMessage());
			User fuser=new User(userId,password,null,null);
			request.setAttribute("fuser", fuser);
			forwardPath="user_login.jsp";
		}catch(Exception e){
			e.printStackTrace();
			forwardPath="user_error.jsp";
		}
		//forward
		return forwardPath;
	}

}
