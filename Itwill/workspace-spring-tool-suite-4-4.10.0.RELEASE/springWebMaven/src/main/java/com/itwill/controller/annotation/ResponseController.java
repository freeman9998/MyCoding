package com.itwill.controller.annotation;



import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

import com.itwill.dto.Guest;

@Controller
public class ResponseController {
	
	/************** xml출력 View[XMLView] *************/
	@RequestMapping("/response_xml_view_name.do")
	public String response_xml_view_name(Model model) {
		ArrayList<String> friendList=new ArrayList<String>();
		friendList.add("김수미");
		friendList.add("김우미");
		friendList.add("김미미");
		friendList.add("김양미");
		friendList.add("김가미");
		model.addAttribute("friendList", friendList);
		return "xmlView";
	}
	@RequestMapping("/response_xml_view_object.do")
	public View response_xml_view_object(Model model) {
		
		ArrayList<String> friendList=new ArrayList<String>();
		friendList.add("김수미");
		friendList.add("김우미");
		friendList.add("김미미");
		friendList.add("김양미");
		friendList.add("김가미");
		model.addAttribute("friendList", friendList);
		XMLView xmlView=new XMLView();
		return xmlView;
	}
	
	
	/*************forward ******************/
	@RequestMapping("/response_view_name.do")
	public String response_view_name() {
		/* 
		  0 . view name(String)
		  1 . InternalResourceViewResolver 객체
		  2 . InternalResourceView 객체(URL:/WEB-INF/views/response_view_name.jsp)
		  3 . URL--> /WEB-INF/views/response_view_name.jsp forward	
		*/
		/*
		mcv-config-view-resolver.xml
		
		<!-- ViewResolver1 -->
		<bean class="org.springframework.web.servlet.view.BeanNameViewResolver">
			<property name="order" value="0"/>
		</bean>
		<!-- ViewResolver2 -->
		<bean id="myInternalResourceViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
			<property name="order" value="1"/>
			<property name="prefix" value="/WEB-INF/views/"/>
			<property name="suffix" value=".jsp"/>
		</bean>
		
		<< Controller반환 String >>
			1.forward:/WEB-INF/views/response_view_name.jsp ==> prefix,suffix설정적용안됨
		    2.response_view_name   ==> prefix,suffix설정적용됨
		    3.redirect:xxx.jsp     ==> prefix,suffix설정적용안됨
		<< Controller반환 View >>    
		   - View.renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,HttpServletResponse response) throws Exception
		     메쏘드호출
		 */
		
		return "response_view_name";
	}
	@RequestMapping("/response_view_object.do")
	public View response_view_object() {
		InternalResourceView internalResourceView=
				new InternalResourceView("/WEB-INF/views/response_view_object.jsp");
		 /*
		 * 1.InternalResourceView 객체(URL:/WEB-INF/views/response_view_object.jsp)반환
		 * 2.URL--> /WEB-INF/views/response_view_object.jsp forward
		 */
		return internalResourceView;
	}
	/*************redirect******************/
	@RequestMapping("/response_redirect_view_name.do")
	public String response_redirect_view_name(Model model) {
		model.addAttribute("id","xxx");
		model.addAttribute("name","kim");
		return "redirect:response_redirect_view_name.jsp";
	}
	@RequestMapping("/response_redirect_view_object.do")
	public View response_redirect_view_object(Model model) {
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("response_redirect_view_object.jsp");
		
		model.addAttribute("id","xxx");
		model.addAttribute("name","kim");
		
		return redirectView;
	}
	
	/*
	 * Controller--> MessageConverter --> 클라이언트
	 */
	@ResponseBody
	@RequestMapping(value = "/response_string.do",produces = "text/plain;charset=UTF-8")
	public String responseString() {
		return "string response body data[한글]";
	}
	@ResponseBody
	@RequestMapping(value = "/response_html.do",produces = "text/html;charset=utf-8")
	public String responseHtml() {
		return "<h3>string response data[한글]</h3><hr>";
	}
	@ResponseBody
	@RequestMapping(value = "response_xml.do",produces = "text/xml;charset=utf-8")
	public Guest responseXml() {
		Guest guest=
				new Guest(1,"KIM","2021-04-20",
						"guard@gmail.com","http://www.itwill.co.kr",
						"타이틀","컨텐트!!!!");
		return guest;
	}
	
	@ResponseBody
	@RequestMapping(value = "response_json.do",produces = "application/json;charset=utf-8")
	public Guest responseJson() {
		Guest guest=
				new Guest(1,"KIM","2021-04-20",
						"guard@gmail.com","http://www.itwill.co.kr",
						"타이틀","컨텐트!!!!");
		return guest;
	}
}
