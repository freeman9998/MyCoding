package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;
import com.itwill.shop.user.UserServiceImpl;

/**
 * Servlet implementation class UserWriteActionServlet
 */
@WebServlet("/user_write_action.do")
public class UserWriteActionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath="";
		
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath="redirect:shop_main.do";
		}else {
		
		UserService userService = new UserServiceImpl();
		

		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		try {
			userService.insertUser(new User(userid,password,name,email));
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		forwardPath="forward:/WEB-INF/views/user_login_form.jsp";
		String[] pathArray=forwardPath.split(":");
		String forwardOrRedirect=pathArray[0];
		String path=pathArray[1];
		if(forwardOrRedirect.equals("forward")) {
			RequestDispatcher rd=request.getRequestDispatcher(path);
			rd.forward(request, response);
		}else if(forwardOrRedirect.equals("redirect")){
			response.sendRedirect(path);
		}
		
		}
		
	}

}
