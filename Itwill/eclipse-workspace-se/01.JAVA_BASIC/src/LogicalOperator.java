/*
		3.논리연산자
		   - 형태: ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형변수,논리형리터럴(데이타)이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false
*/
public class LogicalOperator {

	public static void main(String[] args) {
		boolean b1=false;
		boolean b2=false;
		boolean b3=true;
		boolean b4=true;
		
		boolean bresult;
		/*
		 * Logical OR(논리합) ||
		 */
		bresult = b1 || b2;
		System.out.println("false || false -->"+bresult);
		/*
		 * Logical AND(논리곱) &&
		 */
		
		bresult = b3&&b4;
		System.out.println("true && true -->"+bresult);
		
		System.out.println("-----------------------------------------");
		int kor=95;
		int math=23;
		
		boolean isPass = (kor>=90) || (math>=90);
		System.out.println("A 대학합격여부(||):"+isPass);
		
		isPass =  kor>=90 && math>=90;
		System.out.println("B 대학합격여부(&&):"+isPass);
 		
		System.out.println("----------영어점수의 유효성( 0 ~ 100 )-------------");
		int eng = -90;
		boolean isValid =  (eng>=0) && (eng<=100);
		System.out.println("유효한점수여부:"+isValid);
		System.out.println("----------배수판별-------------");
		int number=32;
		boolean b = (number%3)==0;
		System.out.println("3의배수여부:"+b);
		b = (number%4)==0;
		System.out.println("4의배수여부:"+b);
		b= (number%4)!=0;
		System.out.println("4의배수가아닌수의여부:"+b);
		
		/*
		 * Quiz: 윤년여부판단
		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수)
		 *      이거나
		 *    - 400의배수(4000로나누어떨어지는수)
		 */
		
		int y=2020;
		boolean isLeapYear=true;
		System.out.println(y+" 의 윤년여부:"+isLeapYear);
		boolean bbb = (true||false)&&(true||false);
	}

}
