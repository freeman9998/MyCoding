import java.net.Socket;

/*
 변수선언을 
 연습하기위한클래스(장문주석)
 */
/*
		변수의선언
          - 의미:JVM 에게메모리를할당해달라고
                                요청하는작업
		  - 형태:
		        데이타타입 변수이름;
		         ex> int   number;

		  - 변수식별자규직(클래스이름,변수이름,메쏘드이름)
			   - 영문이나,한글로시작
			   - 특수문자사용불가(_,$)
			   - 키워드 사용금지
*/
public class VariableDeclare {

	public static void main(String[] args) {
		// 변수의선언(단문주석)
		int score1;
		// 변수에값대입
		score1 = 100;
		// 변수의 값출력
		System.out.println(score1);//?????
		// 변수의값대입(변경)
		score1 = 333;
		System.out.println(score1);
		score1 = 400;
		System.out.println(score1);

		// 변수의선언 값대입
		int score2 = 500;
		/*
		 * << content assist 단축키>> ctrl + space
		 */
		System.out.println(score2);

		int _number;
		int $number;
		int 번호;
		/*
		 * int 7number; 
		 * int my score; 
		 * int my*score;
		 */
		_number = 333;
		$number = 555;
		번호 = 777;
		System.out.println(_number);
		System.out.println($number);
		System.out.println(번호);

		int kor, eng, math;
		kor = 89;
		eng = 90;
		math = 67;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		/*
		<< history cannot be resolved to a variable >>
		history = 100;
		*/
		/*
		<< Duplicate local variable kor >>
		int kor;
		*/
		
		/* 변수선언
		 * 데이타타입 변수이름;
		 */
		String name;
		name="김경호";
		System.out.println(name);
		
		
		
		
	}

}








