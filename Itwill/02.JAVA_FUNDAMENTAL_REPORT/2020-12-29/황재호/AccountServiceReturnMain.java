package com.itwill05.service.accunt;

public class AccountServiceReturnMain {

	public static void main(String[] args) {
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		System.out.println("0.AccountService��ü�� ������� �߰�����");
		Account newacc1 = new Account(7673,"Hwnag",12000,4.9);
		accountServiceReturn.addAccount(newacc1);
		accountServiceReturn.addAccount(2274, "Yun", 70000, 2.3);		
		System.out.println("1.AccountService��ü�� ������� �Ѱ��¼��� ��ȯ����");
		int totNo = accountServiceReturn.getTotAccountNumber();
		System.out.println(">>>> �Ѱ��¼�:" + totNo);
		System.out.println("2.AccountService��ü�� ������µ� ��ü�������");
		accountServiceReturn.print();
		System.out.println("3.AccountService��ü�� ������µ� ���ܰ� ��ȯ����");
		int totBalance = accountServiceReturn.getAccountTotBalance();
		System.out.println(">>>> ���ܰ�:" + totBalance);
		System.out.println("4.AccountService��ü�� ���¹�ȣ(3333��)�����ڷ� �־��ٲ� �����Ѱ����������� ��ȯ����");
		Account findAccount = accountServiceReturn.findNo(3333);
		System.out.println("5.AccountService��ü�� "
			+ "�����ܰ� ���ڷ��ٲ� �ܰ��̻��� ���°�ü�迭 ����������ȯ����");
		Account[] findAccounts = accountServiceReturn.findBalance(40000);
		System.out.println("6.AccountService��ü��  ��������(5.0)�� ���ڷ��ٲ� �����̻��� ���°�ü�迭 �������� ��ȯ����");
		Account[] findAccounts1 = accountServiceReturn.findIyul(5.0);
		System.out.println("7.AccountService��ü��  �������̸�(AIM)�� ���ڷ��ٲ� ���°�ü�迭 �������� ��ȯ����");
		Account[] findAccounts2 = accountServiceReturn.findName("AIM");
		System.out.println("8.AccountService��ü�� "
				+ "���¹�ȣ(6666��)�� �Ա��ҵ�(4000��)�ٲ� �Ա�����");
		accountServiceReturn.ipGum(6666,4000);
		System.out.println("9.AccountService��ü�� ���¹�ȣ(1111��)�� ����ҵ�(500��)�ٲ� �������");
		accountServiceReturn.chulGum(1111, 500);
		System.out.println("10.AccountService��ü�� ���¸� �ܰ������ ����������������");
		System.out.println("11.AccountService��ü�� ���¸� �ܰ������ ����������������");
		System.out.println("11.AccountService��ü�� ���¸� �������̸���(������)���� ������������");
		System.out.println("12.AccountService�� ���°�ü�ٲ� �̸�,�ܰ�,���� ����(update)����");
		System.out.println("13.AccountService�� ���µ���Ÿ�ٲ� �̸�,�ܰ�,���� ����(update)����");
		System.out.println("14.AccountService��ü�� ���¹�ȣ�ٲ� ���»�������");
	}

}
