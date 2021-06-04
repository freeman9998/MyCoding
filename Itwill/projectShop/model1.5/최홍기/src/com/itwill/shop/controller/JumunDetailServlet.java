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
import com.itwill.shop.jumun.JumunDetail;
import com.itwill.shop.jumun.JumunService;

/**
 * Servlet implementation class JumunDetailServlet
 */
@WebServlet("/jumun_detail.do")
public class JumunDetailServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath = "";
		/*****************************************/
		/*
		 * 메인비지니스업무라인
		 */
		String sUserId = (String) request.getSession().getAttribute("sUserId");
		if(sUserId==null) {	
			forwardPath = "redirect:shop_main.do";
		}else {
			try {
				int j_no = Integer.parseInt(request.getParameter("j_no"));
				JumunService jumunService = new JumunService();
				Jumun jumun = jumunService.jumunDetail(sUserId,j_no);
				List<JumunDetail> jumunDetailList = jumun.getJumunDetailList();
				request.setAttribute("jumun", jumun);
				forwardPath = "forward:/WEB-INF/views/jumun_detail.jsp";
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
