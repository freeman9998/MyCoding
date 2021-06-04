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

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartService;
import com.itwill.shop.cart.CartServiceImpl;
import com.itwill.shop.jumun.Jumun;
import com.itwill.shop.jumun.JumunService;
import com.itwill.shop.jumun.JumunServiceImpl;
import com.itwill.shop.jumunDetail.JumunDetailService;
import com.itwill.shop.jumunDetail.jumunDetailServiceImpl;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
import com.itwill.shop.product.ProductServiceImpl;

@WebServlet("/jumun_create_action.do")
public class JumunCreateActionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String forwardPath="";
		
		if(request.getMethod().equalsIgnoreCase("GET")){
			forwardPath="redirect:shop_main.do";
			
		}else {
		HttpSession session=request.getSession();
		
		
		
		String userid=(String)session.getAttribute("loginUser");
		int tot=Integer.parseInt(request.getParameter("tot"));



		try {
		ProductService productService=new ProductServiceImpl();
		CartService cartService;
			cartService = new CartServiceImpl();
		JumunService jumunService=new JumunServiceImpl();
		JumunDetailService jumunDetailService=new jumunDetailServiceImpl();
		String buyType=request.getParameter("buyType");
		if(buyType.equalsIgnoreCase("direct")){
		int	 p_no=Integer.parseInt(request.getParameter("p_no"));
		int	 p_qty=Integer.parseInt(request.getParameter("p_qty"));
			
		Product product=productService.productSelectOne(p_no);
			
		jumunService.insert(product.getP_name(), tot, userid);
		List<Jumun> jumunList=jumunService.selectById(userid);
		int j_no=0;
		for(Jumun jumun:jumunList){
			
			if(!jumunDetailService.isDetailExist(jumun.getJ_no())){
				j_no=jumun.getJ_no();
			}
		}
		jumunDetailService.insertDetail(p_qty, p_no, j_no);

		forwardPath="redirect:jumun_list.do";

		}else{




		List<Cart> cartlist=cartService.cartList(userid);
		String j_desc=null;
		int cartlistsize=cartlist.size()-1;
		int j_no=0;
		for(Cart cart:cartlist){
			if(j_desc==null){
				j_desc=cart.getProduct().getP_name()+"외"+cartlistsize+"종";
				jumunService.insert(j_desc, tot, userid);
				List<Jumun> jumunList=jumunService.selectById(userid);
				for(Jumun jumun:jumunList){
			
			if(!jumunDetailService.isDetailExist(jumun.getJ_no())){
				j_no=jumun.getJ_no();
			}
				}
				
				
			}
			
			jumunDetailService.insertDetail(cart.getCart_qty(),cart.getProduct().getP_no(),j_no);
			
			
		}

		cartService.deleteAll(userid);
		forwardPath="redirect:jumun_list.do";

		}
		
		} catch (Exception e) {
			forwardPath="redirect:error.do";

			e.printStackTrace();
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
