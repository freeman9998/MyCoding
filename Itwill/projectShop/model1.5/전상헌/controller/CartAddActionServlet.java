package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.shop.cart.CartService;
import com.itwill.shop.cart.CartServiceImpl;

/**
 * Servlet implementation class CartAddActionServlet
 */
@WebServlet("/cart_add_action.do")
public class CartAddActionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		String forwardPath="";
		
		
		if(request.getMethod().equalsIgnoreCase("get")){
			forwardPath="redirect:shop_main.do";
		}else {



		String loginUser=(String)session.getAttribute("loginUser");
		CartService cartService;
		try {
			cartService = new CartServiceImpl();
			int cart_qty=Integer.parseInt(request.getParameter("cart_qty"));
			int p_no=Integer.parseInt(request.getParameter("p_no"));
			System.out.println(cart_qty);
			System.out.println(p_no);
			cartService.add(loginUser, p_no, cart_qty);
			forwardPath="redirect:shop_view_cart.do";
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath="redirect:error.do";
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
