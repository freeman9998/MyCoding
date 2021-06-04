package com.itwill.summer;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
모든요청의 진입점(Front Controller) 
<<요청command>>
/guest_main.do
/guest_write_form.do
/guest_write_action.do
/guest_list.do
/guest_view.do
/guest_modify_form.do
/guest_modify_action.do
/guest_remove_action.do
/guest_error.do

 */

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;
import com.itwill.guest.GuestServiceImpl;
import com.itwill.guest.controller.GuestErrorController;
import com.itwill.guest.controller.GuestListController;
import com.itwill.guest.controller.GuestMainController;
import com.itwill.guest.controller.GuestModifyActionController;
import com.itwill.guest.controller.GuestModifyFormController;
import com.itwill.guest.controller.GuestRemoveActionController;
import com.itwill.guest.controller.GuestViewController;
import com.itwill.guest.controller.GuestWriteActionController;
import com.itwill.guest.controller.GuestWriteFormController;

public class DispatcherServlet2 extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.processRequest(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.processRequest(request, response);

	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		/guest_main.do
		/guest_write_form.do
		/guest_write_action.do
		/guest_list.do
		/guest_view.do
		/guest_modify_form.do
		/guest_modify_action.do
		/guest_remove_action.do
		/guest_error.do
		 */
		/*
		 * 1.클라이언트의 요청URI를 사용해서 요청분석
		 */
		String requestURI = request.getRequestURI();
		//System.out.println("requestURI:"+requestURI);
		String contextPath=request.getContextPath();
		//System.out.println("contextPath:"+contextPath);
		String command = requestURI.substring(contextPath.length());
		//System.out.println("command:"+command);
		/*
		 * 2-1.클라이언트 요청에따른 업무실행Controller객체생성
		 */
		String forwardPath="";
		Controller controller=null;
		/*################################################################*/
		if(command.equals("/guest_main.do")) {
			controller=new GuestMainController();
		}else if(command.equals("/guest_write_form.do")) {
			controller=new GuestWriteFormController();
		}else if(command.equals("/guest_list.do")) {
			controller=new GuestListController();
		}else if(command.equals("/guest_view.do")) {
			controller=new GuestViewController();
		}else if(command.equals("/guest_write_action.do")) {
			controller=new GuestWriteActionController();
		}else if(command.equals("/guest_remove_action.do")) {
			controller=new GuestRemoveActionController();
		}else if(command.equals("/guest_modify_form.do")) {
			controller=new GuestModifyFormController();
		}else if(command.equals("/guest_modify_action.do")) {
			controller =new GuestModifyActionController();
		}else {
			controller=new GuestErrorController();
		}
		/*################################################################*/
		/*
		 * 2-2.클라이언트 요청에따른 업무실행Controller객체의 handleRequest()메쏘드실행
		 */
		forwardPath=controller.handleRequest(request, response);
		/*
		 * 3.JSP forward or redirect
		 */
		String[] pathArray=forwardPath.split(":");
		String forwardOrRedirect=pathArray[0];
		String path=pathArray[1];
		if(forwardOrRedirect.equals("redirect")) {
			response.sendRedirect(path);
		}else if(forwardOrRedirect.equals("forward")) {
			RequestDispatcher rd=request.getRequestDispatcher(path);
			rd.forward(request, response);
		}
		
	}

}
















