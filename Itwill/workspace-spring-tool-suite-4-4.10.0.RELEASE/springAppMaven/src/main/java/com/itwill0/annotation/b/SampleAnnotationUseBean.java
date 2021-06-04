package com.itwill0.annotation.b;
@SampleAnnotation(count = 1,required = true,strArray = {"a","b"},value = "xxx")
public class SampleAnnotationUseBean {
	
	@SampleAnnotation(value ="김경호" )
	public String name;
	@SampleAnnotation(count = 33)
	public int age;
	
	@SampleAnnotation(count = 34)
	public SampleAnnotationUseBean() {
		
	}
	
	public SampleAnnotationUseBean(String name,int age) {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	@SampleAnnotation(count = 34)
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
