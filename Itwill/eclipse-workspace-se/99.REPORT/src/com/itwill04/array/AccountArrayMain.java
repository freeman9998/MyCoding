package com.itwill04.array;

public class AccountArrayMain {

	public static void main(String[] args) {
		
		System.out.println("-------------참조형배열객체 초기화--------------");
		Account acc1=new Account(1111, "KIM", 56800, 0.3);
		
		Account[] accounts= {
				acc1,
				new Account(2222, "KIM", 56000, 0.9),
				new Account(3333, "PAR", 12000, 1.9),
				new Account(4444, "CHO", 89000, 4.9),
				new Account(5555, "SIM", 34000, 0.6),
				new Account(6666, "KIM", 77000, 0.1),
				new Account(7777, "KIM", 11000, 0.3),
				new Account(8888, "GIM", 21000, 2.4),
				new Account(9999, "QIM", 99000, 3.3)
		};
		
		System.out.println("1.은행 총계좌수:"+accounts.length);
		System.out.println("2.은행 계좌전체출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println("3.은행 계좌들 총잔고");
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance=totBalance+accounts[i].getBalance();
		}
		System.out.println(">>"+totBalance);
		/* 
		  READ 
		  계좌번호중복안됨
		  */
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println("5.은행 계좌들중에서 계좌잔고 50000원이상인 VIP계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=50000) {
				accounts[i].print();
			}
		}
		System.out.println("6.은행 계좌들중에서 계좌이율 2.0 이상인 계좌 여러개 찾아서 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>=2.0) {
				accounts[i].print();
			}
		}
		/*업무*/
		System.out.println("7.6666번계좌 3000원입금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].deposit(3000);
				accounts[i].print();
				break;
			}
		}
		System.out.println("8.9999번계좌 3000원출금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==9999) {
				accounts[i].print();
				accounts[i].withDraw(3000);
				accounts[i].print();
				break;
			}
		}
		System.out.println("9.계좌잔고순으로 내림차순정렬");
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance() < accounts[j+1].getBalance()) {
					//주소교체
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		System.out.println("-----------계좌잔고순으로 내림차순정렬후-------------");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
			
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬");
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getNo() > accounts[j+1].getNo()) {
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		System.out.println("-----------계좌번호순으로 오름(내림)차순정렬후-------------");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println("9.이름(String)순으로 오름차순정렬-------------");
		/*
		 * Quiz: 이름이 같을경우 잔고순 오름차순정렬(2차정렬)
		 */
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
					String firstName=accounts[j].getOwner();
					String secondName=accounts[j+1].getOwner();
					if(firstName.compareTo(secondName) > 0) {
						Account tempAccount = accounts[j];
						accounts[j]=accounts[j+1];
						accounts[j+1]=tempAccount;
					}
			}
		}
		System.out.println("-----------이름(String)순으로 오름차순정렬후-------------");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		/*
		 UPDATE
		 */
		System.out.println("10.5555계좌이율을 3.6으로변경");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==5555) {
				accounts[i].print();
				accounts[i].setIyul(3.6);
				accounts[i].print();
				break;
			}
		}
		System.out.println("11.모든계좌잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].deposit(50);
			accounts[i].print();
		}
	}
}
