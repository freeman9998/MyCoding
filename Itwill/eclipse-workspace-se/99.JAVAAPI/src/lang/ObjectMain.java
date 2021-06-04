package lang;

import java.util.Date;

class Member extends Object{
	private int no;
	private String name;
	public Member(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	/*
	public String toString() {
		return "클래스이름@객체주소";
	}
	*/
	@Override
	public String toString() {
		return no+"\t"+name;
	}
}


public class ObjectMain {
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		Object o3=o1;
		System.out.println("----------------toString()-----------------");
		/*
		 <<Object>>
		 public String toString()
		   - 자기자신을 대표하는 문자열을 반환("클래스이름@객체주소")
		 */
		String str1=o1.toString();
		System.out.println(str1);
		System.out.println(o2.toString());
		System.out.println(o3.toString());
		System.out.println("--------------");
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println("--- Member(Object child)에서 toString()재정의--------");
		Member m1=new Member(1, "김경호");
		String str2=m1.toString();
		System.out.println(str2);
		Member m2=new Member(2, "김경수");
		System.out.println(m2);
		System.out.println("--- Date클래스에서 toString()재정의--------------------");
		Date today=new Date();
		String dateStr=today.toString();
		
		System.out.println(dateStr);
		System.out.println("----------------equals()-----------------");
		/*
		public boolean equals(Object obj)
		   - 주소가같은지 비교
		 */
		if(o1.equals(o2)) {
			System.out.println("o1과 o2의 주소가 같다");
		}else {
			System.out.println("o1과 o2의 주소가 다르다");
		}
		if(o1.equals(o3)) {
			System.out.println("o1과 o3의 주소는 동일하다.");
		}
		System.out.println("------------비교연산자[==,!=]-------------");
		if(o1==o3) {
			System.out.println("o1과 o3의 주소는 동일하다.");
		}
		if(o1!=o2) {
			System.out.println("o1과 o2의 주소가 다르다");
		}
		
		
		
	}
}
