package com.itwill05.service.account;

public class AccountServiceReturnMain {
	public static void main(String[] args) {
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		System.out.println("0.AccountService객체야 은행계좌 추가해줘");
		Account ac0 = new Account(1010,"HIM",77788,9.9);
		accountServiceReturn.addAccount(ac0);
		accountServiceReturn.addAccount(1212, "JJAN", 95000, 0.5);
		System.out.println("1.AccountService객체야 은행계좌 총계좌수를 반환해줘");
		int totNo=accountServiceReturn.getTotAccountNumber();	
		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");
		accountServiceReturn.print();	
		System.out.println("3.AccountService객체야 은행계좌들 총잔고를 반환해줘");
		int totBalance=accountServiceReturn.getAccountTotBalance();
		System.out.println(">>>> 총잔고:"+totBalance);	
		System.out.println("4.AccountService객체야 계좌번호를인자로 넣어줄께 계좌한개참조변수를 반환해줘");
		Account findAccount = accountServiceReturn.findByNo(11111);
		System.out.println("5.AccountService객체야 "
			+ "계좌잔고를 인자로줄께 잔고이상인 계좌객체배열 참조변수반환해줘");
		Account[] findAccounts = accountServiceReturn.findByBalance(5000);
		System.out.println("6.AccountService객체야  계좌이율(5.0)을 인자로줄께 이율이상인 계좌객체배열 참조변수 반환해줘");
		Account[] findAccountss = accountServiceReturn.findByIyul(1.0);
		System.out.println("7.AccountService객체야  계좌주이름(AIM)을 인자로줄께 계좌객체배열 참조변수 반환해줘");
		Account[] findAccountsss = accountServiceReturn.findByName("AIM");
		System.out.println("8.AccountService객체야 "
				+ "계좌번호(6666번)와 입금할돈(4000원)줄께 입금해줘");
		accountServiceReturn.ipGum(6666, 4000);
		System.out.println("9.AccountService객체야 계좌번호(1111번)와 출금할돈(500원)줄께 출금해줘");
		accountServiceReturn.chulGum(1111, 500);
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceReturn.sort(3, 1);
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceReturn.sort(3, 2);
		System.out.println("11.AccountService객체야 계좌를 예금주이름순(사전순)으로 오름차순정렬");
		accountServiceReturn.sort(2, 1);
		System.out.println("12.AccountService야 계좌객체줄께 이름,잔고,이율 수정(update)해줘");
		Account ac1 = new Account(9999,"LIM",55555,2.6);
		accountServiceReturn.updateAccount(ac1);
		System.out.println("13.AccountService야 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountServiceReturn.updateAccount(9999,"KIM",44444,3.5);
		System.out.println("14.AccountService객체야 계좌번호줄께 계좌삭제해줘");
		accountServiceReturn.deleteNo(1111);
	}

}
