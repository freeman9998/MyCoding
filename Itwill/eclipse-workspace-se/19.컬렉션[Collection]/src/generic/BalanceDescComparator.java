package generic;

import java.util.Comparator;

/*
 * interface Comparator 를 사용한정렬
 *    - Comparator interface를 implement 한 클래스작성
 *    - Comparator.compare 메쏘드구현
 */
public class BalanceDescComparator implements Comparator<Account>{

	@Override
	public int compare(Account acc1, Account acc2) {
		return acc2.getBalance()-acc1.getBalance();
		/*
		if(acc1.getBalance() < acc2.getBalance()) {
			return 1;
		}else {
			return -1;
		}
		*/
	}

}
