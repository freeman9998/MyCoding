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
 * Servlet implementation class CartDeleteItemActionServlet
 */
@WebServlet("/cart_delete_item_action.do")
public class CartDeleteItemActionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath="";
		HttpSession session=request.getSession();
		
		
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath="redirect:shop_main.do";
			
		}else {

		
		try {

				CartServiceImpl cartService=new CartServiceImpl();
				int cart_no=Integer.parseInt(request.getParameter("cart_no"));
				System.out.println(cart_no);
				cartService.deleteCartByNo(cart_no);

				forwardPath="redirect:shop_view_cart.do";
		
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