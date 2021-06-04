package com.itwill05.service.account;


public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		System.out.println("0.Account추가(번호중복체크,배열사이즈증가)");
		accountService.addAccount(new Account(0000, "AIM", 555555, 0.3));
		System.out.println("1.AccountService야 은행계좌들 총계좌수출력해줘");
		accountService.totAccountsCount();
		System.out.println("2.AccountService야 은행계좌들 전체출력해줘");
		accountService.totAccountsInfo();
		System.out.println("3.AccountService야 은행계좌들 총잔고 출력해줘");
		accountService.totBalance();
		System.out.println("4.AccountService야 계좌번호줄께 계좌한개출력해줘");
		accountService.oneAccountprint(1111);
		accountService.oneAccountprint(2222);
		accountService.oneAccountprint(3332);
		accountService.oneAccountprint(4421);
		accountService.oneAccountprint(5555);
		System.out.println("5.AccountService야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		accountService.overBalance(10000);
		accountService.overBalance(222222);
		System.out.println("6.AccountService야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		accountService.overIyul(0.1);
		accountService.overIyul(0.2);
		accountService.overIyul(0.3);
		System.out.println("7.AccountService야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		accountService.equalAccounts("KIM");
		System.out.println("8.AccountService야 계좌번호,입금할돈 인자로줄께 입금해줘");
		accountService.deposit(1111, 30000000);
		accountService.deposit(3333, 60000000);
		accountService.deposit(4444, 10000000);
		System.out.println("9.AccountService야 계좌번호,출금할돈 인자로줄께 출금해줘");
		accountService.deposit(1111, 1200000);
		accountService.deposit(3333, 5400000);
		accountService.deposit(4444, 4200000);
		System.out.println("10.AccountService야 계좌를 잔고순으로 오름차순정렬");
		accountService.ascendingOrder();
		System.out.println("11.AccountService야 계좌를 잔고순으로 내림차순정렬");
		accountService.descendingOrder();
		System.out.println("12.AccountService야 계좌객체데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountService.updateAccount6(new Account(6666, "KIM", 50000000, 0.5));
		System.out.println("13.AccountService야 번호,이름,잔고,이율 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountService.updateAccount();
	}

}
