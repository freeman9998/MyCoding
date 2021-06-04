package com.itwill.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloAttributeTag extends TagSupport{
	private String name;
	
	public void setName(String name) {
		System.out.println("2.HelloAttributeTag.setName("+name+")");
		this.name = name;
	}

	public HelloAttributeTag() {
		System.out.println("1.HelloAttributeTag()생성자");
	}
	
	@Override
	public int doStartTag() throws JspException {
		String msg="";
		if(name==null) {
			name="손";
		}
		if(name.equals("김경호")) {
			msg="잘생긴 "+name+"님 안녕하세요!!<br>";
		}else {
			msg=name+" 님 안녕하세요!!<br>";
		}
		try {
			pageContext.getOut().println(msg);
		}catch (Exception e) {
		}
		
		
		return super.doStartTag();
	}
	@Override
	public int doEndTag() throws JspException {
		return super.doEndTag();
	}
}
