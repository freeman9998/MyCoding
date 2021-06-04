package com.itwill05.service.account.account;

/*
 * Account객체전체에관련된 업무를 실행할클래스
 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 		2.계좌객체들을 사용해서 업무실행
 */

public class AccountService {
	public final static int FIELD_NO = 1;
	public final static int FIELD_OWNER = 2;
	public final static int FIELD_BALANCE = 3;
	public final static int FIELD_INTEREST = 4;
	public final static int SORT_ASC = 1;
	public final static int SORT_DSC = 2;

	private Account[] accounts = { new Account(1111, "KIM", 89000, 1.3), new Account(2222, "AIMDDF", 45000, 2.7),
			new Account(3333, "FIMSD", 89000, 4.7), new Account(4444, "XIMSD", 34000, 6.7),
			new Account(5555, "hIM", 78000, 3.7), new Account(6666, "KIM", 89000, 5.7),
			new Account(7777, "KIM", 89000, 4.7), new Account(8888, "qIMGG", 91000, 1.7),
			new Account(9999, "mIMFF", 12000, 0.7) };

	/*
	 * 0.계좌객체를 인자로받아서 Account[]에 추가
	 */
	public void addAccount(Account newAccount) {
		Account[] tempAccounts = new Account[accounts.length + 1];
		for (int j = 0; j < accounts.length; j++) {
			tempAccounts[j] = accounts[j];
		}
		tempAccounts[accounts.length] = newAccount;
		accounts = tempAccounts;

	}

	/*
	 * 0.계좌데이터를 인자로 받아서 Account[]에 추가
	 */
	public void addAccount(int no, String owner, int balance, double interest) {
		Account[] tempAccounts = new Account[accounts.length + 1];
		for (int j = 0; j < accounts.length; j++) {
			tempAccounts[j] = accounts[j];
		}
		tempAccounts[accounts.length] = new Account(no, owner, balance, interest);
		accounts = tempAccounts;
	}

	/*
	 * 1.은행계좌들 총계좌수출력메소드 정의
	 */
	public void totalAccountNumberPrint() {
		System.out.println("은행총계좌수: " + accounts.length);
		System.out.println();
	}

	/*
	 * 2.은행계좌들 전체출력메소드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println();
	}

	/*
	 * 3.은행계좌들 총잔고 출력메소드 정의
	 */
	public void totalBalancePrint() {
		int totalBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			totalBalance += accounts[i].getBalance();
		}
		System.out.println(">>은행계좌총잔고: " + totalBalance);
		System.out.println();
	}

	/*
	 * 4.계좌번호 인자로받아서 계좌 한 개 출력
	 */
	public void findByNoPrint(int no) {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].print();
				break;
			}
		}
		System.out.println();
	}

	/*
	 * 5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= balance) {
				accounts[i].print();
			}
		}
		System.out.println();
	}

	/*
	 * 6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	 */
	public void findByInterestPrint(double interest) {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getinterest() >= interest) {
				accounts[i].print();
			}
		}
		System.out.println();
	}

	/*
	 * 7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력
	 */
	public void findByNamePrint(String owner) {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(owner)) {
				accounts[i].print();
			}
		}
		System.out.println();
	}

	/*
	 * 8.계좌번호,입금할돈 인자로 받아서 입금
	 */
	public void deposit(int no, int m) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].deposit(m);
				break;
			}
		}
	}

	/*
	 * 9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public void withdraw(int no, int m) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].withdraw(m);
				break;
			}
		}
	}

	/*
	 * 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortByBalanceAscending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - (i + 1); j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
				}

			}
		}
	}

	/*
	 * 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDescending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - (i + 1); j++) {
				if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
				}

			}
		}
	}

	/*
	 * 12.계좌객체를 인자로 받아서 이름, 잔고, 이율 수정(update)
	 */
	public void updateAccount(Account updateAccount) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == updateAccount.getNo()) {
				accounts[i] = updateAccount;
				break;
			}
		}

	}

	/*
	 * 13.번호, 이름, 잔고, 이율을 인자로받아서 계좌객체수정(update)
	 */
	public void updateAccount(int no, String owner, int balance, double interest) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].setAccountData(no, owner, balance, interest);
				break;
			}
		}
	}
}