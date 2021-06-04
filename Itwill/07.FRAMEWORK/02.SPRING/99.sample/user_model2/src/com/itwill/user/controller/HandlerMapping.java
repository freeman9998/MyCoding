package com.itwill.user.controller;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
 * 설정파일로부터 Controller객체를 생성하고
 * DispatcherServlet의 요청에의해 Controller객체반환
 */
public class HandlerMapping {
	HashMap<String, Controller> mapping;
	
	public HandlerMapping(String configFilePath) {
		mapping=new HashMap<String, Controller>();
		
		FileInputStream fis=null;
		try{
			fis=new FileInputStream(configFilePath);
			Properties prop=new Properties();
			prop.load(fis);
			
			Set keySet=prop.keySet();
			Iterator<String> keyIter = keySet.iterator();
			System.out.println("-------------properties--------------");
			while (keyIter.hasNext()) {
				String urlKey = (String) keyIter.next();
				String controllerClassStr=prop.getProperty(urlKey);
				System.out.println(urlKey+" = "+controllerClassStr);
				Class cclazz=Class.forName(controllerClassStr);
				Controller controler=(Controller)cclazz.newInstance();
				mapping.put(urlKey, controler);
				
			}
			System.out.println("-----------------------------------");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public Controller getController(String command) {
		return mapping.get(command);
		
	}
}
