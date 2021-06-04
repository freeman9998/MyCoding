package com.itwill06.collection.account;


import java.util.ArrayList;

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
	 * 계좌전체반환
	 */
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	/*
	 * 계좌추가
	 */
	public boolean addAccount(Account account) {
		
		boolean isOverap = false;
		/*
		 * 번호중복체크후 중복이면 호출한클래스에게 true,false를 반환해줌
		 */
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getNo() == account.getNo()) {
				isOverap = true;
				return isOverap;
			}
		}
		accountList.add(account);
		return isOverap;
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
		
		for (int i = 0; i < accountList.size(); i++) {
			totBalance = totBalance + accountList.get(i).getBalance();
		}
		return totBalance;
	}
	/*
	 4.계좌번호 인자로받아서 계좌한개반환메쏘드정의
	 */
	public Account findByNo(int no) {
		Account findAccount=null;
		
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getNo() == no) {
				findAccount = accountList.get(i);
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
		
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getBalance() >= balance) {
				findAccountList.add(accountList.get(i));
			}
		}
		return findAccountList;
	}
	
	/*
	 *  6.6666번계좌 4000원 입금
	 */
	public void ipGum(int no,int m) {
		Account acc = findByNo(no);
		acc.deposit(m);
	}
	/*
	 *  7.1111번계좌 5000원 출금
	 */
	public void chulGum(int no,int m) {
		Account acc = findByNo(no);
		acc.withDraw(m);
	}
	/*
	 8.은행계좌들 중에 계좌주이름이 AIM인 계좌들반환
	*/
	public ArrayList<Account> findByName(String owner) {
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		
		for (int i = 0; i < accountList.size(); i++) {
			Account temp =accountList.get(i);
			if(temp.getOwner().equals(owner)) {
				findAccountList.add(temp);
			}
		}
		
		return findAccountList;
	}
	/*
	 9.VIP계좌(잔고 70000원이상)들 반환
	 */
	public ArrayList<Account> findByVip(int  balance) {
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		findAccountList = findByBalance(balance);
		
		return findAccountList;
	}
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	*/
	public void sortByBalanceAsc() {
		for(int i = 0; i <accountList.size()-1; i++) {
			for(int j = 0 ; j < accountList.size()-1; j++) {
				if(accountList.get(j).getBalance() > accountList.get(j+1).getBalance()) {
					Account a = accountList.get(j+1);
					accountList.set(j+1, accountList.get(j));
					accountList.set(j, a);
				}
			}
		}
	}
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	public void sortByBalanceDesc() {
		for(int i = 0; i <accountList.size()-1; i++) {
			for(int j = 0 ; j < accountList.size()-1; j++) {
				if(accountList.get(j).getBalance() < accountList.get(j+1).getBalance()) {
					Account a = accountList.get(j+1);
					accountList.set(j+1, accountList.get(j));
					accountList.set(j, a);
				}
			}
		}
	}
	
	/*
	 12.6666번계좌의 이름,잔고,이율 수정(update)
	 */
	public void updateAccount(Account updateAccount) {
		
		for (int i = 0; i < accountList.size(); i++) {
			Account acc = accountList.get(i);
			if(acc.getNo() == updateAccount.getNo()) {
				accountList.set(i, updateAccount);
			}
		}
	}
	/*
	 13.번호로 계좌삭제 
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount=null;
		
		for (int i = 0; i < accountList.size(); i++) {
			Account acc = accountList.get(i);
			if(acc.getNo() == no) {
				deleteAccount = accountList.remove(i);
			}
		}
		
		return deleteAccount;
	} 
	
}

