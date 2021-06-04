package com.itwill05.service.account;

import com.sun.org.apache.regexp.internal.*;

/*
 * 1.���°�ü��(Account[]) ����������ΰ�����.
 * 2.���°�ü���� ����ؼ� ��������
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
	 * 0.���°�ü�� ���ڷι޾Ƽ� Account[]���߰�[OPTION]
	*/
	public void addAccount(Account newAccount) {
		Account[] addArrAccount = new Account[accounts.length+1];
		
		for (int i = 0; i < accounts.length; i++) {
			addArrAccount[i] = accounts[i];
		}
		addArrAccount[accounts.length] = newAccount;
		
		this.accounts = addArrAccount;
		
	}
	/*
	 * 0.���µ���Ÿ�� ���ڷι޾Ƽ� Account[]���߰�[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		
	}
	
	public Account getAccount() {
		return accounts[(int)(Math.random() *9) + 1];
	}
	
	/*
	 * 1.������µ� �Ѱ��¼� ��ȯ�޽��
	 */
	public int getTotAccountNumber() {
		return this.accounts.length;
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
	 * 3.������µ� ���ܰ� ��ȯ�ϴ� �޽��
	 */
	public int getAccountTotBalance() {
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance+=accounts[i].getBalance();
		}
		return totBalance;
	}
	
	/*
	 * 4.���¹�ȣ�� ���ڷι޾Ƽ� ���°�ü�ּ� �Ѱ���ȯ
	 */
	public Account findByNo(int no) {
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
	 * 5.�����ܰ� ���ڷι޾Ƽ� �ܰ��̻��� ���¹迭��ü ����������ȯ
	 */
	public Account[] findByBalance(int balance) {
		Account[] findAccounts = null;
		int count = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= balance) {
				count++;
			}
		}

		findAccounts = new Account[count];
		int findCount = 0;
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= balance) {
				findAccounts[findCount] = accounts[i];
				findCount++;
			}
		}

		return findAccounts;
		/*
		 * A. �����ϴ� ��ü�ǰ������ϱ�
		 *   - 3��
		 */
		/*
		 * B. Account��ü�迭����
		 *  - findAccounts=new Account[3];
		 */
		
		/*
		 * C. �����ϴ�Account��ü�� Account�迭�����
		 */	
	}
	/*
	 * 6.�����������ڷι޾Ƽ� �����̻��� ���µ�迭��ü ����������ȯ
	 */
	public Account[] findByIyul(double iyul) {
		Account[] findAccounts = null;
		int count = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() >= iyul) {
				count++;
			}
		}

		findAccounts = new Account[count];
		int findCount = 0;
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() >= iyul) {
				findAccounts[findCount] = accounts[i];
				findCount++;
			}
		}

		return findAccounts;
	}
	/*
	 * 7.�������̸� ���ڷι޾Ƽ� �̸�����ġ�ϴ°��µ�迭��ü ����������ȯ
	 */
	public Account[] findByOwner(String owner) {
		Account[] findAccounts = null;
		int count = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(owner)) {
				count++;
			}
		}

		findAccounts = new Account[count];
		int findCount = 0;
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(owner)) {
				findAccounts[findCount] = accounts[i];
				findCount++;
			}
		}

		return findAccounts;
	}
	/*
	 * 8.���¹�ȣ�� �Ա��ҵ����ڷι޾Ƽ� �Ա�
	 */
	public void depositByNoAndBalance(int no, int balance) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == no) {
				accounts[i].deposit(balance);
				break;
			}
		}
	}
	/*
	 * 9.���¹�ȣ�� ����ҵ����ڷι޾Ƽ� ���
	 */
	public void withDrawByNoAndBalance(int no, int balance) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == no) {
				accounts[i].withDraw(balance);
				break;
			}
		}
	}
	 
	/*
	 10,11  ����
	 * standard --> 1:��ȣ,2:�̸�,3:�ܰ�,4:����
	 * order    --> 1:��������,2:��������
	 */
	public void sort(int standard,int order) {
		if(standard==FIELD_NO) {
			if(order==SORT_ASC) {
				//��ȣ�� ��������
				for (int i = 0; i < accounts.length-1; i++) {
					for (int j = 0; j < accounts.length-1; j++) {
						if (accounts[j].getNo()>accounts[j+1].getNo()) {
							Account tempAccount=accounts[j];
							accounts[j]=accounts[j+1];
							accounts[j+1]=tempAccount;
						}
					}
				}
			}else if(order==SORT_DESC) {
				//��ȣ�� ��������
				for (int i = 0; i < accounts.length-1; i++) {
					for (int j = 0; j < accounts.length-1; j++) {
						if (accounts[j].getNo()<accounts[j+1].getNo()) {
							Account tempAccount=accounts[j];
							accounts[j]=accounts[j+1];
							accounts[j+1]=tempAccount;
						}
					}
				}
			}
		}else if(standard==FIELD_OWNER) {
			if(order==SORT_ASC) {
				//�̸����� ��������
				for (int i = 0; i < accounts.length-1; i++) {
					for (int j = 0; j < accounts.length-1; j++) {
						if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner())>0) {
							Account tempAccount=accounts[j];
							accounts[j]=accounts[j+1];
							accounts[j+1]=tempAccount;
						}
					}
				}
			}else if(order==SORT_DESC) {
				//�̸����� ��������
				for (int i = 0; i < accounts.length-1; i++) {
					for (int j = 0; j < accounts.length-1; j++) {
						if (accounts[j].getOwner().compareTo(accounts[j+1].getOwner())<0) {
							Account tempAccount=accounts[j];
							accounts[j]=accounts[j+1];
							accounts[j+1]=tempAccount;
						}
					}
				}
			}
		}
		
	}
	
	/*
	12.���°�ü�� ���ڷ� �޾Ƽ� �̸�,�ܰ�,���� ����(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == updateAccount.getNo()) {
				accounts[i] = updateAccount;
				break;
			}
		}
	}
	/*
	13.��ȣ,�̸�,�ܰ�,���� ���ڷι޾Ƽ� ���°�ü����(update)[OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == no) {
				accounts[i].setAccountData(1212, "VIM", 1212, 1.2);
			}
		}
	}
	
	/*
	 * 14.���¹�ȣ ���ڷι޾Ƽ� ��������[OPTION]
	 */
	public void deleteAccount(int no) {

		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == no) {
				accounts[i] = null;
				break;
			}
		}
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				return;
			}
		}
		
		Account[] newAccounts = new Account[accounts.length -1];
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				newAccounts[count] = accounts[i];
				count++;
			}
		}
		
		this.accounts = newAccounts;
	}	
}