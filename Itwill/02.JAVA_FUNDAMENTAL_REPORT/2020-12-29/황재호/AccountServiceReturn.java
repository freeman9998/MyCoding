package com.itwill05.service.accunt;
/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {
	public final static int FIELD_NO=1;
	public final static int FIELD_OWNER=2;
	public final static int FIELD_BALANCE=3;
	public final static int FIELD_IYUL=4;
	public final static int SORT_ASC=1;
	public final static int SORT_DESC=2;
	
	private Account[] accounts= {
			new Account(1111, "KIM", 85632, 5.9),
			new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2),
			new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2),
			new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2),
			new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2)
	};
	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(Account newAccount) {
		
	}
	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		
	}
	

	
	/*
	 * 1.은행계좌들 총계좌수 반환메써드
	 */
	public int getTotAccountNumber() {
		return this.accounts.length;
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
	 * 3.은행계좌들 총잔고를 반환하는 메쏘드
	 */
	public int getAccountTotBalance() {
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance+=accounts[i].getBalance();
		}
		return totBalance;
	}
	
	/*
	 * 4.계좌번호를 인자로받아서 계좌객체주소 한개반환
	 */
	public Account findNo(int no) {
		Account findAccount=null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				findAccount=accounts[i];
				break;
			}
		}
		return findAccount;
	}	
	/*
	 * 5.계좌잔고 인자로받아서 잔고이상인 계좌배열객체 참조변수반환
	 */
	public Account[] findBalance(int balance) {
		Account[] findAccounts=null;
		/*
		 * A. 만족하는 객체의갯수구하기
		 *   - 3개
		 */
		/*
		 * B. Account객체배열생성
		 *  - findAccounts=new Account[3];
		 */
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=balance) {
				count++;
			}
		}
		Account[] findAccounts1= new Account[count];
		int index = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=balance) {
				findAccounts1[index] = accounts[i];
				index++;
			}	
		}
		return findAccounts1;	
	}
		
	/*
	 * 6.계좌이율인자로받아서 인자이상인 계좌들배열객체 참조변수반환
	 */
	public Account[] findIyul(double iyul) {
		int count=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul()>=iyul) {
				count++;
			}
		}
		Account[] findIyul=new Account[count];
		
		int count2=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul()>=iyul) {
			findIyul[count2]=accounts[i];
			count2++;
			}
		}
		
		return findIyul;
	}
	/*
	 * 7.계좌주이름 인자로받아서 이름과일치하는계좌들배열객체 참조변수반환
	 */
	public Account[] findName(String owner) {
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner()==owner) {
				count++;
			}
		}
		Account[] findOwner = new Account[count];
		int index = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner()==owner) {
				findOwner[index] = accounts[i];
				index++;
			}
		}
		return findOwner;
	}
	/*
	 * 8.계좌번호와 입금할돈인자로받아서 입금
	 */
	public void ipGum(int no,int balrace) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].deposit(balrace);
				break;
			}
		}
	}
	/*
	 * 9.계좌번호와 출금할돈인자로받아서 출금
	 */
	public void chulGum(int no,int balrace) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].withdraw(balrace);
				break;
			}
		}
	}
	 
	
	/*
	 10,11  정렬
	 * standard --> 1:번호,2:이름,3:잔고,4:이율
	 * order    --> 1:오르차순,2:내림차순
	 */
	public void sort(int standard,int order) {
		if(standard==FIELD_NO) {
			if(order==SORT_ASC) {
				//번호로 오름차순
			}else if(order==SORT_DESC) {
				//번호로 내림차순
			}
		}else if(standard==FIELD_OWNER) {
			if(order==SORT_ASC) {
				//이름으로 오름차순
			}else if(order==SORT_DESC) {
				//이름으로 내림차순
			}
		}
		
	}
	
	/*
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		
	}
	/*
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		
	}
	public Account[] findOwner(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * 14.계좌번호 인자로받아서 삭제해줘[OPTION]
	 */
	public void deposite(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	public void withdraw(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
