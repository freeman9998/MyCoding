package com.itwill07.Account;

import java.util.ArrayList;

public class AccountServiceArrayList {

/*
 * Account��ü��ü�����õ� ������ ������Ŭ����
 */
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
	 * ������ü��ȯ
	 */
	public ArrayList<Account>  getAccountList() {
		return accountList;
	}
	/*
	 * �����߰�
	 */
	public boolean addAccount(Account account) {
		/*
		 * ��ȣ�ߺ�üũ�� �ߺ��̸� ȣ����Ŭ�������� true,false�� ��ȯ����
		 */
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getNo()==account.getNo()) {
				return false;
			}
		}
		accountList.add(account);
		return true;
	}
	
	
	/*
	 1.������µ� �Ѱ��¼���ȯ�޽������
	 */

	public int totAccountNumber() {
		return accountList.size();
		
	}
	/*
	 * 2.������µ� ��ü��¸޽������
	 */
	public void print() {
		Account.headerPrint();
		for (Account account : accountList) {
			account.print();
		}
	}
	/*
	 * 3.������µ� ���ܰ� ��ȯ�޽�� ����
	 */
	public int totBalance(){
		int totBalance=0;
		for (Account account:accountList) {
			totBalance=totBalance+account.getBalance();
		}
		return totBalance;
	}
	/*
	 4.���¹�ȣ ���ڷι޾Ƽ� �ΰ����Ѱ���ȯ�޽������
	 */
	public Account findByNo(int no) {
		Account findAccount=null;
		for (Account account : accountList) {
			if (account.getNo() == no) {
				findAccount=account;
			}
		}
		return findAccount;
	}
	/*
	 *  5.�����ܰ� ���ڷ� �޾Ƽ� �ܰ��̻��� ���µ��ȯ
	 */
	public ArrayList<Account> findByBalance(int balance) {
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		for (Account account : accountList) {
			if(account.getBalance() >=balance) {
				findAccountList.add(account);
			}
		}
		
		
		return findAccountList;
	}
	
	/*
	 *  6.6666������ 4000�� �Ա�
	 */
	public void ipGum(int no,int m) {
		for(Account account : accountList) {
			if(account.getNo()==no) {
				account.deposit(m);
			}
		}
	}
	/*
	 *  7.1111������ 5000�� ���
	 */
	public void chulGum(int no,int m) {
		for (Account account : accountList) {
			if(account.getNo()==no) {
				account.withDraw(m);
			}
		}
	}
	/*
	 8.������µ� �߿� �������̸��� AIM�� ���µ��ȯ
	*/
	public ArrayList<Account> findByName(String owner) {
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		for (Account findAccount : accountList) {
			if(findAccount.getOwner().equals(owner)) {
				findAccountList.add(findAccount);
			}
		}
		return findAccountList;
	}
	/*
	 9.VIP����(�ܰ� 70000���̻�)�� ��ȯ
	 */
	public ArrayList<Account> findByVip(int  balance) {
		ArrayList<Account> findAccountList=new ArrayList<Account>();
		for (Account account : accountList) {
			if(account.getBalance()>=70000) {
				findAccountList.add(account);
			}
		}
		return findAccountList;
	}
	/*
	 10.���¸� �ܰ������ ������������
	*/
	public void sortByBalanceAsc() {
		for (int i =0;i<accountList.size()-1;i++) {
			for (int j=0;j<accountList.size()-1;j++) {
				if(accountList.get(j).getBalance() > accountList.get(j+1).getBalance()) {
					Account tempAccount = accountList.get(j);
					accountList.set(j,accountList.get(j+1));
					accountList.set(j+1,tempAccount);
				}
			}
		}
	}
	/*
	 11.���¸� �ܰ������ ������������
	 */
	public void sortByBalanceDesc() {
		for (int i=0;i<accountList.size()-1;i++) {
			for (int j=0;j<accountList.size()-1;j++) {
				if(accountList.get(j).getBalance() < accountList.get(j+1).getBalance()) {
					Account tempAccount = accountList.get(j);
					accountList.set(j,accountList.get(j+1));
					accountList.set(j+1,tempAccount);
				}
			}
		}
	}
	
	/*
	 12.6666�������� �̸�,�ܰ�,���� ����(update)
	 */
	public void updateAccount(Account updateAccount) {
		for(int i=0;i<accountList.size();i++) {
			if(accountList.get(i).getNo()==updateAccount.getNo()) {
				accountList.set(i, updateAccount);
			}
		}
	}
	/*
	 13.��ȣ�� ���»��� 
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount=null;
		for (int i=0;i<accountList.size();i++) {
			if (accountList.get(i).getNo()==no) {
				deleteAccount=accountList.remove(i);
			}
		}
		return deleteAccount;
	}
	
	
	
}


