package com.itwill01.field;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int result=calculator.add(23,34);
		System.out.println(result);
	    result=calculator.sub(66,34);
		System.out.println(result);
	    double result=calculator.div(45,2);
		System.out.println(result);
		result=calculator.mul(23,34);
		System.out.println(result);
		

	}

}
