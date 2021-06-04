package report1215;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
		int resultAdd=calculator.add(23,34);
		System.out.println(resultAdd);
		
		int resultSubstract=calculator.substract(23,34);
		System.out.println(resultSubstract);
		
		double resultDiv=calculator.div(23,34);
		System.out.println(resultDiv);
		
		int resultMulti=calculator.multiple(23,34);
		System.out.println(resultMulti);
			
	}

}