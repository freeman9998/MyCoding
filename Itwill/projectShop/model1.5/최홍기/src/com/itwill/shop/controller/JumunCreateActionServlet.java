package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.shop.jumun.JumunService;

/**
 * Servlet implementation class JumunCreateActionServlet
 */
@WebServlet("/jumun_create_action.do")
public class JumunCreateActionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath = "";
		/*****************************************/
		/*
		 * 메인비지니스업무라인
		 */
		String sUserId = (String) request.getSession().getAttribute("sUserId");
		if(sUserId==null){
			forwardPath = "redirect:shop_main.do";
		}else {
			if(request.getMethod().equalsIgnoreCase("GET")){
				forwardPath = "redirect:shop_main.do";
			}else {
				String buyType = request.getParameter("buyType");
				String p_noStr = request.getParameter("p_no");
				String p_qtyStr = request.getParameter("p_qty");
				try {
					JumunService jumunService = new JumunService();
					if(buyType.equals("cart")){
						jumunService.createJumun(sUserId);
					}else if(buyType.equals("direct")) {
						jumunService.createJumun(sUserId, Integer.parseInt(p_noStr), Integer.parseInt(p_qtyStr));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				forwardPath = "redirect:jumun_list.do";
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
