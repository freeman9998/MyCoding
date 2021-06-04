package com.itwill.controller.annotation;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwill.dto.Guest;

@Controller
public class RequestMappingParameterController {
	@RequestMapping(value = "/parameter_guest_write_form.do")
	public String parameter_guest_write_form() {
		return "forward:/WEB-INF/views/guest_write_form.jsp";
	}
	@RequestMapping(value = "/model_attribute_guest_write_action.do",method = RequestMethod.POST)
	public String model_attribute_guest_write_action(@ModelAttribute("guest") Guest guest) {
		
		System.out.println("### @ModelAttribute #####");
		System.out.println(guest);
		/*
		 * 1. 파라메타의모든객체 받기
		 * 2. 선언된DTO객체[Guest]생성(기본생성자)
		 * 3. 받은파라메타 데이타를 파라메타이름과 일치하는
		 *    Guest객체의 속성메쏘드(setter method)호출해서대입
		 * 4. Guest클래스이름 첫글자를 소문자로변경한이름(guest)으로
		 *    request객체에 속성(attribute)등록
		 *    request.setAttribute("guest",guest);
		 */
		/*
		 * GuestService메쏘드호출
		   request.setAttribute("guest", guest);
		 */
		return "forward:/WEB-INF/views/guest_write_result.jsp";
	}
	
	@RequestMapping(value = "/parameter_guest_write_action.do",method = RequestMethod.POST)
	public String parameter_guest_write_action(
				@RequestParam("guest_name") String name,
				@RequestParam("guest_title") String title,
				@RequestParam("guest_email") String email,
				@RequestParam String guest_homepage,
				@RequestParam String guest_content,
				Model model
			) {
		Guest guest=new Guest(0, name, null, email, guest_homepage, title, guest_content);
		System.out.println("### @RequestParam #####");
		System.out.println(guest);
		
		/*
		 * GuestService메쏘드호출
		 */
		model.addAttribute("guest", guest);
		
		return "forward:/WEB-INF/views/guest_write_result.jsp";
	}
	
	
}
