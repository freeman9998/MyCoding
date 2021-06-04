package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.shop.jumun.JumunServiceImpl;

@WebServlet("/jumun_delete_action.do")
public class JumunDeleteActionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath="";
	
		request.setCharacterEncoding("UTF-8");
		
		
		
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath="redirect:shop_main.do";
			
		}else {

		try {
			JumunServiceImpl jumunService=new JumunServiceImpl();

			int j_no=Integer.parseInt(request.getParameter("j_no"));

			jumunService.delete(j_no);
			
			
			forwardPath="redirect:jumun_list.do";
		
		} catch (Exception e) {
			
			forwardPath="redirect:error.do";
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