package generic;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays클래스Main {

	public static void main(String[] args) {
		Account[] accounts= {
				new Account(1111, "ONE", 50000, 2.5),
				new Account(2222, "KIM", 56000, 0.9),
				new Account(3333, "PAR", 12000, 1.9),
				new Account(4444, "CHO", 89000, 4.9),
				new Account(5555, "SIM", 34000, 0.6),
				new Account(6666, "KIM", 77000, 0.1),
				new Account(7777, "KIM", 11000, 0.3),
				new Account(8888, "GIM", 21000, 2.4),
				new Account(9999, "QIM", 99000, 3.3)
		};
		int[] intArray1= {1,3,5,7,9};
		int[] intArray2= {1,3,5,7,9};
		
		String[] strArray1= {new String("one"),"two","three"};
		String[] strArray2= {new String("one"),"two","three"};
		/*
		 * << Arrays 클래스 >>
		 *   - 배열객체조작클래스
		 */
		System.out.println("1.배열의 내용비교");
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println(">>>"+isSame);
		isSame=Arrays.equals(strArray1, strArray2);
		System.out.println(">>>"+isSame);
		System.out.println("2.배열의 원소채우기");
		int[] intArray3=new int[10];
		Arrays.fill(intArray3, 55);
		for (int i : intArray3) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("3.배열복사");
		int[] intArray1Copy = Arrays.copyOf(intArray1, intArray1.length);
		for (int i : intArray1Copy) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] intArray2Copy=Arrays.copyOf(intArray2, 10);
		for (int i : intArray2Copy) {
			System.out.print(i+" ");
		}
		System.out.println();
		Account[] copyAccounts = Arrays.copyOf(accounts, accounts.length);
		for (Account account : copyAccounts) {
			account.print();
		}
		
		String[] strArray1Copy=new String[strArray1.length];
		System.arraycopy(strArray1, 0, strArray1Copy, 0, strArray1.length);
		for (String str : strArray1Copy) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println("-------------------sort[기본형]----------------------");
		int[] scoreArray= {90,89,45,23,88,56,11};
		/*
		Sorts the specified array into ascending numerical order. 
		 */
		Arrays.sort(scoreArray);
		for (int score : scoreArray) {
			System.out.print(score+" ");
		}
		System.out.println();
		for (int i = scoreArray.length-1; i >= 0; i--) {
			System.out.print(scoreArray[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------sort[참조형]----------------------");
		/*
		 * 1. java.lang.Comparable interface를 implement해야한다.
		 * 2. Comparable.compareTo를 구현해야한다.
		 */
		
		/*
		 * String
		 * 
		 */
		String[] nameArray= {"KIM","AIM","LIM","BIM","OIM"};
		Arrays.sort(nameArray);
		for (String name : nameArray) {
			System.out.print(name+" ");
		}
		System.out.println();
		/*
		 * Wrapper
		 */
		Integer[] wia= {new Integer(90),
						new Integer(67),
						new Integer(12),
						new Integer(56),
						89,23,99};
		Arrays.sort(wia);
		for (Integer wi : wia) {
			System.out.print(wi.intValue()+" ");
		}
		System.out.println();
		/*
		 * Account
		 */
		Arrays.sort(accounts);
		/*
		 * 1. Account[]의 0번째 Account 객체를 Comparable interface type으로 형변환한다.
		 * 2. Account[]의 1번째 Account 객체를 Comparable interface type으로 형변환한다.
		 * 3. Comparable.compareTo() 메쏘드호출
		 * 4. 반환값이 양수이면 교체,음수 교체안함
		 */
		/*
		public static void sort(accounts){
			Comparable com0 = accounts[0];
			Comparable com1 = accounts[1];
			int result=com0.compareTo(com1);
			if(result > 0) {
				//교체
				//com0,com1교체
			}
		}
		*/
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("---------Comparator를 사용한정렬---------");
		/*
		 * interface Comparator 를 사용한정렬
		 *    - Comparator interface를 implement 한 클래스작성
		 *    - Comparator.compare 메쏘드구현
		 */
		System.out.println("---------------잔고내림차순--------------------");
		Comparator<Account> balanceDescComparator=new BalanceDescComparator();
		Arrays.sort(accounts,balanceDescComparator);
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("---------------잔고오름차순--------------------");
		Comparator<Account> balanceAscComparator=new BalanceAscComparator();
		Arrays.sort(accounts,balanceAscComparator);
		for (Account account : accounts) {
			account.print();
		}
		System.out.println("---------------이름오름차순--------------------");
		Comparator<Account> nameAscComparator=new NameAscComparator();
		Arrays.sort(accounts,nameAscComparator);
		for (Account account : accounts) {
			account.print();
		}
		
		
		
	}

}













