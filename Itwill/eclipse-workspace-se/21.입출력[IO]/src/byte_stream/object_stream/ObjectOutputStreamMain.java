package byte_stream.object_stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import byte_stream.filter_stream.Account;

public class ObjectOutputStreamMain {

	public static void main(String[] args) throws Exception{
		ObjectOutputStream oos=
				new ObjectOutputStream(new FileOutputStream("objects.ser"));
		System.out.println("-----------String Object write  --> objects.ser------------------");
		String msg1=new String("객체스트림");
		oos.writeObject(msg1);
		System.out.println("-----------Integer Object write --> objects.ser------------------");
		Integer wi2=new Integer(2147483647);
		oos.writeObject(wi2);
		System.out.println("-----------Account Object write1--> objects.ser------------------");
		Account account1=new Account(3434, "김경호", 34000, 0.02);
		/*
		 직렬화조건
		   1. 객체가 반드시 java.io.Serializable interface를 구현하여야한다.
		   2. java.io.Serializable interface는 추상메쏘드가존재하지않는 플래그 인터페이스이다.
		 */
		oos.writeObject(account1);
		System.out.println("-----------Account Object write2--> objects.ser------------------");
		Account account2=new Account(6776, "김성호", 99000, 0.3);
		oos.writeObject(account2);
		
		oos.flush();
		oos.close();
		

	}

}
