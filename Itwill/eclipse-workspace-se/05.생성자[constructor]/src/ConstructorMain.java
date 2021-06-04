
public class ConstructorMain {

	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		/*
		 << new Constructor() >>
		   1. 객체생성
		   2. 생성자호출
		   3. 객체의 주소반환
		 */
		System.out.println("c1 객체주소1-->"+c1);
		c1.print();
		
		Constructor c2= new Constructor();
		System.out.println("c2 객체주소2-->"+c2);
		c2.print();
		Constructor c3=new Constructor(2323);
		c3.print();
		Constructor c4=new Constructor(777777, 888888);
		c4.print();
		c4.setConstructorData(32423423, 565465);
		c4.print();
		
		Constructor c5=new Constructor();
		c5.setConstructorData(9090, 3030);
		c5.print();
		c5.setConstructorData(1111111,222);
		System.out.println("-----------------기본생성자-------------------");
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println(dc);
		
		
	}

}
