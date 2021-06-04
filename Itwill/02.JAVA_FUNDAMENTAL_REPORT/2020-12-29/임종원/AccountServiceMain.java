  
package com.itwill05.service.account;


public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		System.out.println("0-1.Account추가(배열사이즈증가)");
		Account ac0 = new Account(1010,"HHHH",10100,0.6);
		accountService.addAccount(ac0);
		System.out.println("0-2.AccountService야 번호,이름,잔고,이율 계좌데이타줄께 Account 배열에 추가해줭");
		accountService.addAccount(1112,"MIM",77777,0.8);
		System.out.println("1.AccountService야 은행계좌들 총계좌수출력해줘");
		accountService.totAccountNumberPrint();
		System.out.println("2.AccountService야 은행계좌들 전체출력해줘");
		accountService.print();
		System.out.println("3.AccountService야 은행계좌들 총잔고 출력해줘");
		accountService.totBalancePrint();
		System.out.println("4.AccountService야 계좌번호줄께 계좌한개출력해줘");
		accountService.findByNoPrint(1111);	
		System.out.println("5.AccountService야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		accountService.findByBalancePrint(50000);
		System.out.println("6.AccountService야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		accountService.findByIyulPrint(1.8);
		System.out.println("7.AccountService야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		accountService.findByNamePrint("KIM");
		System.out.println("8.AccountService야 계좌번호,입금할돈 인자로줄께 입금해줘");
		accountService.ipGum(1111,30000);
		System.out.println("9.AccountService야 계좌번호,출금할돈 인자로줄께 출금해줘");
		accountService.chulGum(1111,30000);
		System.out.println("10.AccountService야 계좌를 잔고순으로 오름차순정렬");
		accountService.sortByBalanceAscending();
		System.out.println("11.AccountService야 계좌를 잔고순으로 내림차순정렬");
		accountService.sortByBalanceDescending();
		System.out.println("12.AccountService야 계좌객체데이타줄께 이름,잔고,이율 수정(update)해줘");
		Account ac1 = new Account(9999,"LIM",55555,2.6);
		accountService.updateAccount(ac1);
		System.out.println("13.AccountService야 번호,이름,잔고,이율 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountService.updateAccount(9999,"Rim",44444,0.6);
	}

}