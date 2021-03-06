package com.itwill.shop.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;

/**
 * Servlet implementation class ProductDetailServlet
 */
@WebServlet("/product_detail.do")
public class ProductDetailServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath = "";
		/*****************************************/
		/*
		 * 메인비지니스업무라인
		 */
		String p_no = request.getParameter("p_no");
		if(p_no==null || p_no.equals("")){
			forwardPath = "redirect:product_list.do";
		}else {
			try {
				ProductService productService = new ProductService();
				Product product = productService.selectByNo(Integer.parseInt(p_no));
				request.setAttribute("product", product);
				forwardPath = "forward:/WEB-INF/views/product_detail.jsp";
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
