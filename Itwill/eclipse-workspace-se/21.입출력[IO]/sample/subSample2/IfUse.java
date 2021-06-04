
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수홀수판별후 메세지출력
		 */
		int no1 = 56;
		
		if (no1%2==0) {
			//System.out.println(no1+ " 는 짝수입니다.");
			System.out.printf("%d 는 %s 입니다.%n",no1,"짝수");
		} else {
			//System.out.println(no1+ " 는 홀수입니다.");
			System.out.printf("%d 는 %s 입니다.%n",no1,"홀수");
		}
		/*
		 * 4의배수판별후출력
		 */
		int no2=8909;
		if (no2%4==0) {
			//4의배수
			System.out.printf("%d 는 4의배수%n",no2);
		} else {
            //4의배수아님
			System.out.printf("%d 는 4의배수아님%n",no2);
		}
		/*
		 * 점수의 유효성체크
		 */
		int kor=-90;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d 는 유효한점수입니다.%n",kor);
		}else {
			System.out.printf("%d 는 유효한점수 아닙니다.%n",kor);
		}
	}
}
