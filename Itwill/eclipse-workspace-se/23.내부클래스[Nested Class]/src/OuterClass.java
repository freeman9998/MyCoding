
public class OuterClass {
	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field;
	/*
	 * 인스턴스 멤버메쏘드
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.out_member_method()");
	}
	/********** 외부클래스에서내부클래스의사용 ********/
	public void outer_inner_class_use() {
		/*
		 * 1.InnerClass객체생성
		 */
		//OuterClass.InnerClass innerObject=this.new InnerClass();
		InnerClass innerObject=new InnerClass();
		/*
		 * 2.InnerClass객체멤버사용
		 */
		innerObject.inner_member_field=4535;
		innerObject.inner_member_method();
	}
	/*
	 * Nested class,Inner class[인스턴스 멤버클래스]
	 */
	/***************inner class******************/
	public class InnerClass{
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/*
		 InnerClass의 사용이유
		    - 내부클래스(객체)에서 외부클래스(객체)의
		      멤버변수,메쏘드 접근을 손쉽게하기위해서
		 */
		public void inner_outer_access() {
			outer_member_field=3423423;
			outer_member_method();
		}
		
	}
	/********************************************/
	
}













