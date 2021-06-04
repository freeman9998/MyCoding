package com.itwill.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 클라이언트의 요청의 진입점(컨트롤러) --> web.xml
  - 모든클라이언트요청을 처리하게될클래스
  - 모델객체를 사용해서 요청을처리한후에는 적절한뷰를 선택해서 이동
 */


public class DispatcherServlet extends HttpServlet {
	HandlerMapping handlerMapping;
	/*
	<init-param>
			<param-name>configFile</param-name>
			<param-value>/WEB-INF/model2_config.properties</param-value>
	</init-param>
	
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//외부설정파일 web.xml  의 파라메타(설정파일이름)를 읽어온다.
		String configFile=config.getInitParameter("configFile");
		String configFilePath=getServletContext().getRealPath(configFile);
		System.out.println("configFilePath:"+configFilePath);
		
		handlerMapping=new HandlerMapping(configFilePath);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		  가입		: /write.do
		  리스트	: /list.do
		  상세보기	: /view.do
		  수정폼    : /modify_form.do
		  수정      : /modify.do
		  삭제      : /remove.do
		  로그인    : /login.do
		  로그아웃  : /logout.do
		 */
		
		/* 
		1.요청분석
		*/
		String requestURI = request.getRequestURI();
		String contextPath=request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		/* 
		2.요청분석후 요청에따른 업무실행
		*/
		String forwardPath="";
		Controller controller=handlerMapping.getController(command);
		if(controller==null){
			controller=handlerMapping.getController("/bad.do");
		}
		/*
		if(command.equals("/write.do")){
			controller = new WriteController();
		}else if(command.equals("/login.do")){
			controller=new LoginController();
		}else-- if(command.equals("/list.do")){
			controller=new ListController();
		}else if(command.equals("/view.do")){
			controller=new ViewController();
		}else if(command.equals("/modify_form.do")){
			controller=new ModifyFormController();
		}else if(command.equals("/modify.do")){
			controller=new ModifyController();
		}else if(command.equals("/remove.do")){
			controller=new RemoveController();
		}else if(command.equals("/logout.do")){
			controller=new LogoutController();
		}else{
			controller=new BadCommandController();
		}
		*/
		/*
		 3. view(jsp) 선택후 이동(forwarding,redirect)
		 */
		forwardPath=controller.handleRequest(request,response);
		/* 
		 forward  --> xxx.jsp
		 redirect --> redirect:xxx.jsp
		*/ 
		if(forwardPath.startsWith("redirect:")){
			//redirect
			int colonIndex=forwardPath.indexOf(":");
			forwardPath=forwardPath.substring(colonIndex+1);
			response.sendRedirect(forwardPath);
		}else{
			//forwarding
			RequestDispatcher rd=
					request.getRequestDispatcher(forwardPath);
			rd.forward(request, response);
			
		}
		
		
	}
	
}
