public class ArithmaticOperator {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
		/*
		The local variable result may not have been initialized
		System.out.println(result);
		 */
		result = a + b;
		System.out.println("a + b ="+result);
		/*
		 * 코드이동단축키
		 *  alt + up,down arrow
		 */
		result =a - b;
		System.out.println("a - b ="+result);
		result = a / b;
		System.out.println("int a/b = "+result);
		double resultd = a/(double)b; //???
		System.out.println("double a/b = "+resultd);
		result=a*b;
		System.out.println("a*b = "+result);
		/*
		  % 나머지연산자
		 */
		int year=2020;
		result = year % 4;  //0 ~ 3
		System.out.println("2020 % 4 -->"+result);
		result = year % 100;//0 ~ 99
		System.out.println("2020 % 100 -->"+result);
		result=year% 400;   //0~399
		System.out.println("2020 % 400 -->"+result);
		
		int no = 16;
		result= no % 4;
		System.out.println("result값이 0 이면 4의배수:"+result);
		/*
		 * 문자연산
		 */
		System.out.println("---------------문자연산--------------");
		char ca='A';
		char cz='Z';
		result = ca;
		System.out.println("A의 유니코드:"+result);
		result = ca+1;
		System.out.println("A + 1 의 유니코드:"+result);
		char cresult = (char)result;
		System.out.println("cresult:"+cresult);
		int numOfAlphabet = cz-ca+1;
		System.out.println("numOfAlphabet:"+numOfAlphabet);
		int numOfHangul = '힣'-'가'+1;
		System.out.println("numOfHangul:"+numOfHangul);
		
		/*
		 * 비트연산
		 *  << , >>
		 */
		int c = 1;
		/*
		 1 --> 00000000|00000000|00000000|00000001 
		       c << 1
		 2 --> 00000000|00000000|00000000|00000010
		       c << 2
		 4 --> 00000000|00000000|00000000|00000100      
		 */
		
		result = c << 1;
		System.out.println("c << 1-->"+result);
		result = c << 2;
		System.out.println("c << 2-->"+result);
		int d = 0b00000000000000000000000010000000;
		//int d=128;
		/*
		 128 --> 00000000|00000000|00000000|10000000 
		 64  --> 00000000|00000000|00000000|01000000 
		 32  --> 00000000|00000000|00000000|00100000 
	     */
		System.out.println("d      -->"+d);
		result = d >> 1;
		System.out.println("d >> 1 -->"+result);
		result = d >> 2;
		System.out.println("d >> 2 -->"+result);
		result = d >> 3;
		System.out.println("d >> 3 -->"+result);
	}
}
