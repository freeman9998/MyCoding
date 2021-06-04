package com.itwill.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResponseControllerThymeleaf {
	@RequestMapping("/hello_thymeleaf.do")
	public String hello_thymeleaf() {
		return "hello_thymeleaf";
	}
}
