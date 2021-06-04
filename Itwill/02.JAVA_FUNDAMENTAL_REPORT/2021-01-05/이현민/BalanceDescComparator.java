package com.itwill06.collection.account;

import java.util.Comparator;

public class BalanceDescComparator implements Comparator<Account>{

	@Override
	public int compare(Account acc1, Account acc2) {
		return acc2.getBalance()-acc1.getBalance();
	}

}
