package com.itwill01.field;

public class CalculatorMain {

	public static void main(String[] args) {
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
		
		Calculator cal=new Calculator();
		
		int addResult = cal.add(23, 34);
		System.out.println("main --> addResult : " + addResult);
		
		int subResult = cal.sub(23, 34);
		System.out.println("main --> subResult : " + subResult);
		
		int divResult = cal.div(45435, 34);
		System.out.println("main --> divResult : " + divResult);
		
		int mulResult = cal.mul(23, 34);
		System.out.println("main --> mulResult : " + mulResult);
		
		
		
	}

}
