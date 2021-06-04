package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.user.ExistedUserException;
import com.itwill.user.User;
import com.itwill.user.UserManager;

/*
 Write 업무를 실행하기 위한일반 클래스 
 */
public class WriteController implements Controller{

	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		if (request.getMethod().equalsIgnoreCase("GET")) {
			//response.sendRedirect("user_write.jsp");
			forwardPath="redirect:user_write.jsp";
			return forwardPath;
		}
		// 1. 파라메타바끼
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		User user = new User(userId, password, name, email);
		// 2. UserManager.create()메쏘드호출
		try {
			int row = UserManager.getInstance().create(user);
			// insert success
			//response.sendRedirect("user_login.jsp");
			forwardPath="redirect:user_login.jsp";
		} catch (ExistedUserException e) {
			
			request.setAttribute("MSG", e.getMessage());
			request.setAttribute("fuser", user);

			// <jsp:forward page="user_write.jsp"/>
			forwardPath="user_write.jsp";
		} catch (Exception e) {
			//response.sendRedirect("../error/error.jsp");
			forwardPath="user_error.jsp";
		}
		return forwardPath;
	}
}
