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

import com.itwill.shop.jumun.Jumun;
import com.itwill.shop.jumun.JumunServiceImpl;
import com.itwill.shop.jumunDetail.JumunDetail;
import com.itwill.shop.jumunDetail.jumunDetailServiceImpl;

/**
 * Servlet implementation class JumunDetailServlet
 */
@WebServlet("/jumun_detail.do")
public class JumunDetailServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath="";
		HttpSession session=request.getSession();
		

		String j_noStr=request.getParameter("j_no");
		if(j_noStr==null){
			forwardPath="redirect:jumun_list.do";
		}else {
		try {
			 
		        if(j_noStr==null){
					forwardPath="redirect:shop_main.do";

		        }else {
		        int j_no=Integer.parseInt(j_noStr);
		        
		        
		        jumunDetailServiceImpl jumunDetailService=new jumunDetailServiceImpl();
		        JumunServiceImpl jumunService=new JumunServiceImpl();
		        Jumun jumun=jumunService.selectByNo(j_no);
		        List<JumunDetail> jumunDetailList =jumunDetailService.selectOneJumun(j_no);
		        request.setAttribute("jumun", jumun);
		        request.setAttribute("jumunDetailList", jumunDetailList);
		        forwardPath="forward:/WEB-INF/views/jumun_detail.jsp";
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
