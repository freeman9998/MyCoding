import java.io.IOException;

public class Second {
	
	public void method2() throws NullPointerException,IOException{
		System.out.println("\t\t Second.method2() 실행");
		String str="";
		int length = str.length();
		/**********case1*****************/
		/*
		 1.JVM이 예외상황을 감지하고 예외객체(NullPointerException)를 생성
		 2.JVM은 생성한예외객체를 반환(return)방향으로 던진다.(throw)
		 3.실행중인 쓰레드는 실행을 멈추고 호출한곳(반환방향)으로 이동한다.
		 4.JVM은 던져진 예외객체의 메세지를 출력한후 shut down 
		 */
		/**********case2*****************/
		/*
		 * 1.내가 예외객체만든다.
		 * 2.내가 예외객체를 던진다.
		 * 3.실행중인 쓰레드는 실행을 멈추고 호출한곳(반환방향)으로 이동한다.
		 * 4.JVM은 던져진 예외객체의 메세지를 출력한후 shut down 
		 */
		
		IOException exception=
				new IOException("널예외사항발생"); 
		
		boolean b=true;
		if(b) {
			throw exception;
		}
		System.out.println("\t\t Second.method2() 반환");
		return;
	}
}
