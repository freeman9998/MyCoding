package com.itwill0.annotation;

import java.util.HashMap;

public class SpringApplicationContext {
	private HashMap beanMap=new HashMap();
	
	public <T> SpringApplicationContext(String classFullName) throws Exception {
		Class<T> clazz =(Class<T>)Class.forName(classFullName);
		Component annotation = (Component)clazz.getAnnotation(Component.class);
		if(annotation!=null && annotation.annotationType()==Component.class) {
			T instance = (T)clazz.newInstance();
			String beanName=annotation.value();
			if(beanName.equals("")) {
				String className = instance.getClass().getSimpleName();
				beanMap.put(className,instance);
			}else {
				beanMap.put(beanName,instance);
			}
			
		}
	}
	public  Object getBean(String name){
		Object bean =beanMap.get(name);
		return bean;
	}
	
	
}