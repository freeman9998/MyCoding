package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.shop.user.UserServiceImpl;

/**
 * Servlet implementation class UserRemoveAction
 */
@WebServlet("/user_remove_action.do")
public class UserRemoveAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		String forwardPath="";
		if(request.getMethod().equalsIgnoreCase("GET")) {
			forwardPath="redirect:shop_main.do";
		}else {
		
		
		
		
		String userid=(String)session.getAttribute("loginUser");

		UserServiceImpl userService=new UserServiceImpl();

		try {
			userService.deleteUser(userid);
			forwardPath="redirect:shop_main.do";
		} catch (Exception e) {
			forwardPath="redirect:error.do";
			e.printStackTrace();
		}

		session.invalidate();

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
