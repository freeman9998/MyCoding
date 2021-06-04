package com.itwill.controller.annotation;

import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.dto.Guest;
import com.itwill.service.UserExistedException;
import com.itwill.service.UserService;

@Controller
public class SpringCustomTagSPELController {
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private UserService userService;
	
	@RequestMapping("spring_customtag_spel_i18n.do")
	public String spring_customtag_spel_i18n() {
		return "spring_customtag_spel_i18n";
	}
	/*************Controller 생성[i18n]**************************/
	@RequestMapping("spring_controller_i18n.do")
	public String spring_controller_i18n(Locale requestLocale,Model model) {
		/*
		<< xx_ko.properties >>
		user.existed.exception = {0}는 존재하는 아이디 입니다.
		user.notfound.exception = {0}는 존재하지 않는 아이디입니다.
		
		<< xx_en.properties >>
		user.existed.exception = {0} User ID already exist.
		user.notfound.exception = {0} User ID don't exist.
		 */
		String msg = messageSource.getMessage("user.existed.exception", new Object[] {"guard"}, requestLocale);
		model.addAttribute("user_existed_exception_controller_msg", msg);
		return "spring_customtag_spel_i18n";
	}
	/*************Service 생성[i18n]**************************/
	@RequestMapping("spring_service_i18n.do")
	public String spring_service_i18n(Model model) {
		try {
			userService.create();
			
		} catch (UserExistedException e) {
			e.printStackTrace();
		    model.addAttribute("user_existed_exception_service_msg", e.getMessage());
		}
		return "spring_customtag_spel_i18n";
	}
	
	
	@RequestMapping("/jstl_fmt_i18n.do")
	public String jstl_fmt_i18n() {
		return "jstl_fmt_i18n";
	}
	@RequestMapping("/spring_customtag_spel.do")
	public String spring_customtag_spel(HttpServletRequest request) {
		request.setAttribute("price0", 345345435);
		request.setAttribute("name0", "kim eun hi");
		
		request.setAttribute("price1", 231151);
		request.setAttribute("name1", "LEE HYO LEE");
		request.setAttribute("married1", true);
		
		request.setAttribute("price2", 12345456);
		request.setAttribute("name2", "김태희");
		request.setAttribute("married2", true);
		
		request.setAttribute("guest", 
					new Guest(1, "김수미", new Date().toLocaleString(),
							"guard@naver.com", "http://www.google.com",
							"오늘은목요일", "Spring EL에대해 공부합니다."));
		
		
		return "spring_customtag_spel";
	}
	
}
