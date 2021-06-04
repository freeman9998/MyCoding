/*
 * 단항연산자
 */
public class UnaryOperator {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(ar);
		System.out.println(b);
		System.out.println(br);
		
		boolean isPlay1=false;
		boolean isPlay2 = !isPlay1;
		System.out.println(isPlay1);
		System.out.println(isPlay2);
		System.out.println("--------------------");
		boolean myTurn=true;
		System.out.println(myTurn);
		myTurn=!myTurn;
		System.out.println(myTurn);
		/*
		 * 증가 감소 연산자
		 *   ++ , --
		 */
		int i=5;
		int j=5;
		
		i++;// i = i+1;
		j--;// j = j-1;
		System.out.println("-------------------------");
		System.out.println("i++ -->"+i);
		System.out.println("i-- -->"+j);
		
		
		
		
	}

}
