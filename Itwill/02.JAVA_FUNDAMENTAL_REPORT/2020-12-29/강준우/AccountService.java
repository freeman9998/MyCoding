package com.itwill05.service.account;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * Account객체전체에관련된 업무를 실행할클래스
 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 		2.계좌객체들을 사용해서 업무실행
 */
 
public class AccountService {
	
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIMDDF", 45000, 2.7),
			new Account(3333, "FIMSD", 89000, 4.7),
			new Account(4444, "XIMSD", 34000, 6.7),
			new Account(5555, "hIM", 78000, 3.7),
			new Account(6666, "KIM", 89000, 5.7),
			new Account(7777, "KIM", 89000, 4.7),
			new Account(8888, "qIMGG", 91000, 1.7),
			new Account(9999, "mIMFF", 12000, 0.7),
	};
	
	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가
	*/
	public void addAccount(Account account) {
		Account[] tempAccount = new Account[accounts.length+1];
		for (int i = 0; i < tempAccount.length-1; i++) {
			tempAccount[i]=accounts[i];
		}
		for (int i = 0; i < tempAccount.length; i++) {
			if (tempAccount[i]==null) {
				tempAccount[i]=account;
				break;
			}
		} accounts=tempAccount;
	}
	/*
	 1.은행계좌들 총계좌수출력메쏘드정의
	 */
	public void totAccountsCount(){
		System.out.println(accounts.length);
	}
	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void totAccountsInfo() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	/*
	 1.첫글자 대문자
	 2.5자리로출력
	 3.첫글자이외에는****(4개)
	---------------------------------------
	번호	이름	 잔고	 이율
	---------------------------------------
	1111	K****	 89000	 1.3
	2222	A****	 45000	 2.7
	3333	F****	 23000	 4.7
	4444	X****	 34000	 6.7
	5555	H****	 78000	 3.7
	6666	K****	 99000	 5.7
	7777	K****	 89000	 4.7
	8888	Q****    91000	 1.7
	9999	M****    12000	 0.7
	*/
	/*
	 * 3.은행계좌들 총잔고 출력메쏘드 정의
	 */
	public void totBalance() {
		System.out.println("----각 계좌잔고----");
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].getBalance());
		}
		for (int i = 0; i < accounts.length; i++) {
			totBalance=totBalance+accounts[i].getBalance();
		}
		System.out.println("----총 계좌잔고----");
		System.out.println(totBalance);
	}
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void oneAccountprint(int account) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==account) {
				System.out.println(accounts[i].getNo());
				break;
			}
		}
	}
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void overBalance(int balance) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance()>=balance) {
				accounts[i].print();
			}
		}
	}
	
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/ 
	public void overIyul(double iyul) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul()>=iyul) {
				accounts[i].print();
			}
		}
	}
	
	/*
	7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력
	 */ 
	public void equalAccounts(String owner) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(owner)) {
				accounts[i].print();
			}
		}
	}
	
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void deposit(int no, int deposit) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].setBalance(accounts[i].getBalance()+deposit);
				System.out.print(accounts[i].getNo()+"\t"+accounts[i].getBalance());
				break;
			}
		}System.out.println();
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void withdraw(int no, int withdraw) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {
				accounts[i].setBalance(accounts[i].getBalance()-withdraw);
				System.out.print(accounts[i].getNo()+"\t"+accounts[i].getBalance());
				break;
			}
		}System.out.println();
	}
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void ascendingOrder() {
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance()>accounts[j+1].getBalance()) {
					Account trans=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=trans;
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	
	
	
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void descendingOrder() {
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if (accounts[j].getBalance()<accounts[j+1].getBalance()) {
					Account trans=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=trans;
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	/*
	12.6666번 계좌객체 인자로 받아서 이름,잔고,이율 수정(update)
	*/
	public void updateAccount6(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==account.getNo()) {
				accounts[i]=account;
				accounts[i].print();
				break;
			}
		}
	}
	
	
	/*
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)
	*/
	public void updateAccount(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("수정할 번호를 입력하세요");
		int no=scanner.nextInt();
		System.out.println("수정할 이름을 입력하세요");
		String owner=scanner.next();
		System.out.println("수정할 잔고를 입력하세요");
		int balance=scanner.nextInt();
		System.out.println("수정할 이율을 입력하세요");
		double iyul=scanner.nextDouble();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {
				accounts[i].setNo(no);
				accounts[i].setOwner(owner);
				accounts[i].setBalance(balance);
				accounts[i].setIyul(iyul);
				accounts[i].print();
			}
		}
	}
	
}
