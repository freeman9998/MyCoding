class MemberMethodReturn{
	int member1=56;
	int member2=89;
	
	int method1(){
		System.out.println("MemberMethodReturn.method1()실행");
		int result = 2 + 9;
		//return <<호출한놈에게 반환할값(변수,리터럴,연산의결과)>>
		/*
		Void methods cannot return a value
		 */
		/*
		 * - 호출한곳으로 실행흐름(쓰레드) 반환
		 * - 호출한곳으로 데이타반환
		 * - 반환할 데이타가없는 경우에는 return문 생략가능하다 
		 * - 반환할 데이타가있는 경우에는 return문 반드시기술하여야 한다 
		 */
		return result;
	}
	boolean isMarried() {
		System.out.println("MemberMethodReturn.isMarried()실행");
		boolean married = true;
		return married;
	}
	/*
	 * 두개의 정수를 받아서 더한후 정수결과값 반환
	 */
	int add(int a,int b) {
		//This method must return a result of type int
		int result = a+b;
		return result;
	}
	int addMembers() {
		int r=this.member1+this.member2;
		return r;
	}
	//setter method
	void setMember1(int member1) {
		this.member1=member1;
		
	}
	void setMember2(int member2) {
		this.member2=member2;
	}
	
	//getter method
	int getMember1() {
		return this.member1;
	}
	int getMember2() {
		return member2;
	}
	
	
	
}

public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr=new MemberMethodReturn();
		/*
		 정의: int method1()
		 */
		int recvData1 = mmr.method1();
		System.out.println("main block-->recvData1:"+recvData1);
		boolean recvData2=mmr.isMarried();
		System.out.println("main block-->recvData2:"+recvData2);
		/*
		 정의: int add(int a,int b)
		 */
		int addResult = mmr.add(12, 34);
		System.out.println("main block-->addResult:"+addResult);
		addResult = mmr.add(3333, 756756);
		System.out.println("main block-->addResult:"+addResult);
		addResult = mmr.add(3423, 4343423);
		
		System.out.println("---------------멤버필드접근(getter,setter)-----------------");
		System.out.println("main-->mmr member1,member1-->"+mmr.member1+","+mmr.member2);
		mmr.setMember1(789);
		mmr.setMember2(247823784);
		System.out.println("main-->mmr member1,member1-->"+mmr.member1+","+mmr.member2);
		int recvmember1=mmr.getMember1();
		System.out.println("main-->recvMember1:"+recvmember1);
		int recvmember2=mmr.getMember2();
		System.out.println("main-->recvMember2:"+recvmember2);
		boolean b=true;
		if(b) {
			return;
		}
		
		int recvAddMembers = mmr.addMembers();
		System.out.println("main-->recvAddMembers:"+recvAddMembers);
	}

}
