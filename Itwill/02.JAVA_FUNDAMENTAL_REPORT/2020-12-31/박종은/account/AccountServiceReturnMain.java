package study05.sevice.account;



public class AccountServiceReturnMain {
	public static void main(String[] args) {
		
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		
		System.out.println("0.AccountService객체야 은행계좌 추가해줘");
		accountServiceReturn.addAccount(new Account(1234, "ONE", 40000, 1.8));
		accountServiceReturn.addAccount(4567, "TWO", 90000, 5.3);
		accountServiceReturn.print();
		System.out.println();
		
		/*
		Account newAcc = new Account(1234, "one", 40000, 1.8);
		accountServiceReturn.addAccount(newAcc);
		accountServiceReturn.addAccount(4567, "two", 90000, 5.3);
		*/
		System.out.println("1.AccountService객체야 은행계좌 총계좌수를 반환해줘");
		int totNo=accountServiceReturn.getTotAccountNumber();
		System.out.println(">>>> 총계좌수:"+totNo);
		accountServiceReturn.print();
	
		
		
		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");
		accountServiceReturn.print();
	
		
		
		System.out.println("3.AccountService객체야 은행계좌들 총잔고를 반환해줘");
		int totBalance=accountServiceReturn.getAccountTotBalance();
		System.out.println(">>>> 총잔고:"+totBalance);
		accountServiceReturn.print();
	
		
		
		System.out.println("4.AccountService객체야 계좌번호를인자로 넣어줄께 계좌한개참조변수를 반환해줘");
		Account acc = accountServiceReturn.findByNo(3333);
		accountServiceReturn.print();
	
		
		
		System.out.println("5.AccountService객체야 "
			+ "계좌잔고를 인자로줄께 잔고이상인 계좌객체배열 참조변수반환해줘");
		Account[] findAccountsBalance = accountServiceReturn.findByBalance(333);
		if(findAccountsBalance != null) {
			for (int i = 0; i < findAccountsBalance.length; i++) {
				findAccountsBalance[i].print();
			}
		}
	
		
		
		System.out.println("6.AccountService객체야  계좌이율(5.0)을 인자로줄께 이율이상인 계좌객체배열 참조변수 반환해줘");
		// << Duplicate local variable findAccounts >> 로컬 변수
		Account[] findAccountsIyul = accountServiceReturn.findByIyul(7.7);
		accountServiceReturn.print();
	
		
		
		System.out.println("7.AccountService객체야  계좌주이름(AIM)을 인자로줄께 계좌객체배열 참조변수 반환해줘");
		Account[] findAccountsOwner = accountServiceReturn.findByOwner("KIM");
		accountServiceReturn.print();
		
		
		
		System.out.println("8.AccountService객체야 "
				+ "계좌번호(6666번)와 입금할돈(4000원)줄께 입금해줘");
		accountServiceReturn.ipgum(6666, 4000);
		accountServiceReturn.print();
	
		
		
		System.out.println("9.AccountService객체야 계좌번호(1111번)와 출금할돈(500원)줄께 출금해줘");
		accountServiceReturn.chulgum(1111, 500);
		accountServiceReturn.print();
	
		
		
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceReturn.sort(AccountServiceReturn.FIELD_BALANCE, AccountServiceReturn.SORT_ASC);
		accountServiceReturn.print();
		
		
		
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceReturn.sort(AccountServiceReturn.FIELD_BALANCE, AccountServiceReturn.SORT_DESC);
		accountServiceReturn.print();
	
		
		
		System.out.println("11.AccountService객체야 계좌를 예금주이름순(사전순)으로 오름차순정렬");
		accountServiceReturn.sort(AccountServiceReturn.FIELD_OWNER, AccountServiceReturn.SORT_ASC);
		accountServiceReturn.print();
		
		
		
		System.out.println("12.AccountService야 계좌객체줄께 이름,잔고,이율 수정(update)해줘");
		Account updateAccount = new Account(1111, "BANANA", 222222, 5.5);
		accountServiceReturn.updateAccount(updateAccount);
		accountServiceReturn.print();
		
		
		
		System.out.println("13.AccountService야 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountServiceReturn.updateAccount(7777, "CAN", 99999, 3.3);
		accountServiceReturn.print();
	
		
		
		System.out.println("14.AccountService객체야 계좌번호줄께 계좌삭제해줘");
		accountServiceReturn.deleteAccount(4444);
		accountServiceReturn.print();
		
	}

}
