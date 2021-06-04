package com.itwill.shop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartService;
import com.itwill.shop.cart.CartServiceImpl;

/**
 * Servlet implementation class CartListServlet
 */
@WebServlet("/shop_view_cart.do")
public class CartListServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession();
		
		String forwardPath="";
		String loginUser=(String)session.getAttribute("loginUser");
		System.out.println(loginUser);
		if(loginUser==null) {
			forwardPath="forward:/WEB-INF/views/shop_main.jsp";
		}else {
		
		
		
		try {
			CartService cartService=new CartServiceImpl();
			List<Cart> cartList=cartService.cartList(loginUser);
			request.setAttribute("cartList", cartList);
			forwardPath="forward:/WEB-INF/views/shop_view_cart.jsp";
				int tot=0;
				
				for(Cart cart:cartList){
				tot+=cart.getProduct().getP_price()*cart.getCart_qty();
				}
				request.setAttribute("tot", tot);
			
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
