package com.itwill00.variable.김동현;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator C =new Calculator();
		
		int result= C.add(23,34);
		System.out.println(result);
		
		result=C.sub(23,34);
		System.out.println(result);
		
		result= C.div(20,4);
		System.out.println(result);
		
		result= C.mul(23,34);
		System.out.println(result);
		
	}
}