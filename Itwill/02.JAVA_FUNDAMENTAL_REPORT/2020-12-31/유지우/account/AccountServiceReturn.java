package com.itwill05.service.account;

/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {
	public final static int FIELD_NO = 1;
	public final static int FIELD_OWNER = 2;
	public final static int FIELD_BALANCE = 3;
	public final static int FIELD_IYUL = 4;
	public final static int SORT_ASC = 1;
	public final static int SORT_DESC = 2;

	private Account[] accounts = { new Account(1111, "KIM", 85632, 5.9), new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2), new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2), new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2), new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2) };

	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가 - 기존배열보다큰배열생성 - 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}

	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(int no, String owner, int balance, double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		/*
		 * 1.배열크기증가 - 기존배열보다큰배열생성 - 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
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
		int totBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance += accounts[i].getBalance();
		}
		return totBalance;
	}

	/*
	 * 4.계좌번호를 인자로받아서 계좌객체주소 한개반환
	 */
	public Account findByNo(int no) {
		Account findAccount = null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				findAccount = accounts[i];
				break;
			}
		}
		return findAccount;
	}

	/*
	 * 5.계좌잔고 인자로받아서 잔고이상인 계좌배열객체 참조변수반환
	 */
	public Account[] findByBalance(int balance) {
		Account[] findAccounts = null;
		/*
		 * A. 만족하는 객체의갯수구하기 - 예를들어 3개라면
		 */
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > balance) {
				count++;

			}
		}

		/*
		 * B. Account객체배열생성 - findAccounts=new Account[3];
		 */
		findAccounts = new Account[count];

		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		int index = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > balance) {
				findAccounts[index] = accounts[i];
				index++;
			}
		}

		return findAccounts;

	}

	/*
	 * 6.계좌이율인자로받아서 인자이상인 계좌들배열객체 참조변수반환
	 */
	public Account[] findByIyul(double iyul) {
		Account[] findIyul = null;
		int count1 = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() > iyul) {
				count1++;
			}
		}
		findIyul = new Account[count1];
		
		int index1=0;
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i].getIyul() > iyul) {
				findIyul[index1] = accounts[i];
				index1++;
			}
		}
		
		
		
		
		return findIyul;

	}

	/*
	 * 7.계좌주이름 인자로받아서 이름과일치하는계좌들배열객체 참조변수반환
	 */
	public Account[] findByName(String name) {
		Account[] findName = null;
		int count2 = 0;
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i].getOwner().equals(name)) {
				count2++;
			}
		}
		findName = new Account[count2];
		
		int index2 =0;
		
		for(int i=0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals(name)) {
				findName[index2] = accounts[i];
				index2++;
			}
		}
		
		return findName;
		
	}

	/*
	 * 8.계좌번호,입금할돈 인자로 받아서 입금
	 */
	public void ipGum(int no, int m) {
		/*
		 * 1.계좌번호로 계좌찾기 2.입금
		 */
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].deposit(m);
				break;
			}
		}
		// this.findByNoPrint(no);
	}

	/*
	 * 9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public void chulGum(int no, int m) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].withDraw(m);
				break;
			}
		}

	}

	/*
	 * 10,11 정렬 standard --> 1:번호,2:이름,3:잔고,4:이율 order --> 1:오르차순,2:내림차순
	 */
	public void sort(int standard, int order) {
		if (standard == FIELD_NO) {
			if (order == SORT_ASC) {
				// 번호로 오름차순
			} else if (order == SORT_DESC) {
				// 번호로 내림차순
			}
		} else if (standard == FIELD_OWNER) {
			if (order == SORT_ASC) {
				// 이름으로 오름차순
			} else if (order == SORT_DESC) {
				// 이름으로 내림차순
			}
		} else if (standard == FIELD_BALANCE) {
			if (order == SORT_ASC) {
				// 잔고순으로 오름차순
			} else if (order == SORT_DESC) {
				// 잔고순으로 내림차순
				for (int i = 0; i < accounts.length - 1; i++) {
					for (int j = 0; j < accounts.length - 1; j++) {
						if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
							Account tempAccount = accounts[j];
							accounts[j] = accounts[j + 1];
							accounts[j + 1] = tempAccount;
						}
					}
				}

			}
		}

	}

	/*
	 * 12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	 */
	public void updateAccount(Account updateAccount) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == updateAccount.getNo()) {
				/*********
				 * case1************ accounts[i].setOwner(updateAccount.getOwner());
				 * accounts[i].setBalance(updateAccount.getBalance());
				 * accounts[i].setIyul(updateAccount.getIyul());
				 **************************/
				/************ case2 **********/
				accounts[i] = updateAccount;
				break;
			}

		}
	}

	/*
	 * 13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	 */
	public void updateAccount(int no, String owner, int balance, double iyul) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].setOwner(owner);
				accounts[i].setBalance(balance);
				accounts[i].setIyul(iyul);
				break;
			}

		}
	}

	/*
	 * 14.계좌번호 인자로받아서 삭제해줘[OPTION] A. 배열에서 Account객체삭제 B. 배열사이즈감소
	 */

}