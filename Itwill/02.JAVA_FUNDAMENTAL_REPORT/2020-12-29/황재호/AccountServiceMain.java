package com.itwill05.service.accunt;

public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		//System.out.println("0.Account�߰�(��ȣ�ߺ�üũ,�迭����������)");
		System.out.println("1.AccountService�� ������µ� �Ѱ��¼��������");
		accountService.totAccountNumberPrint();
		System.out.println();
		System.out.println("2.AccountService�� ������µ� ��ü�������");
		accountService.print();
		System.out.println();
		System.out.println("3.AccountService��������µ� ���ܰ� �������");
		accountService.totBalaneceprint();
		System.out.println();
		System.out.println("4.AccountService�� ���¹�ȣ�ٲ� �����Ѱ��������");
		accountService.findByNoPrint(6666);
		System.out.println();
		System.out.println("5.AccountService�� �����ܰ��ٲ� �ܰ��̻��� ���µ��������");
		accountService.findByBalancePrint(60000);
		System.out.println();
		System.out.println("6.AccountService�� �������� ���ڷ��ٲ� �����̻��� ���µ��������");
		accountService.findByIyulPrint(3.0);
		System.out.println();
		System.out.println("7.AccountService�� �������̸� ���ڷ��ٲ� �������̸�����ġ�ϴ� ���µ��������");
		accountService.findBuNamePrint("KIM");
		System.out.println();
		System.out.println("8.AccountService�� ���¹�ȣ,�Ա��ҵ� ���ڷ��ٲ� �Ա�����");
		accountService.ipGum(2222, 100);
		System.out.println();
		System.out.println("9.AccountService�� ���¹�ȣ,����ҵ� ���ڷ��ٲ� �������");
		accountService.chulGum(5555, 10);
		System.out.println();
		System.out.println("10.AccountService�� ���¸� �ܰ������ ������������");
		accountService.sortByBalanceAscendig();
		System.out.println();
		System.out.println("11.AccountService�� ���¸� �ܰ������ ������������");
		accountService.sortByBalanceDescendig();
		System.out.println();
		System.out.println("12.AccountService�� ���°�ü����Ÿ�ٲ� �̸�,�ܰ�,���� ����(update)����");
		System.out.println("13.AccountService�� ��ȣ,�̸�,�ܰ�,���� ���µ���Ÿ�ٲ� �̸�,�ܰ�,���� ����(update)����");
	}

}
