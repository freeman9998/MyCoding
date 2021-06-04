package com.itwill05.service.account;

import java.util.Scanner;

public class AccountServiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountService accountService=new AccountService();
		
		System.out.println("0.Account�߰�(�迭����������)");
		accountService.addAccount(new Account(1928, "NEW", 10000, 3.2));
		
		System.out.println("1.AccountService�� ������µ� �Ѱ��¼��������");
		accountService.totAccountNumberPrint();
		
		System.out.println("2.AccountService�� ������µ� ��ü�������");
		accountService.print();
		
		System.out.println("3.AccountService�� ������µ� ���ܰ� �������");
		accountService.totBalancePrint();
		
		System.out.println("4.AccountService�� ���¹�ȣ�ٲ� �����Ѱ��������");
		System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
		accountService.findByNoPrint(sc.nextInt());
		
		System.out.println("5.AccountService�� �����ܰ��ٲ� �ܰ��̻��� ���µ��������");
		System.out.print("���� �ܰ� �Է��ϼ��� : ");
		accountService.findByBalancePrint(sc.nextInt());
		sc.nextLine();
		
		System.out.println("6.AccountService�� �������� ���ڷ��ٲ� �����̻��� ���µ��������");
		System.out.print("���� ������ �Է��ϼ��� : ");
		accountService.findByIyulPrint(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("7.AccountService�� �������̸� ���ڷ��ٲ� �������̸�����ġ�ϴ� ���µ��������");
		System.out.print("������ �̸��� �Է��ϼ��� : ");
		String ownerName = sc.nextLine();
		
		accountService.findByNamePrint(ownerName);
			
		System.out.println("8.AccountService�� ���¹�ȣ,�Ա��ҵ� ���ڷ��ٲ� �Ա�����");
		String[] noAndDepositMoney = sc.nextLine().split(",");
		accountService.ipGum(noAndDepositMoney);	
		
		System.out.println("9.AccountService�� ���¹�ȣ,����ҵ� ���ڷ��ٲ� �������");
		String[] noAndWithDrawMoney = sc.nextLine().split(",");
		accountService.chulGum(noAndWithDrawMoney);
		
		System.out.println("10.AccountService�� ���¸� �ܰ������ ������������");
		accountService.sortByBalanceAscending();
		
		System.out.println("11.AccountService�� ���¸� �ܰ������ ������������");
		accountService.sortByBalanceDescending();
		
		System.out.println("12.AccountService�� ���°�ü����Ÿ�ٲ� �̸�,�ܰ�,���� ����(update)����");
		accountService.updateObjectAccount(new Account(3333, "FIM", 89000, 4.7));
		
		System.out.println("13.AccountService�� ��ȣ,�̸�,�ܰ�,���� ���µ���Ÿ�ٲ� �̸�,�ܰ�,���� ����(update)����");
		accountService.updateParameterAccount(5555, "hIM", 78000, 3.7);
	}

}
