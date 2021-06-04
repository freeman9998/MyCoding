package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
import com.itwill.shop.product.ProductServiceImpl;


@WebServlet("/product_detail.do")
public class ProductDetailServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath="";
		HttpSession session=request.getSession();
		

		String p_noStr=request.getParameter("p_no");
		if(p_noStr==null){
			forwardPath="redirect:product_list.do";
		}else {
		int p_no=Integer.parseInt(request.getParameter("p_no"));

		ProductService productService=new ProductServiceImpl();
		try {
			Product product=productService.productDetail(p_no);
			request.setAttribute("product", product);
			forwardPath="forward:/WEB-INF/views/product_detail.jsp";
			
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
