package com.itwill05.service.account;

/*
 * Account객체전체에관련된 업무를 실행할클래스
 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 		2.계좌객체들을 사용해서 업무실행
 */
 
public class AccountService {
	
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "FIM", 89000, 4.7),
			new Account(4444, "XIM", 34000, 6.7),
			new Account(5555, "hIM", 78000, 3.7),
			new Account(6666, "KIM", 89000, 5.7),
			new Account(7777, "KIM", 89000, 4.7),
			new Account(8888, "qIM", 91000, 1.7),
			new Account(9999, "mIM", 12000, 0.7),
	};
	
	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(Account newAccount) {
		System.out.println(">>>>>>>>> 배열.length 전: "+accounts.length);		
		Account[] ac = new Account[accounts.length+1];
		System.out.println(">>>>>>>>> 배열.length 후: "+ac.length);
		for (int i = 0; i < accounts.length; i++) {
				ac[i] = accounts[i];
			for (int j = 0; j < ac.length; j++) {
				if (ac[j]==null) {
					ac[j] = newAccount;
					break;
				}
			}
		}
		accounts=ac;
	}
	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {		
		System.out.println(">>>>>>>>> 배열.length 전: "+accounts.length);		
		Account[] ac = new Account[accounts.length+1];
		System.out.println(">>>>>>>>> 배열.length 후: "+ac.length);
		for (int i = 0; i < accounts.length; i++) {
			ac[i] = accounts[i];
			for (int j = 0; j < ac.length; j++) {
				if (ac[j]==null) {			
					ac[j] = new Account(no,owner,balance,iyul);
					break;
				}
			}
		}
		accounts=ac;
	}
	
	/*
	 1.은행계좌들 총계좌수출력메쏘드정의
	 */
	public void totAccountNumberPrint() {
		System.out.println(">>은행총계좌수:"+accounts.length);
	}
	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
	}
		
	
	/*
	 * 3.은행계좌들 총잔고 출력메쏘드 정의
	 */
	public void totBalancePrint() {
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance+=accounts[i].getBalance();
		}
		System.out.println(">>은행계좌총잔고:"+totBalance);
	}
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].print();
				break;
			}
		}
	}	
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance()>=balance) {
				accounts[i].print();
			}
		}
	}
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/ 
	public void findByIyulPrint(double iyul) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul()>=iyul) {
				accounts[i].print();
				
			}
		}
	}
	/*
	7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력
	 */ 
	public void findByNamePrint(String owner) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(owner)) {
				accounts[i].print();
			}
		}
	}
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void ipGum(int no , int m) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {
				accounts[i].deposit(m);
				break;
			}
		}
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void chulGum(int no , int m) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {
				accounts[i].withDraw(m);
				break;
			}
		}
	}
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortByBalanceAscending() {
		
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {				 
					Account ac = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = ac;
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
	public void sortByBalanceDescending() {
		
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if (accounts[j].getBalance() < accounts[j+1].getBalance()) {
					Account ac = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = ac;
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	/*
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==updateAccount.getNo()) {
				accounts[i].setOwner(updateAccount.getOwner());
				accounts[i].setBalance(updateAccount.getBalance());
				accounts[i].setIyul(updateAccount.getIyul());
				accounts[i].print();
				break;
			}
		}
	}
	/*
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo()==no) {			
				accounts[i].setAccountData(no, owner, balance, iyul);
				accounts[i].print();
				break;
			}
		}
	}
}