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

/**
 * Servlet implementation class UserLoginActionServlet
 */
@WebServlet("/user_login_action.do")
public class UserLoginActionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath = "";
		/*****************************************/
		/*
		 * 메인비지니스업무라인
		 */
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath = "redirect:shop_main.do";
		}else {
			request.setCharacterEncoding("UTF-8");
			String userId = request.getParameter("userId");
			String password = request.getParameter("password");
			User user = null;
			try{
				UserService userService = new UserService();
				if(userService.login(userId, password)){
					request.getSession().setAttribute("sUserId", userId);
					forwardPath = "redirect:shop_main.do";
				}else {
					forwardPath = "redirect:user_login_form.do";
				}
			}catch (Exception e){
				e.printStackTrace();
				forwardPath = "redirect:user_error.do";
			}
		}
		
		/*****************************************/
		
		/************forward or redirect**********/
		String[] pathArray = forwardPath.split(":");
		String forwardOrRedirect = pathArray[0];
		String path = pathArray[1];
		if (forwardOrRedirect.equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(path);
			rd.forward(request, response);
		} else if (forwardOrRedirect.equals("redirect")) {
			response.sendRedirect(path);
		}
		
	}

}
