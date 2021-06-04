package com.itwill01.method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int add = calculator.add(36, 42);
		System.out.println(add);
		
		int sub = calculator.sub(76, 22);
		System.out.println(sub);
		
		int div = calculator.div(3456, 16);
		System.out.println(div);
		
		int mul = calculator.mul(6524, 3);
		System.out.println(mul);

	}

}
