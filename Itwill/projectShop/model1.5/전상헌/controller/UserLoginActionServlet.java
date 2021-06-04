package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;
import com.itwill.shop.user.UserServiceImpl;

/**
 * Servlet implementation class UserLoginActionServlet
 */
@WebServlet("/login_action_do")
public class UserLoginActionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath="";
		
		if(request.getMethod().equalsIgnoreCase("GET")){
	    	forwardPath="redirect:login.do";
	    }

		request.setCharacterEncoding("UTF-8");
		UserService userService=new UserServiceImpl();

		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		User user;
		try {
			user = userService.selectOneUser(userId);
			System.out.println(user);
			request.setAttribute("idCheck", "");
			request.setAttribute("passwordCheck", "");
			if(user==null){
				System.out.println("id X");
				request.setAttribute("idCheck", "존재하지 않는 아이디입니다 .");
				forwardPath="forward:/WEB-INF/views/user_login_form.jsp";
			}else if(!user.getPassword().equals(password)){
				System.out.println("password X");
				request.setAttribute("passwordCheck", "비밀번호가 일치하지 않습니다.");
				forwardPath="forward:/WEB-INF/views/user_login_form.jsp";
			}else {
				HttpSession session = request.getSession();

				session.setAttribute("loginUser", userId);
				forwardPath="redirect:shop_main.do";

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			forwardPath="redirect:error.do";
			e.printStackTrace();
		}
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
