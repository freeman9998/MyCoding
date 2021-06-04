package com.itwill.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.cart.model.CartService;
import com.itwill.member.model.Member;
import com.itwill.member.model.MemberService;
import com.itwill.summer.Controller;

public class MyPageMyInfoActionController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		String m_id = request.getParameter("m_id");
		String m_name = request.getParameter("m_name");
		String m_jumin = request.getParameter("m_jumin");
		String m_pwd = request.getParameter("m_pwd");
		String m_phone = request.getParameter("m_phone");
		String m_email = request.getParameter("m_email");
		String m_address = request.getParameter("m_address");
		String m_no = request.getParameter("m_no");
	    String forwardPath = null;
		try {
			Member member = new Member(Integer.parseInt(m_no),m_id,m_pwd,m_name,m_jumin,m_phone,m_email,m_address);
			MemberService memberService = new MemberService();
			boolean isSuccess = memberService.update(member);
			HttpSession session = request.getSession();
			session.removeAttribute("member");
			session.setAttribute("member", member);
			if (session.getAttribute("member") != null) {
				int m_no7 = (int)session.getAttribute("m_no");
				System.out.println(m_no7);
				CartService cs = new CartService();
				int cartCount = cs.cartCount(m_no7);
				request.setAttribute("cartCount", cartCount);
			}
			forwardPath = "redirect:McDelivery_main.do";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return forwardPath;
	}


}
