class MemberField{
	/*
	 * 1-1.멤버필드는 객체생성시 기본값(사용자값)으로 자동 초기화
	 */
	public int member1=78423783;
	public double member2=0.3247238;
	public char member3='김';
	public boolean member4=true;
	public String member5="헤헤헤";
	public MemberField(int member1, double member2, char member3, boolean member4, String member5) {
		/*
		 * 1-2.멤버필드 객체생성시 생성자 초기화
		 */
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
	}
}
public class MemberFieldInitializationMain {
	public static void main(String[] args) {
		MemberField mf=new MemberField(12,0.2,'힣',true,"초기화");
		System.out.println(mf.member1);
		System.out.println(mf.member2);
		System.out.println(mf.member3);
		System.out.println(mf.member4);
		System.out.println(mf.member5);
	}

}
