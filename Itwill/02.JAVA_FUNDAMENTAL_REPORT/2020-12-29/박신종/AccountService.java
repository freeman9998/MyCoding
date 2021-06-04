package com.itwill05.service.account;



/*
 * Account��ü��ü�����õ� ������ ������Ŭ����
 * 		1.���°�ü��(Account[]) ����������ΰ�����.
 * 		2.���°�ü���� ����ؼ� ��������
 */
 
public class AccountService {
	public static final int NO_INDEX = 0;
	public static final int DEPOSIT_INDEX = 1;
	
	
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
	 * 0.���°�ü�� ���ڷι޾Ƽ� Account[]���߰�[OPTION]
	*/
	public void addAccount(Account newAccount) {
		Account[] addAccounts = {
				new Account(1111, "KIM", 89000, 1.3),
				new Account(2222, "AIM", 45000, 2.7),
				new Account(3333, "FIM", 89000, 4.7),
				new Account(4444, "XIM", 34000, 6.7),
				new Account(5555, "hIM", 78000, 3.7),
				new Account(6666, "KIM", 89000, 5.7),
				new Account(7777, "KIM", 89000, 4.7),
				new Account(8888, "qIM", 91000, 1.7),
				new Account(9999, "mIM", 12000, 0.7),
				newAccount
		};
		System.out.println("�߰� �� ��ü ��� ���");
		for (int i = 0; i < addAccounts.length; i++) {
			addAccounts[i].print();
		}
	}
	/*
	 * 0.���µ���Ÿ�� ���ڷι޾Ƽ� Account[]���߰�[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		
	}
	
	/*
	 1.������µ� �Ѱ��¼���¸޽������
	 */
	public void totAccountNumberPrint() {
		System.out.println(">>�����Ѱ��¼�:" + accounts.length);
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
	 * 3.������µ� ���ܰ� ��¸޽�� ����
	 */
	public void totBalancePrint() {
		int totBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance += accounts[i].getBalance();
		}
		System.out.println(">>����������ܰ�:" + totBalance);
	}
	/*
	 4.���¹�ȣ ���ڷι޾Ƽ� �����Ѱ����
	 */
	public void findByNoPrint(int no) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].print();
				break;
			}
		}
	}

	/*
	 *  5.�����ܰ� ���ڷ� �޾Ƽ� �ܰ��̻��� ���µ����
	 */
	public void findByBalancePrint(int balance) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= balance) {
				accounts[i].print();
			}
		}
	}
	/*
	6.�������� ���ڷ� �޾Ƽ� �����̻��� ���µ����
	*/ 
	public void findByIyulPrint(double iyul) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() >= iyul) {
				accounts[i].print();
			}
		}
	}
	
	/*
	7.�������̸� ���ڷ� �޾Ƽ� �����̸��������� ���µ����
	 */ 
	public void findByNamePrint(String owner) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(owner)) {
				accounts[i].print();
			}
		}
	}
	
	/*
	8.���¹�ȣ,�Ա��ҵ� ���ڷ� �޾Ƽ� �Ա�
	 */ 
	public void ipGum(String[] noAndDepositMoney) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == Integer.parseInt(noAndDepositMoney[NO_INDEX])) {
				System.out.println("�Ա� ��");
				accounts[i].print();
				System.out.println("�Ա� ��");
				accounts[i].deposit(Integer.parseInt(noAndDepositMoney[DEPOSIT_INDEX]));
				accounts[i].print();
				System.out.println();
				break;
			}
		}
	}
	/*
	9.���¹�ȣ,����ҵ� ���ڷ� �޾Ƽ� ���
	 */ 
	public void chulGum(String[] noAndWithDrawMoney) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == Integer.parseInt(noAndWithDrawMoney[NO_INDEX])) {
				System.out.println("��� ��");
				accounts[i].print();
				System.out.println("��� ��");
				accounts[i].withDraw(Integer.parseInt(noAndWithDrawMoney[DEPOSIT_INDEX]));
				accounts[i].print();
				System.out.println();
				break;
			}
		}
	}
	/*
	 10.���¸� �ܰ������ ������������
	 */
	public void sortByBalanceAscending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					Account tempAccount = new Account();
					tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
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
	public void sortByBalanceDescending() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1; j++) {
				if (accounts[j].getBalance() < accounts[j + 1].getBalance()) {
					Account tempAccount = new Account();
					tempAccount = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tempAccount;
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	12.���°�ü�� ���ڷ� �޾Ƽ� �̸�,�ܰ�,���� ����(update)[OPTION]
	*/
	public void updateObjectAccount(Account updateAccount) {
		System.out.println("���� �� ���� ����");
		updateAccount.print();
		updateAccount.setAccountData(1234, "HWANG", 50000, 3.3);
		System.out.println("���� �� ���� ����");
		updateAccount.print();
	}
	/*
	13.��ȣ,�̸�,�ܰ�,���� ���ڷι޾Ƽ� ���°�ü����(update)[OPTION]
	*/
	public void updateParameterAccount(int no, String owner, int balance, double iyul) {
		System.out.println("���� �� ���� ����");
		int changedAccountIndex = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == no) {
				accounts[i].print();
				changedAccountIndex = i;
				break;
			}
		}
		accounts[changedAccountIndex].setAccountData(7890, "SAN", 30000, 9.3);
		System.out.println("���� �� ���� ����");
		accounts[changedAccountIndex].print();
	}
}