import java.io.IOException;
import java.net.Socket;

public class ExceptionMultiCatchMain {

	public static void main(String[] args) {
		
		System.out.println("stmt1");
		try {
			System.out.println("stmt2");
			Class.forName("First");
			System.out.println("stmt3");
			Socket socket=new Socket("www.naver.com",80);
			System.out.println("stmt4");
			First first=new First();
			first.method1();
			System.out.println("stmt5");
		}catch(ClassNotFoundException e) {
			System.out.println("catch ClassNotFoundException start");
			System.out.println("catch msg:"+e.getMessage());
			System.out.println("catch ClassNotFoundException end");
		}catch (IOException e) {
			System.out.println("catch IOException start");
			System.out.println("catch msg:"+e.getMessage());
			System.out.println("catch IOException end");
		}
		System.out.println("stmt6");
	}

}
