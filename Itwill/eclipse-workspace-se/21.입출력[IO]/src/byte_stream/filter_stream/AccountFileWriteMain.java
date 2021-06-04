package byte_stream.filter_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class AccountFileWriteMain {

	public static void main(String[] args) throws Exception {
		/*
		 * Account객체 내용 --> 파일로저장
		 */
		Account account1=new Account(1111, "KIM", 89000, 1.2);
		Account account2=new Account(2222, "LEE", 34000, 1.0);
		
		DataOutputStream accountDos=
				new DataOutputStream(
						new FileOutputStream("accounts.dat"));
		accountDos.writeInt(account1.getNo());
		accountDos.writeUTF(account1.getOwner());
		accountDos.writeInt(account1.getBalance());
		accountDos.writeDouble(account1.getIyul());
		
		accountDos.writeInt(account2.getNo());
		accountDos.writeUTF(account2.getOwner());
		accountDos.writeInt(account2.getBalance());
		accountDos.writeDouble(account2.getIyul());
		
		accountDos.close();
		System.out.println(">>>>Account객체data --> accounts.dat파일에저장");
		
	}

}
