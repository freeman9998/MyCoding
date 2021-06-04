package com.itwill05.service.account;


public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		//System.out.println("0.Account추가(배열사이즈증가)");
		System.out.println("1.AccountService야 은행계좌들 총계좌수출력해줘");
			accountService.totAccountNumberPrint();
			
		System.out.println("2.AccountService야 은행계좌들 전체출력해줘");
			accountService.print();
			
		System.out.println("3.AccountService야은행계좌들 총잔고 출력해줘");
			accountService.totBalancePrint();
			
		System.out.println("4.AccountService야 계좌번호줄께 계좌한개출력해줘");
			accountService.findByNoPrint(1111);
			accountService.findByNoPrint(3333);
			accountService.findByNoPrint(8888);
			
		System.out.println("5.AccountService야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
			accountService.findByBalancePrint(78000);
		
		System.out.println("6.AccountService야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
			accountService.findByIyulPrint(3.7);
			
		System.out.println("7.AccountService야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
			accountService.findByNamePrint("KIM");
			
		System.out.println("8.AccountService야 계좌번호,입금할돈 인자로줄께 입금해줘");
			accountService.ipGum(3333, 1000);
			
		System.out.println("9.AccountService야 계좌번호,출금할돈 인자로줄께 출금해줘");
			accountService.chulGum(7777, 10000);
			
		System.out.println("10.AccountService야 계좌를 잔고순으로 오름차순정렬");
			accountService.sortByBalanceAscending();
			
		System.out.println("11.AccountService야 계좌를 잔고순으로 내림차순정렬");
			accountService.sortByBalanceDecending();
			
		System.out.println("12.AccountService야 계좌객체의 참조변수줄께 이름,잔고,이율 수정(update)해줘");
			Account a1 = new Account(6666, "JUNG", 33000, 3.4);
			accountService.updateAccount(a1);
		
		System.out.println("12.AccountService야 번호,이름,잔고,이율 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
			accountService.updateAccount(9999, "HUNG", 99000, 4.1);
	}

}
