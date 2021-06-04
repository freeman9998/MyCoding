import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ExceptionCatchMain {

	public static void main(String[] args)  {
		
		System.out.println("stmt1-1");
		try {
			System.out.println("stmt1-2");
			Class.forName("xxxx");
			System.out.println("stmt1-3");
		}catch (ClassNotFoundException e) {
			/*
			 * catch블록-->예외발생시 실행되는 블록
			 *   - 메세지출력
			 *   - 프로그램 정상실행을위한코드
			 */
			System.out.println("stmt1-4[catch]");	
			String errorMsg=e.getMessage();
			System.out.println("catch msg:"+errorMsg);
			System.out.println("stmt1-5[catch]");
			/*
			JOptionPane.showMessageDialog(null, "호갱님 죄송합니다!!");
			*/
		}
		
		
		System.out.println("stmt2-1");
		try {
			System.out.println("stmt2-2");
			Socket socket=new Socket("www.ertreter.com",80);
			System.out.println(socket);
			System.out.println("stmt2-3");
		}catch (IOException e) {
			System.out.println("stmt2-4[catch]");
			System.out.println("catch msg:"+e.getMessage());
			System.out.println("stmt2-5[catch]");
		}
		
		First first=new First();
		System.out.println("stmt3-1");
		try {
			System.out.println("stmt3-2");
			first.method1();
			System.out.println("stmt3-3");
		} catch (IOException e) {
			System.out.println("stmt3-4[catch]");
			System.out.println("catch msg:"+e.getMessage());
			System.out.println("stmt3-5[catch]");
		}
		
		System.out.println("stmt4");
	}

}



















