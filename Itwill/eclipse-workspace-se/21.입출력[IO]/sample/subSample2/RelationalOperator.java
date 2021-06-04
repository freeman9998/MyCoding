/*
	 2.관계(비교)연산
	     - 형태:  >, < ,>= , <= ,==,!=
	     - 관계연산의 결과값은 논리형 데이타(리터럴)이다(true,false)
	*/
/*
 * format단축키
 *   ctrl + shift + f
 */
public class RelationalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean bresult;
		bresult = a > b;
		System.out.println("10>20 =" + bresult);
		bresult = a < b;
		System.out.println("10<20 =" + bresult);
		bresult = a >= b;
		System.out.println("10>=20 =" + bresult);
		bresult = a <= b;
		System.out.println("10<=20 =" + bresult);
		bresult = a == b;
		System.out.println("10==20 =" + bresult);
		bresult = a != b;
		System.out.println("10!=20 =" + bresult);

		char ca = 'A';
		char cb = 'B';
		char ch1 = '가';
		char ch2 = '힣';
		bresult = ca < cb;
		System.out.println("'A' < 'B' -->" + bresult);
		bresult = ch1 > ch2;
		System.out.println("'가' > '힣' -->" + bresult);

	}

}
