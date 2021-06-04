package com.itwill0.annotation.a;


import java.lang.reflect.Field;
import java.util.Date;

import com.itwill0.annotation.b.SampleAnnotation;

public class AnnotationTest {

  public static void main(String[] args) throws Exception {
    User newUser = new User("이름", "비밀번호"); // 유저 생성
    System.out.println("before : " + newUser);
    setCreatedTime(newUser); // 생성일시 설정
    System.out.println(" after : " + newUser);
  }

  public static void setCreatedTime(Object target) throws Exception {
    Class<?> clazz = target.getClass();
    for (Field field : clazz.getDeclaredFields()) {
    	CreatedTime  createdTimeannotation =(CreatedTime)field.getAnnotation(CreatedTime.class);
    	System.out.println(createdTimeannotation);
    	if(createdTimeannotation!=null) {
    		System.out.println("sdsd");
    		field.setAccessible(true);
    		field.set(target, new Date());
    	}
    	
	}
  }
}