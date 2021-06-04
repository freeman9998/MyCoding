package com.itwill05.service.accunt;

import com.itwill04.array.Account;

/*
 * Account��ü��ü�����õ� ������ ������Ŭ����
 * 		1.���°�ü��(Account[]) ����������ΰ�����.
 * 		2.���°�ü���� ����ؼ� ��������
 */
 
public class AccountService {
	
	private Account[] accounts= {
			new Account(1111, "HAN", 89000, 1.3),
			new Account(2222, "LEE", 45000, 2.7),
			new Account(3333, "KIM", 89000, 4.7),
			new Account(4444, "SIM", 34000, 6.7),
			new Account(5555, "AIM", 78000, 3.7),
			new Account(6666, "Pak", 89000, 5.7),
			new Account(7777, "JEE", 89000, 4.7),
			new Account(8888, "PEE", 91000, 1.7),
			new Account(9999, "SEM", 12000, 0.7),
	};
	
	/*
	 * 0.���°�ü�� ���ڷι޾Ƽ� Account[]���߰�
	*/
	public void addAccount(Account newAccount) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==newAccount.getNo()) {
				System.out.println("�ߺ��� ���¹�ȣ�� �����մϴ�.");
				return;
			}
		}
		Account[] tempAccounts = new Account[accounts.length+1];
		for (int i = 0; i < tempAccounts.length-1; i++) {
			tempAccounts[i]=accounts[i];
		}
		tempAccounts[tempAccounts.length-1]=newAccount;
		accounts=null;
		accounts=new Account[tempAccounts.length];
		for (int i = 0; i < tempAccounts.length; i++) {
			accounts[i]=tempAccounts[i];
		}
	}
	
	/*
	 1.������µ� �Ѱ��¼���¸޽������
	 */
	public void totAccountNumberPrint() {
		System.out.println(">>�����Ѱ��¼�:"+accounts.length);
	}
	/*
	 * 2.������µ� ��ü��¸޽�� ����
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
	}
	
	/*
	 1.ù���� �빮��
	 2.5�ڸ������
	 3.ù�����̿ܿ���****(4��)
	---------------------------------------
	��ȣ	�̸�	 �ܰ�	 ����
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
	 * 3.������µ� ���ܰ� ��¸޽�� ����
	 */
	public void totBalaneceprint() {
		int totBalance=0;
		for (int i=0;i<accounts.length;i++) {
			totBalance+=accounts[i].getBalance();
		}
		System.out.println(">>����������ܰ�:"+totBalance);
	}	
	/*
	 4.���¹�ȣ ���ڷι޾Ƽ� �����Ѱ����
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
	 *  5.�����ܰ� ���ڷ� �޾Ƽ� �ܰ��̻��� ���µ����
	 */
	public void findByBalancePrint(int Balance) {
	for (int i = 0; i < accounts.length; i++) {
		if(accounts[i].getBalance()>=Balance) {
			accounts[i].print();
			}
		}
	}
	/*
	6.�������� ���ڷ� �޾Ƽ� �����̻��� ���µ����
	*/ 
	public void findByIyulPrint(double Iyul) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>=Iyul) {
				accounts[i].print();
			}
		}
	}
	/*
	7.�������̸� ���ڷ� �޾Ƽ� �����̸��������� ���µ����
	 */ 
	public void findBuNamePrint(String owner) {
		for (int i=0;i<accounts.length;i++) {
			if(accounts[i].getOwner()==owner) {
				accounts[i].print();
			}
		}
	}
	/*
	8.���¹�ȣ,�Ա��ҵ� ���ڷ� �޾Ƽ� �Ա�
	 */ 
	public void ipGum(int no,int balrace) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].deposit(balrace);
				accounts[i].print();
				break;
			}
		}
	}
	/*
	9.���¹�ȣ,����ҵ� ���ڷ� �޾Ƽ� ���
	 */ 
	public void chulGum(int no,int balrace) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].withDraw(balrace);
				accounts[i].print();
				break;
			}
		}
	}
	/*
	 10.���¸� �ܰ������ ������������
	 */
	public void sortByBalanceAscendig() {
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
					//�ּұ�ü
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	/*
	 11.���¸� �ܰ������ ������������
	 */
	public void sortByBalanceDescendig() {
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance() < accounts[j+1].getBalance()) {
					//�ּұ�ü
					Account tempAccount = accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=tempAccount;
					
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	/*
	12.6666�����°�ü�� ���ڷ� �޾Ƽ� �̸�,�ܰ�,���� ����(update)
	*/
	public void updateAccount(Account updateAccount) {
		
	}
	/*
	13.��ȣ,�̸�,�ܰ�,���� ���ڷι޾Ƽ� ���°�ü����(update)
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		
	}
	
	
}