package com.itwill00.variable.김동현;

public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		// System.out.println("0.Account추가(번호중복체크,배열사이즈증가)");
		System.out.println("1.AccountService야 은행계좌들 총계좌수출력해줘");
		accountService.totalAccountNumberPrint();
		System.out.println("2.AccountService야 은행계좌들 전체출력해줘");
		accountService.print();
		System.out.println("3.AccountService야은행계좌들 총잔고 출력해줘");
		accountService.totalBalancePrint();
		System.out.println("4.AccountService야 계좌번호줄게 계좌한개출력해줘");
		accountService.findByNoPrint(1111);
		System.out.println("5.AccountService야 계좌잔고줄게 잔고이상인 계좌들출력해줘");
		accountService.findByBalancePrint(50000);
		System.out.println("6.AccountService야 계좌이율 인자로줄게 이율이상인 계좌들출력해줘");
		accountService.findByInterestPrint(2.5);
		System.out.println("7.AccountService야 계좌주이름 인자로줄게 계좌주이름과일치하는 계좌들출력해줘");
		accountService.findByNamePrint("KIM");
		System.out.println("8.AccountService야 계좌번호,입금할돈 인자로줄게 입금해줘");
		accountService.deposit(2222, 23000);
		accountService.findByNoPrint(2222);
		System.out.println("9.AccountService야 계좌번호,출금할돈 인자로줄게 출금해줘");
		accountService.withdraw(3333, 4000);
		accountService.findByNoPrint(3333);
		System.out.println("10.AccountService야 계좌를 잔고순으로 오름차순정렬");
		accountService.sortByBalanceAscending();
		accountService.print();
		System.out.println("11.AccountService야 계좌를 잔고순으로 내림차순정렬");
		accountService.sortByBalanceDescending();
		accountService.print();
		System.out.println("12.AccountService야 계좌객체데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountService.updateAccount(new Account(2222, "min", 53000, 1.5));
		accountService.findByNoPrint(2222);
		System.out.println("12.AccountService야 번호,이름,잔고,이율 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountService.updateAccount(3333, "choi", 23000, 6.5);
		accountService.findByNoPrint(3333);

		accountService.addAccount(new Account(1234, "MCJ", 99000, 9.9));
		accountService.print();

		accountService.addAccount(4321, "xxxx", 23000, 8.5);
		accountService.print();
	}

}