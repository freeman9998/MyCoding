class Member{
	private int no;
	private String name;
	public Member() {
	}
	/*
	 * alt + shift + s(source)
	 *   생성자				: o
	 *   getter,setter		: r
	 *   toString 메쏘드정의: s	
	 */
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println(this+"-->"+no+","+name);
	}
	public void method(int a) {
		int tot;
		/*
		 The local variable tot may not have been initialized
		 tot=tot+7;
		 */
		
		/*
		 * 매개변수 a는 호출시 선언과 초기화가 이루어진다.
		 */
		int b = a + 4;
		
		
	}
}

public class LocalVariableInitializationMain {

	public static void main(String[] args) {
		/*
		 * 지역변수(Local Variable)
		 *   - 메쏘드 블록안에 선언된변수(매개변수)
		 * 멤버필드(변수)
		 *   - 클래스 블록안에 선언된변수(객체멤버생성된변수) 
		 */
		
		
		int a=9;
		int b=10;
		/*
		 * swap
		 */
		int t = a;
		a = b;
		b = t;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int tot;
		/*
		<< The local variable tot may not have been initialized >>
		tot=tot+1;
		if(tot>0) {
			
		}	
		*/
		/*
		<< The local variable tot may not have been initialized >>
		boolean condition=true;
		if(condition) {
			tot=0;
		}
		tot=tot+1;
		if(tot > 0) {
			
		}
		*/
		int a1=a;
		int b1=b;
		
		Member m1 = new Member(1, "김경미");
		Member m2 = m1;
		System.out.println(m1);
		System.out.println(m2);
		m1.print();
		m2.print();
		
		
		Member m3=new Member(3,"삼번");
		Member m4=new Member(4,"사번");
		System.out.println("-----주소값교환전-----");
		m3.print();
		m4.print();
		Member tm = m3;
		m3=m4;
		m4=tm;
		System.out.println("-----주소값교환후-----");
		m3.print();
		m4.print();
		System.out.println("--------------null-----------------");
		/*
		 * null : 객체주소리터럴(값)
		 *        - 주소없다라는 의미의 값
		 *        - 객체주소값 초기화의 용도로 사용 
		 */
		Member m5;
		m5 = null;
		
		//null주소사용시 NullPointerException발생
		if(m5==null) {
			m5=new Member(5, "오오오");
			m5.print();
		}else {
			m5.print();
		}
		/*
		 * 객체주소값 비교
		 */
		Member m6=new Member(6, "육육육");
		Member m7=m6;
		if(m6==m7) {
			System.out.println("m6과 m7은 주소값이동일하다.<<"+m6+" == "+m7+">>");
		}else {
			System.out.println("m6과 m7은 주소값이동일하지않다.");
		}
		if(m6!=m1) {
			System.out.println("m6과 m1은 주소값이동일하지않다.<<"+m6+" != "+m1+">>");
		}
		System.out.println("-------매개변수호출--------");
		m6.method(12);

	}

}








