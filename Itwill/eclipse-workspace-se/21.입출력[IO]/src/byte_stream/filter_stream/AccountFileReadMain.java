package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class AccountFileReadMain {

	public static void main(String[] args) throws Exception{
		/*
		 * 파일(accounts.dat) --> Account객체내용읽어서 Account객체생성
		 */
		System.out.println(">>>파일(accounts.dat) --> Account객체내용읽어서 Account객체생성");
		DataInputStream accountDis=
				new DataInputStream(
						new FileInputStream("accounts.dat"));
		Account account1=
				new Account(accountDis.readInt(),
						    accountDis.readUTF(),
						    accountDis.readInt(), 
						    accountDis.readDouble());
		
		Account account2=
				new Account(accountDis.readInt(),
						accountDis.readUTF(),
						accountDis.readInt(), 
						accountDis.readDouble());
		accountDis.close();
		Account.headerPrint();
		account1.print();
		account2.print();
		
	}

}
