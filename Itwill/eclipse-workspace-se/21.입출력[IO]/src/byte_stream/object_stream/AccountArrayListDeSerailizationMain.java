package byte_stream.object_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import byte_stream.filter_stream.Account;

public class AccountArrayListDeSerailizationMain {

	public static void main(String[] args) throws Exception{
		ObjectInputStream ois=
				new ObjectInputStream(
						new FileInputStream("accList.ser"));
		List<Account> accList=(List<Account>)ois.readObject();
		Account.headerPrint();
		for (Account account : accList) {
			account.print();
		}
		System.out.println("accList.ser -->DeSerailization--> ArrayList<Account>  ");
	}

}
