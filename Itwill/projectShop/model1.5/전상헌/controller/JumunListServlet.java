package com.itwill.shop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.shop.jumun.Jumun;
import com.itwill.shop.jumun.JumunService;
import com.itwill.shop.jumun.JumunServiceImpl;

@WebServlet("/jumun_list.do")
public class JumunListServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
HttpSession session=request.getSession();
		
		String forwardPath="";
		String loginUser=(String)session.getAttribute("loginUser");
		System.out.println(loginUser);
		if(loginUser==null) {
			forwardPath="forward:/WEB-INF/views/shop_main.jsp";
		}else {
		
		
		
		try {
			
			JumunService jumunService=new JumunServiceImpl();
			List<Jumun> jumunList=jumunService.selectById(loginUser);
			request.setAttribute("jumunList", jumunList);
			forwardPath="forward:/WEB-INF/views/jumun_list.jsp";
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}
		String[] pathArray = forwardPath.split(":");
		String forwardOrRedirect = pathArray[0];
		String path =pathArray[1];
		if(forwardOrRedirect.equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(path);
			rd.forward(request, response);
		}else if(forwardOrRedirect.equals("redirect")) {
			response.sendRedirect(path);
		}
		
		
		
	}

}
		
		
		
