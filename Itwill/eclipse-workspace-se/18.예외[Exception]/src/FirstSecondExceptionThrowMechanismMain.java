import java.io.IOException;

public class FirstSecondExceptionThrowMechanismMain {
	public static void main(String[] args) throws RuntimeException,IOException{
		System.out.println("1.main 흐름 start");
		First first=new First();
		System.out.println("2.main 흐름 first.method1()호출");
		/*
		<< First >>
		public void method1() throws NullPointerException;
		 */
		first.method1();
		System.out.println("3.main 흐름 first.method1()반환");
		return;
	}

}
