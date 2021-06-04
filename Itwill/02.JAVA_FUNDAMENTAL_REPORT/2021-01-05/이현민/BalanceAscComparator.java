package com.itwill06.collection.account;

import java.util.Comparator;

public class BalanceAscComparator implements Comparator<Account> {

	@Override
	public int compare(Account acc1, Account acc2) {
		return acc1.getBalance()-acc2.getBalance();
	}

}
