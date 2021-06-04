package com.itwill01.method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		//객체 생성
		
		int result=calculator.add(23,34);
		//calculator.add 메소드 호출하고 결과값 리턴 받기
		System.out.println(result);
		
		result=calculator.sub(23,34);
		//calculator.sub 메소드 호출하고 결과값 리턴 받기
		System.out.println(result);
		
		result=calculator.mul(23,34);
		//calculator.mul 메소드 호출하고 결과값 리턴 받기
		System.out.println(result);
		
		result=calculator.div(45435,34);
		//calculator.div 메소드 호출하고 결과값 리턴 받기
		System.out.println(result);
		
		
	}

}