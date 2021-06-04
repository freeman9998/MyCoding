package com.itwill06.collection.account;

import java.util.ArrayList;

public class AccountServiceArrayListMain {

	public static void main(String[] args) {

		AccountServiceArrayList accountServiceArrayList = new AccountServiceArrayList();
		System.out.println("0.AccountServiceArrayList�� ��������߰�����");
		Account addAccount = new Account(1000, "��ҿ�", 89000, 0.5);
		boolean accountCheck = accountServiceArrayList.addAccount(addAccount);
		if (accountCheck) {
			System.out.println("�ش���´� �����մϴ�.");
		}
		if (!accountCheck) {
			System.out.println("���°� �߰��Ǿ����ϴ�.");
		}
		System.out.println();

		System.out.println("1.AccountServiceArrayList�� ������µ� �Ѱ��¼���ȯ����");
		int accountCount = accountServiceArrayList.totAccountNumber();
		System.out.println("�Ѱ��¼�[main]:" + accountCount);
		System.out.println();

		System.out.println("2.AccountServiceArrayList�� ������µ� ��ü�������");
		accountServiceArrayList.print();
		System.out.println();

		System.out.println("3.AccountServiceArrayList��������µ� ���ܰ� ��ȯ����");
		int totBalance = accountServiceArrayList.totBalance();
		System.out.println("���ܰ�[main]:" + totBalance);
		System.out.println();

		System.out.println("4.AccountServiceArrayList�� ���¹�ȣ�ٲ� �����Ѱ���ȯ����");
		Account findAccount = accountServiceArrayList.findByNo(5555);
		findAccount.print();
		System.out.println();

		System.out.println("5.AccountServiceArrayList�� �����ܰ��ٲ� �ܰ��̻��� ���µ��ȯ����[OPTION]");
		ArrayList<Account> findAccounts = accountServiceArrayList.findByBalance(50000);
		System.out.println(" ��ȯ���¼�:" + findAccounts.size());
		findAccount.print();
		System.out.println();

		System.out.println("7.AccountServiceArrayList��������µ� �߿� �������̸��� AIM�� ���µ��ȯ����");
		System.out.println(accountServiceArrayList.findByName("AIM"));

		System.out.println(" 8.6666������ 4000�� �Ա�����");
		accountServiceArrayList.ipGum(6666, 4000);

		System.out.println("9.AccountServiceArrayList��1111������ 50000�� �������");
		accountServiceArrayList.chulGum(1111, 50000);

		System.out.println("9.VIP����(�ܰ� 70000���̻�)�� ��ȯ����");
		System.out.println(accountServiceArrayList.findByBalance(70000));

		System.out.println("10.���¸� �ܰ������ ����������������");
		accountServiceArrayList.sortByBalanceAsc();
		accountServiceArrayList.print();

		System.out.println("11.���¸� �ܰ������ ����������������");
		accountServiceArrayList.sortByBalanceDesc();
		accountServiceArrayList.print();

		System.out.println(" 12.6666�������� �̸�,�ܰ�,���� ����(update)");
		Account updateAccount = new Account(6666, "YYY", 900000000, 0.4);
		accountServiceArrayList.updateAccount(updateAccount);
		System.out.println();

		System.out.println(" 13.8888�����»���");
		Account deleteAccount = accountServiceArrayList.deleteByNo(8888);
		deleteAccount.print();
		System.out.println();

		System.out.println("-----------��ü���� ���-------------");
		accountServiceArrayList.print();
	}

}