package com.itwill.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	HandlerMapping handlerMapping;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String configFile = config.getInitParameter("configFile");
		String configFilePath = getServletContext().getRealPath(configFile);
		System.out.println("configFilePath확인!!:"+configFilePath);
		handlerMapping = new HandlerMapping(configFilePath);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath = "";
		//1.요청분석
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		System.out.println("command확인-->"+command);
		//2.요청분석 -> controller
		Controller controller = handlerMapping.getController(command);
		if(controller == null){
			controller = handlerMapping.getController("/bad.do");
		}
		
		forwardPath = controller.handleRequest(request, response);
		
		if(forwardPath.startsWith("redirect")){
			int colonIndex = forwardPath.indexOf(":");
			forwardPath = forwardPath.substring(colonIndex+1);
			response.sendRedirect(forwardPath);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher(forwardPath);
			rd.forward(request, response);
		}
		
		
	}


}
