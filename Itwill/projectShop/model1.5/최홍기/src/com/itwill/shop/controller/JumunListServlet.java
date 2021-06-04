package com.itwill.shop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.shop.jumun.Jumun;
import com.itwill.shop.jumun.JumunService;

/**
 * Servlet implementation class JumunListServlet
 */
@WebServlet("/jumun_list.do")
public class JumunListServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath = "";
		/*****************************************/
		/*
		 * 메인비지니스업무라인
		 */
		String sUserId = (String) request.getSession().getAttribute("sUserId");
		if(sUserId==null || sUserId.equals("")){	
			forwardPath = "redirect:shop_main.do";
		}else {
			try {
				JumunService jumunService = new JumunService();
				List<Jumun> jumunList = jumunService.jumunList(sUserId);
				request.setAttribute("jumunList", jumunList);
				forwardPath = "forward:/WEB-INF/views/jumun_list.jsp";
			} catch (Exception e) {
				e.printStackTrace();
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
