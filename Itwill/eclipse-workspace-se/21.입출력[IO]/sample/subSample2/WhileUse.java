
public class WhileUse {

	public static void main(String[] args) {
		System.out.println("----10회출력----");
		int i=0;
		while(i < 10) {
			System.out.println("while loop:"+i);
			i++;
		}
		
		System.out.println(">>1~10사이의 정수출력");
		i=0;
		while(i<10) {
			int no = i+1;
			System.out.print(no+",");
			i++;
		}
		System.out.println();
		System.out.println(">>1~10사이의 정수중 홀수출력");
		i=0;
		while(i<10) {
			int no = i+1;
			if(no%2==1) {
				System.out.print(no+",");
			}
			i++;
		}
		System.out.println();
		System.out.println(">>1~10사이의 정수중 4의배수출력");
		i=0;
		while(i<10) {
			int no=i+1;
			if(no%4==0) {
				System.out.print(no+",");
			}
			i++;
		}
		System.out.println();
		System.out.println(">>1~100사이의 정수중 3의배수이면서 4의배수인수출력");
		i=1;
		while(i<=100) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+",");
			}
			i++;
		}
		System.out.println();
		/*
		 * 1~100사이의 정수합
		 * 1~100사이의 홀수합
		 * 1~100사이의 짝수합
		 */
		i=0;
		int tot=0;
		int evenTot=0;
		int oddTot=0;
		while(i<100) {
			int no=i+1;
			tot=tot+no;
			if(no%2==0) {
				evenTot=evenTot+no;
			}else {
				oddTot=oddTot+no;
			}
			i++;
		}
		System.out.println("1~100사이의 정수합:"+tot);
		System.out.println("1~100사이의 짝수합:"+evenTot);
		System.out.println("1~100사이의 홀수합:"+oddTot);
		
		/*
		 * 전체문자출력
		 */
		char c1=0;
		while(c1 < 65535) {
			System.out.print(c1);
			c1++;
			if(c1%200==0) {
				System.out.println();
			}
		}
		System.out.println();
		/*
		 * 한글문자출력
		 */
		System.out.println("--------------한글출력-------------");
		char c2='가';
		int count=0;
		while(c2<='힣') {
			System.out.print(c2);
			count++;
			if(count%200 == 0) {
				System.out.println();
			}
			c2++;
		}
		
		
	}

}
