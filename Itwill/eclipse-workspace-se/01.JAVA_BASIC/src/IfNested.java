
public class IfNested {

	public static void main(String[] args) {
		
		int kor= 90;
		/*
		 * 평점산출 A,B,C,D,F
		 */
		
		char grade=' ';
		
		if(kor>=90) {
			grade='A';
		}else {
			if(kor>=80) {
				grade='B';
			}else {
				if(kor>=70) {
					grade='C';
				}else {
					if(kor>=60) {
						grade='D';
					}else {
						grade='F';
					}
				}
			}
		}
		System.out.printf("1.학점은 %c  입니다.%n",grade);
		grade=' ';
		if(kor>=90) {
			grade='A';
		}else if(kor>=80) {
			grade='B';
		}else if(kor>=70) {
			grade='C';
		}else if(kor>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.printf("2.학점은 %c  입니다.%n",grade);
		
		/*
		 * Quiz:각학점별로 메세지를 출력하세요
		 *      A(98점이상) :최우수
		 *      A		    :우수
		 *      B			:선방
		 *      C			:으이그~~
		 *      D			:재수강
		 *      F			:ㅠㅠ
		 */
		
		
		
	}
}
