

public class CalculatorStaticMain {

	public static void main(String[] args) {
		System.out.println("--------객체를통해 static 접근----------");
		/*
		//The constructor Calculator() is not visible
		Calculator calculator=new Calculator();
		int result=calculator.add(23,34);
		System.out.println(result);
		result=calculator.sub(23,34);
		System.out.println(result);
		result=calculator.mul(23,34);
		System.out.println(result);
		result=calculator.div(45435,34);
		System.out.println(result);
		*/
		System.out.println("---------static way----------");
		int result2=Calculator.add(1, 2);
		System.out.println(result2);
		result2=Calculator.mul(1, 2);
		System.out.println(result2);
		result2=Calculator.sub(1, 2);
		System.out.println(result2);
		result2=Calculator.div(1, 2);
		System.out.println(result2);
		
	}

}










