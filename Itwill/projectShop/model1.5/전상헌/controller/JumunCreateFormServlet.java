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
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductServiceImpl;
import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;
import com.itwill.shop.user.UserServiceImpl;

/**
 * Servlet implementation class JumunCreateFormServlet
 */
@WebServlet("/jumun_create_form.do")
public class JumunCreateFormServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath="";
		
		HttpSession session=request.getSession();
		String loginUser=(String)session.getAttribute("loginUser");
		if(loginUser==null) {
			 forwardPath="redirect:shop_main.do";
		}else {
	 try {
		 String buyType=request.getParameter("buyType");
		 
		 
		 
		UserService userService=new UserServiceImpl();
		CartService cartService = new CartServiceImpl();
		User user=userService.selectOneUser(loginUser);
		
		
		int tot=0;
		int p_no=0;
		int p_qty=0;
		List<Cart> cartList=null;
		
		
		
		
		
		if(buyType.equalsIgnoreCase("direct")){
			
		 p_no=Integer.parseInt(request.getParameter("p_no"));
		 p_qty=Integer.parseInt(request.getParameter("p_qty"));
		ProductServiceImpl productService=new ProductServiceImpl();
		Product product=productService.productSelectOne(p_no);
		cartList=new ArrayList<Cart>();
		cartList.add(new Cart(0,p_qty,user,product));
		tot+=product.getP_price()*p_qty;	

		request.setAttribute("tot", tot);
		request.setAttribute("p_no", p_no);
		request.setAttribute("p_qty", p_qty);
		request.setAttribute("buyType", buyType);
		request.setAttribute("cartList", cartList);
		
		
		
		forwardPath="forward:/WEB-INF/views/jumun_create_form.jsp";
			
		}else if(buyType.equalsIgnoreCase("cart")){
			
		cartList=cartService.cartList(loginUser);

		for(Cart cart:cartList){
			tot+=cart.getCart_qty()*cart.getProduct().getP_price();
		};
	
		request.setAttribute("buyType", buyType);
		request.setAttribute("cartList", cartList);
		request.setAttribute("tot", tot);
		forwardPath="forward:/WEB-INF/views/jumun_create_form.jsp";

		
		}
	 } catch (Exception e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 forwardPath="redirect:error.do";
	 }
		
		
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
