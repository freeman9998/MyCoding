package wrapperclass;

public class WrapperClass연산Main {

	public static void main(String[] args) {
		Integer wi1=new Integer(89);
		Integer wi2=new Integer(89);
		Integer wi3=wi1;
		Integer wi4=89;
		
		/*<<String,WrapperClass 비교연산>>
		   - String,WrapperClass는 주소비교연산(==)을 절대로하지않는다.[== 연산자사용금지]
		   - String,WrapperClass는 객체가가지고있는문자열(String),기본형데이타(Wrappper)
             의 내용비교를 해야한다.
           - 반드시 equals메쏘드를 사용하여야한다.
                String --> 문자열의 내용비교로 재정의	
                Wrapper--> 기본형데이타의 내용비교로 재정의	  
		 */
		
		/*
		 * 객체주소비교 (==)
		 */
		/*
		if(wi1==wi2) {
			System.out.println("wi1 == wi2 주소가동일함");
		}else {
			System.out.println("wi1 != wi2 주소가동일안함");
		}
		if(wi1==wi3) {
			System.out.println("wi1==wi3 주소가동일함");
		}
		*/
		if(wi1.equals(wi2)) {
			System.out.println("wi1,wi2의 멤버로가지고있는 기본형int값이 동일하다.");
		}
		if(wi1.equals(wi3)) {
			System.out.println("wi1,wi3의 멤버로가지고있는 기본형int값이 동일하다.");
		}
		if(wi1.equals(wi4)) {
			System.out.println("wi1,wi4의 멤버로가지고있는 기본형int값이 동일하다.");
		}
		if(wi2.equals(wi3)) {
			System.out.println("wi2,wi3의 멤버로가지고있는 기본형int값이 동일하다.");
		}
		if(wi2.equals(wi4)) {
			System.out.println("wi2,wi4의 멤버로가지고있는 기본형int값이 동일하다.");
		}
		/*
		if(wi2.equals(89)) {
			System.out.println("wi2,89 의 멤버로가지고있는 기본형int값이 동일하다.");
		}
		*/
		

	}

}
