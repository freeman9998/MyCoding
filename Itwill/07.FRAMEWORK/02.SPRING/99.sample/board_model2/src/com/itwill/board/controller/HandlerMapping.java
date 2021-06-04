package com.itwill.board.controller;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class HandlerMapping {
	
	HashMap<String, Controller> mapping;
	
	public HandlerMapping(String configFilePath) {
		
		mapping = new HashMap<String, Controller>();
		FileInputStream fis =null;
		try{
			 fis = new FileInputStream(configFilePath);
			 Properties prop = new Properties();
			 prop.load(fis);
			 
			 Set keySet = prop.keySet();
			 Iterator<String> keyIter = keySet.iterator();
			 while(keyIter.hasNext()){
				 String urlKey = (String)keyIter.next();
				 String controllerClassStr = prop.getProperty(urlKey);
				 System.out.println(urlKey+"-key확인"+controllerClassStr+"-controllerClass확인");
				 Class cclazz = Class.forName(controllerClassStr);
				 Controller controller = (Controller)cclazz.newInstance();
				 
				 mapping.put(urlKey, controller);
			 }
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public Controller getController(String command){//mapping에서 command로 Controller 반환 -> DispathcherServlet
		return mapping.get(command);
	}
}
