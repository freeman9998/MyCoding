package com.itwill.config;
import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/*
web.xml을 대신할 java 클래스
 - DispatcherServlet 생성초기화[AbstractAnnotationConfigDispatcherServletInitializer]
*/
public class WebXMLConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
	public WebXMLConfig() {
		System.out.println("###############WebXMLConfig[web.xml]################");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ApplicationContextConfig.class };
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebApplicationContextConfig.class };
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.do"};
	}
	@Override
	protected Filter[] getServletFilters() {
		// CharacterEncodingFilter
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter("UTF-8", true, true);
		return new Filter[] { characterEncodingFilter };
	}
}
