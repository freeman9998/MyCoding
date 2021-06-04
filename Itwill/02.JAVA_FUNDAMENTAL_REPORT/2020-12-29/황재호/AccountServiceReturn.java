package com.itwill05.service.accunt;
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
		
	}
	/*
	 * 0.���µ���Ÿ�� ���ڷι޾Ƽ� Account[]���߰�[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		
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
	 * 5.�����ܰ� ���ڷι޾Ƽ� �ܰ��̻��� ���¹迭��ü ����������ȯ
	 */
	public Account[] findBalance(int balance) {
		Account[] findAccounts=null;
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
	 * 6.�����������ڷι޾Ƽ� �����̻��� ���µ�迭��ü ����������ȯ
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
	 * 7.�������̸� ���ڷι޾Ƽ� �̸�����ġ�ϴ°��µ�迭��ü ����������ȯ
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
	 * 8.���¹�ȣ�� �Ա��ҵ����ڷι޾Ƽ� �Ա�
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
	 * 9.���¹�ȣ�� ����ҵ����ڷι޾Ƽ� ���
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
	 10,11  ����
	 * standard --> 1:��ȣ,2:�̸�,3:�ܰ�,4:����
	 * order    --> 1:��������,2:��������
	 */
	public void sort(int standard,int order) {
		if(standard==FIELD_NO) {
			if(order==SORT_ASC) {
				//��ȣ�� ��������
			}else if(order==SORT_DESC) {
				//��ȣ�� ��������
			}
		}else if(standard==FIELD_OWNER) {
			if(order==SORT_ASC) {
				//�̸����� ��������
			}else if(order==SORT_DESC) {
				//�̸����� ��������
			}
		}
		
	}
	
	/*
	12.���°�ü�� ���ڷ� �޾Ƽ� �̸�,�ܰ�,���� ����(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		
	}
	/*
	13.��ȣ,�̸�,�ܰ�,���� ���ڷι޾Ƽ� ���°�ü����(update)[OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		
	}
	public Account[] findOwner(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * 14.���¹�ȣ ���ڷι޾Ƽ� ��������[OPTION]
	 */
	public void deposite(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	public void withdraw(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
