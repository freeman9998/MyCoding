package com.itwill01.field;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
		int result=calculator.add(23,34); //더하기
		System.out.println(result);
		result=calculator.sub(23,34); //뺄셈
		System.out.println(result);
		result=calculator.mul(23,34); //곱셈
		System.out.println(result);
		result=calculator.div(45435,34); //나누기
		System.out.println(result);
		

	}

}
