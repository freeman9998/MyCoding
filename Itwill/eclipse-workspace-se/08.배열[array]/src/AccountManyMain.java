class AccountMany{
	Account acc0;
	Account acc1;
	Account acc2;
	Account acc3;
	Account acc4;
}

public class AccountManyMain {

	public static void main(String[] args) {
		AccountMany accountMany=new  AccountMany();
		accountMany.acc0=new Account(1111, "KIM", 89000,0.6);
		accountMany.acc1=new Account(2222, "LIM", 39000,0.3);
		accountMany.acc2=new Account(3333, "JIM", 29000,0.2);
		accountMany.acc3=new Account(4444, "OIM", 45000,0.1);
		accountMany.acc4=new Account(5555, "PIM", 12000,0.8);
		Account.headerPrint();
		accountMany.acc0.print();
		accountMany.acc1.print();
		accountMany.acc2.print();
		accountMany.acc3.print();
		accountMany.acc4.print();
		

	}

}
