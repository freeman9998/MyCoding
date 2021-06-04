class MemberField {
	/*
	 * 필드선언
	 */
	int member1;
	double member2;
	char member3;
	String member4;
}
public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 객체생성후 주소값 참조변수 대입
		 */
		MemberField mf1=new MemberField();
		/*
		 * 객체의 참조변수를 통한 멤버필드(변수)에 데이타 대입(쓰기)
		 *  멤버필드접근방법
		 *    --> 참조변수.필드이름
		 */
		mf1.member1=12;
		mf1.member2=3.14;
		mf1.member3='꿈';
		mf1.member4="문자열";
		
		MemberField mf2=new MemberField();
		mf2.member1=56;
		mf2.member2=30;
		mf2.member3='깨';
		mf2.member4="문자열대입";
		/*
		 *객체의 참조변수를 통한 멤버필드(변수)의 값읽기
		 */
		System.out.println("--------------"+mf1+"----------------");
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println("--------------"+mf2+"----------------");
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		/*
		
		 */
	}

}
