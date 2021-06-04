package com.itwill.guest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestMainController {
	@RequestMapping("guest")
	public String guest() {
		return "forward:/WEB-INF/views/guest.jsp";
	}
}
