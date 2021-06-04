package com.itwill05.service.account;
/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {
	public final static int FIELD_NO=1;
	public final static int FIELD_OWNER=2;
	public final static int FIELD_BALANCE=3;
	public final static int FIELD_INTER=4;
	public final static int SORT_ASC=1;
	public final static int SORT_DESC=2;
	
	private Account[] accs= {
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

		Account[] temp = new Account[accs.length+1];

		for(int i = 0 ; i < accs.length; i++) {
			temp[i] =accs[i];
		}

		temp[accs.length] = newAccount;
		accs = temp;

	}
	
	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		Account[] temp = new Account[accs.length+1];

		for(int i = 0 ; i < accs.length; i++) {
			temp[i] =accs[i];
		}

		temp[accs.length] = newAccount;
		accs = temp;
		
	}
	

	
	/*
	 * 1.은행계좌들 총계좌수 반환메써드
	 */
	public int getTotAccountNumber() {
		return this.accs.length;
	}
	
	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accs.length; i++) {
			accs[i].print();
		}
	}

	/*
	 * 3.은행계좌들 총잔고를 반환하는 메쏘드
	 */
	public int getAccountTotBalance() {
		int totBalance=0;
		for (int i = 0; i < accs.length; i++) {
			totBalance+=accs[i].getBalance();
		}
		return totBalance;
	}
	
	/*
	 * 4.계좌번호를 인자로받아서 계좌객체주소 한개반환
	 */
	public Account findByNo(int no) {
		Account findAccount=null;
		for (int i = 0; i < accs.length; i++) {
			if(accs[i].getNo()==no) {
				findAccount=accs[i];
				break;
			}
		}
		return findAccount;
	}	
	/*
	 * 5.계좌잔고 인자로받아서 잔고이상인 계좌배열객체 참조변수반환
	 */
	public Account[] findByBalance(int balance) {
		int cnt = 0 ;
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getBalance() >= balance) {
				cnt++;
			}
		}
		Account[] findAccounts= new Account[cnt];
		cnt = 0 ;
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getBalance() >= balance) {
				findAccounts[cnt] = accs[i];
				cnt++;
			}
		}
		
		/*
		 * A. 만족하는 객체의갯수구하기
		 *   - 3개
		 *   
		 */
		/*
		 * B. Account객체배열생성
		 *  - findAccounts=new Account[3];
		 */
		
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		return findAccounts;
		
	}
	
	/*
	 * 6.계좌이율인자로받아서 인자이상인 계좌들배열객체 참조변수반환
	 */
	public Account[] findByInter(double inter) {
		int cnt = 0 ;
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getInter() >= inter) {
				cnt++;
			}
		}
		Account[] findAccounts= new Account[cnt];
		cnt = 0 ;
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getInter() >= inter) {
				findAccounts[cnt] = accs[i];
				cnt++;
			}
		}
		return findAccounts;
	}
	/*
	 * 7.계좌주이름 인자로받아서 이름과일치하는계좌들배열객체 참조변수반환
	 */
	public Account[] findByOwner(String owner) {
		int cnt = 0 ;
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getOwner().equals(owner)) {
				cnt++;
			}
		}
		Account[] findAccounts= new Account[cnt];
		cnt = 0 ;
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getOwner().equals(owner)) {
				findAccounts[cnt] = accs[i];
				cnt++;
			}
		}
		return findAccounts;
	}
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void ipGum(int no, int money) {
		
		Account a = findByNo(no);
		a.deposit(money);
		/*
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getNo() == no) {
				accs[i].deposit(money);
				break;
			}
		}*/
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void chulGum(int no, int money) {
		
		Account a = findByNo(no);
		a.withDraw(money);
		/*for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getNo() == no) {
				accs[i].withDraw(money);
				break;
			}
		}	*/
		
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
				for(int i = 0; i <accs.length-1; i++) {
					for(int j = 0 ; j < accs.length-1; j++) {
						if(accs[j].getNo() > accs[j+1].getNo()) {
							Account a = accs[j+1];
							accs[j+1]= accs[j];
							accs[j] = a;
						}
					}
				}
				
			}else if(order==SORT_DESC) {
				//번호로 내림차순
				for(int i = 0; i <accs.length-1; i++) {
					for(int j = 0 ; j < accs.length-1; j++) {
						if(accs[j].getNo() < accs[j+1].getNo()) {
							Account a = accs[j+1];
							accs[j+1]= accs[j];
							accs[j] = a;
						}
					}
				}
			}
			
		}
		else if(standard==FIELD_OWNER) {
			if(order==SORT_ASC) {
				//이름으로 오름차순
				for(int i = 0; i <accs.length-1; i++) {
					for(int j = 0 ; j < accs.length-1; j++) {
						if(accs[j].getOwner().compareTo(accs[j+1].getOwner()) > 0) {
							Account a = accs[j+1];
							accs[j+1]= accs[j];
							accs[j] = a;
						}
					}
				}
				
			}else if(order==SORT_DESC) {
				//이름으로 내림차순
				for(int i = 0; i <accs.length-1; i++) {
					for(int j = 0 ; j < accs.length-1; j++) {
						if(accs[j].getOwner().compareTo(accs[j+1].getOwner()) < 0) {
							Account a = accs[j+1];
							accs[j+1]= accs[j];
							accs[j] = a;
						}
					}
				}
			}			
		}
		else if(standard==FIELD_BALANCE) {
			if(order==SORT_ASC) {
				//잔액으로 오름차순
				for(int i = 0; i <accs.length-1; i++) {
					for(int j = 0 ; j < accs.length-1; j++) {
						if(accs[j].getBalance() > accs[j+1].getBalance()) {
							Account a = accs[j+1];
							accs[j+1]= accs[j];
							accs[j] = a;
						}
					}
				}
				
			}else if(order==SORT_DESC) {
				//잔액으로 내림차순
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
		}
		
		else if(standard==FIELD_INTER) {
			if(order==SORT_ASC) {
				//잔액으로 오름차순
				for(int i = 0; i <accs.length-1; i++) {
					for(int j = 0 ; j < accs.length-1; j++) {
						if(accs[j].getInter() > accs[j+1].getInter()) {
							Account a = accs[j+1];
							accs[j+1]= accs[j];
							accs[j] = a;
						}
					}
				}
				
			}else if(order==SORT_DESC) {
				//잔액으로 내림차순
				for(int i = 0; i <accs.length-1; i++) {
					for(int j = 0 ; j < accs.length-1; j++) {
						if(accs[j].getInter() < accs[j+1].getInter()) {
							Account a = accs[j+1];
							accs[j+1]= accs[j];
							accs[j] = a;
						}
					}
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
		Account updateAccount = new Account(no, owner, balance, iyul);
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getNo() == updateAccount.getNo()) {
				accs[i] = updateAccount;
				break;
			}
		}
	}
	
	/*
	 * 14.계좌번호 인자로받아서 삭제해줘
	 */
	public Account deleteAccount(int no) {
		int cnt = 0;
		Account t = null;
		for (int i = 0; i < accs.length; i++) {
			if(accs[i].getNo() == no) {
				t = accs[i];
				accs[i] = null;
			}	
		}
		
		Account[] temp = new Account[accs.length-1];
		for(int i = 0 ; i < accs.length; i++) {
			if(accs[i].getNo() != no) {
				temp[cnt] = accs[i];
				cnt++;
			}
		}
		accs = temp;
		
		return t;
	}
	
	
		
}