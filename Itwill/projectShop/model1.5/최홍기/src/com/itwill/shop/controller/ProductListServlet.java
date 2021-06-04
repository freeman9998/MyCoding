package com.itwill.shop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;

/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/product_list.do")
public class ProductListServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String forwardPath = "";
		/*****************************************/
		/*
		 * 메인비지니스업무라인
		 */
		ProductService productService;
		try {
			productService = new ProductService();
			List<Product> productList = productService.selectList();
			request.setAttribute("productList", productList);
			forwardPath = "forward:/WEB-INF/views/product_list.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "redirect:shop_main.do";
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
