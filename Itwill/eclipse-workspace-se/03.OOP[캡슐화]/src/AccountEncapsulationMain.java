


public class AccountEncapsulationMain {

	public static void main(String[] args) {
		Account account1=new Account();
		/*
		<<The field Account.no is not visible>>
		account1.no=1111;
		account1.owner="KIM";
		account1.balance=80000;
		account1.iyul=0.3;
		*/
		account1.setAccountData(
				1111, "KIM", 80000, 0.3);
		
		//10000원출금
		account1.withDraw(10000);
		//800 입금
		account1.deposit(800);
		/*
		<< The field Account.balance is not visible>>
		int account1Balance=account1.balance;
		*/
		int account1Balance=account1.getBalance();
		System.out.println("account1잔고조회:"
							+account1Balance);
		account1.print();
		
		Account account2=new Account();
		account2.setAccountData(2222, "LEE", 50000, 0.1);
		account2.deposit(300);
		//이율변경
		/*
		<<The field Account.iyul is not visible>>
		account2.iyul=0.01;
		*/
		account2.print();
		account2.setIyul(0.5);
		account2.print();
		System.out.println();
		System.out.println();
		System.out.println("---------모든계좌출력-----------");
		account2.headerPrint();
		account1.print();
		account2.print();
	
		
		

	}

}
