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
 * - ��� Ŭ���̾�Ʈ��û�� ������(web.xml)
 * - Ŭ���̾�Ʈ�� ��û�� �����ؼ� ��������ó��(UserManager��ü�޽��ȣ��)
 */

public class ControllerServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("ControllerServlet.doGet()...");
		/*
		 * 1. Ŭ���̾�Ʈ��û�м�
		 */
		String requestURI=request.getRequestURI();
		System.out.println("1.requestURI:"+requestURI);
		String contextPath = request.getContextPath();
		System.out.println("2.contextPath:"+contextPath);
		String requestCommand =requestURI.substring(contextPath.length()); 
		System.out.println("3.requestCommand:"+requestCommand);
		
		/*
		 * 2.Ŭ���̾�Ʈ��û������ ��������
		 * 	 (model��ü�� ����ؼ� ��������)
		 *   ����� request�� ���� 
		 *   /simple_list.do  : ����� ����Ʈ
		 *   /simple_detail.do: ����� �󼼺���
		 *   /simple_write.do : ����� ����
		 *   /simpel_update.do: ����� ����
		 *   
		 */
		
		String forwardPath="";
		if(requestCommand.equals("/simple_list.do")){
			//UserManager.findUserList() ȣ��
			ArrayList<String> userList=new ArrayList<String>();
			userList.add("��ȿ��");
			userList.add("�嵿��");
			userList.add("�̹̼�");
			
			request.setAttribute("userList", userList);
			
			forwardPath="simple_user_list.jsp";
			
		}else if(requestCommand.equals("/simple_detail.do")){
			//UserManager.findUser() ȣ��
			request.setAttribute("user", "������");
			forwardPath="simple_user_detail.jsp";
			
		}else if(requestCommand.equals("/simple_write.do")){
			//UserManager.write() ȣ��
			forwardPath="simple_user_login.jsp";
		}else if(requestCommand.equals("/simple_update.do")){
			//UserManager.update() ȣ��
			forwardPath="simple_user_detail.jsp";
		}
		
		//3.���õ� view(jsp)��  forwading(redirection)
		/*
		<jsp:forward path="xxx.jsp"/>
		*/
		RequestDispatcher rd=
				request.getRequestDispatcher(forwardPath);
		rd.forward(request, response);
		
		
	}
	

}
