package com.itwill.address.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.address.AddressService;

/**
 * Servlet implementation class AddressDeleteActionServlet
 */
@WebServlet("/address_delete_action.do")
public class AddressDeleteActionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * http://127.0.0.1/servletSite/address_delete_action.do?no=1
		 */
		/*
		 * 1.파라메타받기(no)
		 * 2.AddressService객체생성
		 * 3.받은파라메타로 AddressService.delete()메쏘드실행
		 * 4.클라이언트로 redirection 응답
		 *     --> address_list.do redirect
		 *     
		 */
		try {
			String noStr = request.getParameter("no");
			if(noStr==null|| noStr.equals("")) {
				response.sendRedirect("address_main.do");
				return;
			}
			AddressService addressService=new AddressService();
			int rowCount = addressService.deleteByNo(Integer.parseInt(noStr));
			response.sendRedirect("address_list.do");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
