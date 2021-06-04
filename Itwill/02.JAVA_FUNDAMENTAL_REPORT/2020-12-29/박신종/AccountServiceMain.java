package com.itwill05.service.account;

import java.util.Scanner;

public class AccountServiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountService accountService=new AccountService();
		
		System.out.println("0.Account추가(배열사이즈증가)");
		accountService.addAccount(new Account(1928, "NEW", 10000, 3.2));
		
		System.out.println("1.AccountService야 은행계좌들 총계좌수출력해줘");
		accountService.totAccountNumberPrint();
		
		System.out.println("2.AccountService야 은행계좌들 전체출력해줘");
		accountService.print();
		
		System.out.println("3.AccountService야 은행계좌들 총잔고 출력해줘");
		accountService.totBalancePrint();
		
		System.out.println("4.AccountService야 계좌번호줄께 계좌한개출력해줘");
		System.out.print("계좌번호를 입력하세요 : ");
		accountService.findByNoPrint(sc.nextInt());
		
		System.out.println("5.AccountService야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		System.out.print("계좌 잔고를 입력하세요 : ");
		accountService.findByBalancePrint(sc.nextInt());
		sc.nextLine();
		
		System.out.println("6.AccountService야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		System.out.print("계좌 이율을 입력하세요 : ");
		accountService.findByIyulPrint(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("7.AccountService야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		System.out.print("계좌주 이름을 입력하세요 : ");
		String ownerName = sc.nextLine();
		
		accountService.findByNamePrint(ownerName);
			
		System.out.println("8.AccountService야 계좌번호,입금할돈 인자로줄께 입금해줘");
		String[] noAndDepositMoney = sc.nextLine().split(",");
		accountService.ipGum(noAndDepositMoney);	
		
		System.out.println("9.AccountService야 계좌번호,출금할돈 인자로줄께 출금해줘");
		String[] noAndWithDrawMoney = sc.nextLine().split(",");
		accountService.chulGum(noAndWithDrawMoney);
		
		System.out.println("10.AccountService야 계좌를 잔고순으로 오름차순정렬");
		accountService.sortByBalanceAscending();
		
		System.out.println("11.AccountService야 계좌를 잔고순으로 내림차순정렬");
		accountService.sortByBalanceDescending();
		
		System.out.println("12.AccountService야 계좌객체데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountService.updateObjectAccount(new Account(3333, "FIM", 89000, 4.7));
		
		System.out.println("13.AccountService야 번호,이름,잔고,이율 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountService.updateParameterAccount(5555, "hIM", 78000, 3.7);
	}

}
