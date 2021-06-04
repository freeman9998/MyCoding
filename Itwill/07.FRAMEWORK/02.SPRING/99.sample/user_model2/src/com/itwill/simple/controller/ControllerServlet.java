package com.itwill.simple.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * - 모든 클라이언트요청의 진입점(web.xml)
 * - 클라이언트의 요청을 구분해서 업무로직처리(UserManager객체메쏘드호출)
 */

public class ControllerServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("ControllerServlet.doGet()...");
		/*
		 * 1. 클라이언트요청분석
		 */
		String requestURI=request.getRequestURI();
		System.out.println("1.requestURI:"+requestURI);
		String contextPath = request.getContextPath();
		System.out.println("2.contextPath:"+contextPath);
		String requestCommand =requestURI.substring(contextPath.length()); 
		System.out.println("3.requestCommand:"+requestCommand);
		
		/*
		 * 2.클라이언트요청에따른 업무실행
		 * 	 (model객체를 사용해서 업무실행)
		 *   결과를 request에 저장 
		 *   /simple_list.do  : 사용자 리스트
		 *   /simple_detail.do: 사용자 상세보기
		 *   /simple_write.do : 사용자 저장
		 *   /simpel_update.do: 사용자 수정
		 *   
		 */
		
		String forwardPath="";
		if(requestCommand.equals("/simple_list.do")){
			//UserManager.findUserList() 호출
			ArrayList<String> userList=new ArrayList<String>();
			userList.add("이효리");
			userList.add("장동건");
			userList.add("이미숙");
			
			request.setAttribute("userList", userList);
			
			forwardPath="simple_user_list.jsp";
			
		}else if(requestCommand.equals("/simple_detail.do")){
			//UserManager.findUser() 호출
			request.setAttribute("user", "강감찬");
			forwardPath="simple_user_detail.jsp";
			
		}else if(requestCommand.equals("/simple_write.do")){
			//UserManager.write() 호출
			forwardPath="simple_user_login.jsp";
		}else if(requestCommand.equals("/simple_update.do")){
			//UserManager.update() 호출
			forwardPath="simple_user_detail.jsp";
		}
		
		//3.선택된 view(jsp)로  forwading(redirection)
		/*
		<jsp:forward path="xxx.jsp"/>
		*/
		RequestDispatcher rd=
				request.getRequestDispatcher(forwardPath);
		rd.forward(request, response);
		
		
	}
	

}
