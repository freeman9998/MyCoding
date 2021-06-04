package com.itwill06.collection.account;




import java.util.ArrayList;
import java.util.Collections;

/*
 * Account객체전체에관련된 업무를 실행할클래스
 */
public class AccountServiceArrayList {
	private ArrayList<Account> accountList;
	
	public AccountServiceArrayList() {
		accountList=new ArrayList<Account>();
		accountList.add(new Account(1111, "KIM", 89000, 1.3));
		accountList.add(new Account(2222, "AIM", 45000, 2.7));
		accountList.add(new Account(3333, "FIM", 23000, 4.7));
		accountList.add(new Account(4444, "XIM", 34000, 6.7));
		accountList.add(new Account(5555, "HIM", 78000, 3.7));
		accountList.add(new Account(6666, "AIM", 99000, 5.7));
		accountList.add(new Account(7777, "PIM", 89000, 4.7));
		accountList.add(new Account(8888, "QIM", 91000, 1.7));
		accountList.add(new Account(9999, "MIM", 12000, 0.7));
	}
	/*
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "FIM", 23000, 4.7),
			new Account(4444, "XIM", 34000, 6.7),
			new Account(5555, "HIM", 78000, 3.7),
			new Account(6666, "AIM", 99000, 5.7),
			new Account(7777, "PIM", 89000, 4.7),
			new Account(8888, "QIM", 91000, 1.7),
			new Account(9999, "MIM", 12000, 0.7),
	};
	*/
	/*
	 * 계좌전체반환
	 */
	public ArrayList<Account>  getAccountList() {
		return accountList;
	}
	/*
	 * 계좌추가
	 */
	public boolean addAccount(Account account) {
		/*
		 * 번호중복체크후 중복이면 호출한클래스에게 true,false를 반환해줌
		 */
		boolean checkNo = false;
		for (Account acc : accountList) {
			if (acc.getNo() == account.getNo()) {
				return checkNo;
			}
		}
		accountList.add(account);
		checkNo = true;
		return checkNo;
	}
	/*
	 1.은행계좌들 총계좌수반환메쏘드정의
	 */

	public int totAccountNumber() {
		return accountList.size();
		
	}
	/*
	 * 2.은행계좌들 전체출력메쏘드정의
	 */
	public void print() {
		Account.headerPrint();
		for (Account account : accountList) {
			account.print();
		}
	}
	/*
	 * 3.은행계좌들 총잔고 반환메쏘드 정의
	 */
	public int totBalance(){
		int totBalance=0;
		for (Account account : accountList) {
			totBalance+=account.getBalance();
		}
		return totBalance;
	}
	/*
	 4.계좌번호 인자로받아서 인계좌한개반환메쏘드정의
	 */
	public Account findByNo(int no) {
		Account findAccount=null;
		for (Account account : accountList) {
			if (account.getNo() == no) {
				findAccount = account;
				break;
			}
		}
		return findAccount;
	}
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들반환
	 */
	public ArrayList<Account> findByBalance(int balance) {
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		for (Account account : accountList) {
			if(account.getBalance() >= balance) {
				findAccountList.add(account);
			}
		}
		return findAccountList;
	}
	/*
	 7.은행계좌들 중에 계좌주이름이 AIM인 계좌들반환
	 */
	public ArrayList<Account> findByName(String owner) {
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		for (Account account : accountList) {
			if (account.getOwner().equals(owner)) {
				findAccountList.add(account);
			}
		}
		return findAccountList;
	}
	/*
	 *  8.6666번계좌 4000원 입금
	 */
	public Account ipGum(int no,int m) {
		Account findAccount = this.findByNo(no);
		findAccount.deposit(m);
		return findAccount;
	}
	/*
	 *  8.1111번계좌 5000원 출금
	 */
	public Account chulGum(int no,int m) {
		Account findAccount = this.findByNo(no);
		findAccount.withDraw(m);
		return findAccount;
	}
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	*/
	public void sortByBalanceAsc() {
		Collections.sort(accountList, new BalanceAscComparator());
		/*
		for (int i = 0; i < accountList.size()-1; i++) {
			for (int j = 0; j < accountList.size()-1; j++) {
				if (accountList.get(j).getBalance() > accountList.get(j+1).getBalance()) {
					Account tempAccount = accountList.get(j);
					accountList.set(j, accountList.get(j+1));
					accountList.set(j+1, tempAccount);
				}
			}
		}
		*/
		/*
		Object[] accArray = accountList.toArray();
		Account[] tempAccounts = new Account[accountList.size()];
		for (int i = 0; i < tempAccounts.length; i++) {
			tempAccounts[i] = (Account)accArray[i];
		}
		for (int i = 0; i < tempAccounts.length-1; i++) {
			for (int j = 0; j < tempAccounts.length-1; j++) {
				if(tempAccounts[j].getBalance() > tempAccounts[j+1].getBalance()) {
					Account tempAccount = tempAccounts[j];
					tempAccounts[j] = tempAccounts[j+1];
					tempAccounts[j+1] = tempAccount;
				}
			}
		}
		accountList = new ArrayList<Account>();
		for (int i = 0; i < tempAccounts.length; i++) {
			accountList.add(tempAccounts[i]);
		}
		*/
	}
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDesc() {
		Collections.sort(accountList, new BalanceDescComparator());
		/*
		for (int i = 0; i < accountList.size()-1; i++) {
			for (int j = 0; j < accountList.size()-1; j++) {
				if (accountList.get(j).getBalance() < accountList.get(j+1).getBalance()) {
					Account tempAccount = accountList.get(j);
					accountList.set(j, accountList.get(j+1));
					accountList.set(j+1, tempAccount);
				}
			}
		}
		*/
		/*
		Object[] accArray = accountList.toArray();
		Account[] tempAccounts = new Account[accountList.size()];
		for (int i = 0; i < tempAccounts.length; i++) {
			tempAccounts[i] = (Account)accArray[i];
		}
		for (int i = 0; i < tempAccounts.length-1; i++) {
			for (int j = 0; j < tempAccounts.length-1; j++) {
				if(tempAccounts[j].getBalance() < tempAccounts[j+1].getBalance()) {
					Account tempAccount = tempAccounts[j];
					tempAccounts[j] = tempAccounts[j+1];
					tempAccounts[j+1] = tempAccount;
				}
			}
		}
		accountList = new ArrayList<Account>();
		for (int i = 0; i < tempAccounts.length; i++) {
			accountList.add(tempAccounts[i]);
		}
		*/
	}
	
	/*
	 12.6666번계좌의 이름,잔고,이율 수정(update)
	 */
	public Account updateAccount(Account updateAccount) {
		Account findAccount = null;
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if(tempAccount.getNo() == updateAccount.getNo()) {
				findAccount = accountList.set(i, updateAccount);
				break;
			}
		}
		return findAccount;
	}
	/*
	 13.번호로 계좌삭제 
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount=null;
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = accountList.get(i);
			if(tempAccount.getNo() == no) {
				deleteAccount = accountList.remove(i);
				break;
			}
		}
		return deleteAccount;
	}
}
