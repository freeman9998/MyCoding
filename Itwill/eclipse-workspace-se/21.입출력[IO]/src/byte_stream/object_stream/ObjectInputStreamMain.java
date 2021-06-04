package byte_stream.object_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import byte_stream.filter_stream.Account;

public class ObjectInputStreamMain {

	public static void main(String[] args) throws Exception, IOException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("objects.ser"));
		System.out.println("----objects.ser-->String Object------");
		String msg1=(String)ois.readObject();
		System.out.println(msg1);
		System.out.println("----objects.ser-->Integer Object------");
		Integer wi2=(Integer)ois.readObject();
		System.out.println(wi2);
		System.out.println("----objects.ser-->Account Object------");
		Account account1=(Account)ois.readObject();
		account1.print();
		System.out.println("----objects.ser-->Account Object------");
		Account account2=(Account)ois.readObject();
		account2.print();
		ois.close();
	}

}
