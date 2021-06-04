package generic;

import java.util.Comparator;

public class BalanceAscComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getBalance()-o2.getBalance();
		/*
		if(o1.getBalance() > o2.getBalance()) {
			return 1;
		}else {
			return -1;
		}
		*/
	}

}
