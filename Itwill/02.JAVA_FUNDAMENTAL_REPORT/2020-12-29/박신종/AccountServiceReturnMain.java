  
package com.itwill05.service.account;
public class AccountServiceReturnMain {
	public static void main(String[] args) {
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		System.out.println("0.AccountService��ü�� ������� �߰�����");
		accountServiceReturn.addAccount(new Account(1313, "ddd", 43555, 3.8));
		
		System.out.println("1.AccountService��ü�� ������� �Ѱ��¼��� ��ȯ����");
		int totNo=accountServiceReturn.getTotAccountNumber();
		System.out.println(">>>> �Ѱ��¼�:"+totNo);
		
		System.out.println("2.AccountService��ü�� ������µ� ��ü�������");
		accountServiceReturn.print();
		
		System.out.println("3.AccountService��ü�� ������µ� ���ܰ� ��ȯ����");
		int totBalance=accountServiceReturn.getAccountTotBalance();
		System.out.println(">>>> ���ܰ�:"+totBalance);
		
		System.out.println("4.AccountService��ü�� ���¹�ȣ�����ڷ� �־��ٲ� �����Ѱ����������� ��ȯ����");
		Account findAccount = accountServiceReturn.findByNo(3333);

		System.out.println("5.AccountService��ü�� "
			+ "�����ܰ� ���ڷ��ٲ� �ܰ��̻��� ���°�ü�迭 ����������ȯ����");
		Account[] findBalanceAccounts = accountServiceReturn.findByBalance(80000);
		if(findBalanceAccounts!=null) {
			for (int i = 0; i < findBalanceAccounts.length; i++) {
				findBalanceAccounts[i].print();
			}
		}
		System.out.println("6.AccountService��ü��  ��������(5.0)�� ���ڷ��ٲ� �����̻��� ���°�ü�迭 �������� ��ȯ����");
		Account[] findIyulAccount = accountServiceReturn.findByIyul(5.0);
		if(findIyulAccount!=null) {
			for (int i = 0; i < findIyulAccount.length; i++) {
				findIyulAccount[i].print();
			}
		}
		System.out.println("7.AccountService��ü��  �������̸�(AIM)�� ���ڷ��ٲ� ���°�ü�迭 �������� ��ȯ����");
		Account[] findOwnerAccount = accountServiceReturn.findByOwner("AIM");
		if(findIyulAccount!=null) {
			for (int i = 0; i < findOwnerAccount.length; i++) {
				findOwnerAccount[i].print();
			}
		}
		
		System.out.println("8.AccountService��ü�� "
				+ "���¹�ȣ(6666��)�� �Ա��ҵ�(4000��)�ٲ� �Ա�����");
		accountServiceReturn.depositByNoAndBalance(6666, 4000);
		
		System.out.println("9.AccountService��ü�� ���¹�ȣ(1111��)�� ����ҵ�(500��)�ٲ� �������");
		accountServiceReturn.withDrawByNoAndBalance(1111, 500);
		
		System.out.println("10.AccountService��ü�� ���¸� �ܰ������ ����������������");
		accountServiceReturn.sort(3, 1);
		
		System.out.println("11.AccountService��ü�� ���¸� �ܰ������ ����������������");
		accountServiceReturn.sort(3, 2);
		
		System.out.println("11.AccountService��ü�� ���¸� �������̸���(������)���� ������������");
		accountServiceReturn.sort(2, 1);
		
		System.out.println("12.AccountService�� ���°�ü�ٲ� �̸�,�ܰ�,���� ����(update)����");
		accountServiceReturn.updateAccount(accountServiceReturn.getAccount());
		
		System.out.println("13.AccountService�� ���µ���Ÿ�ٲ� �̸�,�ܰ�,���� ����(update)����");
		accountServiceReturn.updateAccount(3333, "FIM", 56000, 1.2);
		
		System.out.println("14.AccountService��ü�� ���¹�ȣ�ٲ� ���»�������");
		accountServiceReturn.deleteAccount(1111);
	}

}