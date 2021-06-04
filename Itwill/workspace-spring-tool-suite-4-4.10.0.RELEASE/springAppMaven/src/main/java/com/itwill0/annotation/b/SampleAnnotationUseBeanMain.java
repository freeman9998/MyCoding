package com.itwill0.annotation.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SampleAnnotationUseBeanMain {

	public static void main(String[] args) throws Exception{
			
			Class clazz1= SampleAnnotationUseBean.class;
			Class clazz2= Class.forName("com.itwill0.annotation.b.SampleAnnotationUseBean");
			
			Class clazz=clazz1;
			
			Field[] fields=clazz.getFields();
			Method[] methods=clazz.getMethods();
			Constructor[] constructors=clazz.getConstructors();
			
			System.out.println("------------클래스-----------------------");
			SampleAnnotation classSampleAnnotation=(SampleAnnotation)clazz.getAnnotation(SampleAnnotation.class);
			if(classSampleAnnotation!=null) {
				System.out.println(classSampleAnnotation.value());
				System.out.println(classSampleAnnotation.count());
				System.out.println(classSampleAnnotation.required());
				System.out.println(classSampleAnnotation.strArray()[0]);
				System.out.println(classSampleAnnotation.strArray()[1]);
				
			}
			
			System.out.println("------------생성자-----------------------");
			for (Constructor constructor : constructors) {
				System.out.println(constructor);
				SampleAnnotation annotation = (SampleAnnotation)constructor.getAnnotation(SampleAnnotation.class);
				if(annotation!=null) {
					System.out.println(annotation.value());
					System.out.println(annotation.count());
					System.out.println(annotation.required());
				}
			}
			
			System.out.println("------------멤버변수-----------------------");
			for (Field field : fields) {
				System.out.println(field);
				SampleAnnotation annotation = (SampleAnnotation)field.getAnnotation(SampleAnnotation.class);
				if(annotation!=null) {
					System.out.println(annotation.value());
					System.out.println(annotation.count());
					//field.set(null, annotation.count());
					System.out.println(annotation.required());
				}
			}
			System.out.println("--------------메쏘드--------------------");
			for (Method method:methods) {
				System.out.println(method);
				SampleAnnotation annotation = (SampleAnnotation)method.getAnnotation(SampleAnnotation.class);
				if(annotation!=null) {
					System.out.println(annotation.value());
					System.out.println(annotation.count());
					System.out.println(annotation.required());
				}
			}
			System.out.println("-----------------------------------");
		}
		

	}


