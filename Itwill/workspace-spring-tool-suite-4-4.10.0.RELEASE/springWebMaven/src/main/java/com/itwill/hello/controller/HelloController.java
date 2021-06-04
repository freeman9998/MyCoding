package com.itwill.hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.itwill.hello.Hello;
import com.itwill.hello.HelloService;

public class HelloController implements Controller{
	private HelloService helloService;
	
	public HelloController() {
		System.out.println("3.### HelloController()생성자");
	}
	
	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		System.out.println("4.### HelloController.setHelloService("+helloService+")메쏘드");
		this.helloService = helloService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("A.### HelloController.handleRequest()호출");
		Hello hello = helloService.hello();
		request.setAttribute("hello", hello);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("forward:/WEB-INF/views/hello.jsp");
		return modelAndView;
	}

}
