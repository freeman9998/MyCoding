package com.itwill01.method;

public class CalCulatorMain {

	public static void main(String[] args) {
		CalCulator calculator=new CalCulator();
		/*
		int result=calculator.add(23,34);
		System.out.println(result);
		result=calculator.sub(23,34);
		System.out.println(result);
		result=calculator.mul(23,34);
		System.out.println(result);
		result=calculator.div(45435,34);
		System.out.println(result);
		*/
		//변수 선언 및 멤버메쏘드를 이용해서 두 개의 값의 연산 값을 반환받고 변수에 대입(초기화)
		int result=calculator.add(23,34);
		System.out.println(result);
		result=calculator.sub(23,34);
		System.out.println(result);
		result=calculator.div(23,34);
		System.out.println(result);
		result=calculator.mul(45435,34);
		System.out.println(result);
	}
}
