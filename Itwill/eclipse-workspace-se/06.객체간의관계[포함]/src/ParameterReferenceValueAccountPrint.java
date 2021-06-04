
public class ParameterReferenceValueAccountPrint {
	
	public void printInt(int i) {
		System.out.println("printInt:"+i);
	}
	
	public void printAccount(Account account) {
		account.deposit(99999999);
		account.print();
		
	}
	
}
