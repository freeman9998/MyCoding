
public class CalculatorMain {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		System.out.println(c.add(1, 2));
		System.out.println(c.add(1, 2, 3));
		System.out.println(c.add(1, 2, 3, 4));
		System.out.println(c.add(1, 2, 3, 4, 5));

	}

}
