package com.itwill05.service.account;

public class AccountService {
	
	/*
	 * Account객체전체에관련된 업무를 실행할클래스
	 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
	 * 		2.계좌객체들을 사용해서 업무실행
	 */
	private Account[] accs= {
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
	public void addAccount(Account newAccount) {
		
		Account[] temp = new Account[accs.length+1];
		
		for(int i = 0 ; i < accs.length; i++) {
				temp[i] =accs[i];
		}
		
		temp[accs.length] = newAccount;

		accs = temp;
		
	}
	
	/*
	 1.은행계좌들 총계좌수출력메쏘드정의
	 */
	public void totAccountNumberPrint() {
		System.out.println("은행 총 계좌 수: " + accs.length);
	}
	
	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for(int i = 0 ; i < accs.length ; i++) {
			accs[i].print();
		}
	}
	
	/*
	 * 3.은행계좌들 총잔고 출력메쏘드 정의
	 */
	public void totBalancePrint() {
		int totBalance=0;
		for (int i = 0; i < accs.length; i++) {
			totBalance+=accs[i].getBalance();
		}
		System.out.println("은행계좌 총 잔고 : "+totBalance);
	}
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		for (int i = 0; i < accs.length; i++) {
			if(accs[i].getNo()==no) {
				accs[i].print();
				break;
			}
		}
	}
		
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {
		for (int i = 0; i < accs.length; i++) {
			if(accs[i].getBalance()>=balance) {
				accs[i].print();
			}
		}
	}
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/ 
	public void findByIyulPrint(double inter) {
		for (int i = 0; i < accs.length; i++) {
			if(accs[i].getInter()>=inter) {
				accs[i].print();
			}
		}
	}
	/*
	7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력
	 */ 
	public void findByNamePrint(String name) {
		for (int i = 0; i < accs.length; i++) {
			if(accs[i].getOwner().equals(name)) {
				accs[i].print();
			}
		}
	}
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void ipGum(int no, int money) {
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getNo() == no) {
				accs[i].deposit(money);
				break;
			}
		}
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void chulGum(int no, int money) {
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getNo() == no) {
				accs[i].withDraw(money);
				break;
			}
		}		
	}
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortByBalanceAscending() {
		for(int j = 0; j <accs.length-1; j++) {
			for(int i = 0 ; i < accs.length-1; i++) {
				if(accs[i].getBalance() > accs[i+1].getBalance()) {
					Account a = accs[i+1];
					accs[i+1]= accs[i];
					accs[i] = a;
				}
			}
		}
	}
	
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDescending() {
		for(int i = 0; i <accs.length-1; i++) {
			for(int j = 0 ; j < accs.length-1; j++) {
				if(accs[j].getBalance() < accs[j+1].getBalance()) {
					Account a = accs[j+1];
					accs[j+1]= accs[j];
					accs[j] = a;
				}
			}
		}
	}	
	/*
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getNo() == updateAccount.getNo()) {
				accs[i] = updateAccount;
				break;
			}
		}
		
	}
	/*
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getNo() == no) {
				accs[i].setOwner(owner);
				accs[i].setBalance(balance);
				accs[i].setInter(iyul);
				break;
			}
		}
	}
	
}