package com.itwill.guest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestResultList;
import com.itwill.guest.GuestService;

@RestController
public class GuestRestController {
	@Autowired
	private GuestService guestService;
	
	@RequestMapping(value = "guest/guest_login_check",produces = "application/json;charset=utf-8")
	public Map guest_login_check(HttpSession session) {
		String isLogin="fail";
		String user_id=(String)session.getAttribute("user_id");
		if(user_id!=null) {
			isLogin="success";
		}
		Map map=new HashMap();
		map.put("status", isLogin);
		map.put("login_id", user_id);
		System.out.println("guest/guest_login_check-->"+map);
		return map;
	}
	
	
	
	@RequestMapping(value="guest/guest_id_check",produces = "text/plain;charset=utf-8")
	public String guest_id_check(@RequestParam String guest_id) {
		String result="false";
		if(guest_id.equals("user1")||guest_id.equals("user2")) {
			result="true";
		}else {
			result="false";
		}
		System.out.println("-->"+guest_id+":"+result);
		return result;
	}
	
	
	@RequestMapping(value = "guest/guest_logout_action",produces = "text/plain;charset=utf-8")
	public String guest_logout_action(HttpSession session) {
		session.invalidate();
		return "logout";
	}
	
	@PostMapping(value = "guest/guest_login_action",produces = "text/plain;charset=utf-8")
	public String guest_login_action(@RequestParam String guest_id,@RequestParam String guest_pass,HttpSession session) {
		String result="fail";
		if(guest_id==null)guest_id="";
		if(guest_pass==null)guest_pass="";
		/*  -----|------
			 id  | pass 
			-----|------	 
			user1|user1
			user2|user2
		*/
		if((guest_id.equals("user1") && guest_pass.equals("user1") )
			||(guest_id.equals("user2") && guest_pass.equals("user2"))){
			session.setAttribute("user_id", guest_id);
			result="success";
		}else{
			result="fail";
		}
		return result;
	}
	@PostMapping(value = "guest/guest_insert_action",produces = "text/plain;charset=utf-8")
	public String guest_insert_action(@ModelAttribute Guest guest) throws Exception{
		String msg="false";
		try {
			boolean insertOK = guestService.insertGuest(guest);
			msg="true";
		}catch (Exception e) {
			e.printStackTrace();
			msg="false";
		}
		return msg;
	}
	
	@RequestMapping(value = "guest/guest_list_html", produces = "text/html;charset=UTF-8")
	public String guest_list_html() throws Exception {
		StringBuffer htmlSb = new StringBuffer();
		List<Guest> guestList = guestService.selectAll();
		for (Guest guest : guestList) {
			htmlSb.append("<div class=\"guest_item\">");
			htmlSb.append("<h3 class=\"guest_title\"  guest_no=\"" + guest.getGuest_no() + "\"><a href=\"\">"
					+ guest.getGuest_title() + "[HTML]</a></h3>");
			htmlSb.append("</div>");
		}
		
		return htmlSb.toString();
	}
	@RequestMapping(value = "guest/guest_list_xml2", produces = "text/xml;charset=UTF-8")
	public List<Guest> guest_list_xml2() throws Exception {
		return guestService.selectAll();
	}
	
	@RequestMapping(value = "guest/guest_list_xml", produces = "text/xml;charset=UTF-8")
	public GuestResultList guest_list_xml() throws Exception {
		List<Guest> guestList=guestService.selectAll();
		GuestResultList guestResultList=new GuestResultList();
		guestResultList.setGuestList(guestList);
		return guestResultList;
	}

	@RequestMapping(value = "guest/guest_list_json", produces = "application/json;charset=UTF-8")
	public List<Guest> guest_list_json() throws Exception {
		/*
		 
		 [
			{
			"guest_no": "1",
			"guest_name": "김경가",
			"guest_date": "2021-04-15",
			"guest_email": "guard1@naver.com",
			"guest_title": "방명록 사용법1",
			"guest_content": "방명록처럼 사용하시면 됩니다1"
			},{}
		 ]	
		 */
		return guestService.selectAll();
		
	}
	
	@RequestMapping(value = "guest/guest_detail_html", produces = "text/html;charset=UTF-8")
	public String guest_detail_html(@RequestParam int guest_no) throws Exception {
		Guest guest=guestService.selectByNo(guest_no);
		StringBuffer sb=new StringBuffer();
		/*
		<div class="guest_date">
			날짜:2021-04-15 13:59:42
		</div>
		<div class="guest_name">
			이름:김경가
		</div>
		<div class="guest_email">
			이메일:guard1@naver.com
		</div>
		<div class="guest_homepage">
			홈페이지:http://www.naver.com
		</div>
		<div class="guest_content">
			내용:방명록처럼 사용하시면 됩니다1
		</div>
		<div class='guest_delete'>
			<input type="button" value="삭제" guest_no="1">
			<input type="button" value="수정" guest_no="1">
		</div>
		 */
		sb.append("<div class='guest_date'>");
		sb.append("	날짜:"+guest.getGuest_date());
		sb.append("</div>");
		sb.append("<div class='guest_name'>");
		sb.append("	이름:"+guest.getGuest_name());
		sb.append("</div>");
		sb.append("<div class='guest_email'>");
		sb.append("	이메일:"+guest.getGuest_email());
		sb.append("</div>");
		sb.append("<div class='guest_homepage'>");
		sb.append("	홈페이지:"+guest.getGuest_homepage());
		sb.append("</div>");
		sb.append("<div class='guest_content'>");
		sb.append("	내용:"+guest.getGuest_content());
		sb.append("</div>");
		sb.append("<div class='guest_delete'>");
		sb.append("		<input type='button' value='삭제' guest_no='"+guest.getGuest_no()+"'>");
		sb.append("		<input type='button' value='수정' guest_no='"+guest.getGuest_no()+"'>");
		sb.append("</div>");
		return sb.toString();
	}
	
	@RequestMapping(value = "guest/guest_detail_xml", produces = "text/xml;charset=UTF-8")
	public String guest_detail_xml() throws Exception {
		return "";
	}
	
	@RequestMapping(value = "guest/guest_detail_json", produces = "application/json;charset=UTF-8")
	public List<Guest> guest_detail_json(@RequestParam(value = "guest_no")int  guest_no) throws Exception {
		return null;
	}
	
	
}
