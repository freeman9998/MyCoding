package com.itwill.tag;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {
	public HelloTag() {
		System.out.println("1.HelloTag()기본생성자");
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("2.doStartTag()");
		try {
			JspWriter out= pageContext.getOut();
			HttpSession session = pageContext.getSession();
			String sUserId=(String)session.getAttribute("sUserId");
			if(sUserId==null) {
				sUserId="GUEST";
			}
			out.println(sUserId+" 님 안뇽하세요!!<br>");
		} catch (IOException e) {
			throw new JspException(e.getMessage());
		}
		return super.doStartTag();
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("3.doEndTag()");
		return super.doEndTag();
	}
	
}
