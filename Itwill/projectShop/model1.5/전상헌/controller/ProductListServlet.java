package com.itwill.shop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductServiceImpl;

@WebServlet("/product_list.do")
public class ProductListServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String forwardPath = "";
		 ProductServiceImpl productService=new ProductServiceImpl();
		 try {
			ArrayList<Product> productList=productService.productList();
			request.setAttribute("productList", productList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		forwardPath = "forward:/WEB-INF/views/product_list.jsp";
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
