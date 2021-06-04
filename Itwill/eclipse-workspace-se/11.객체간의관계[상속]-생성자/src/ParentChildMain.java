class Parent extends Object{
	private int member1;
	private int member2;
	public Parent() {
		/*
		 * - 클래스의 생성자첫번째라인에서는
		 *   부모클래스의 생성자가 반드시호출되어야한다.
		 * - 생략시 부모의 디폴트생성자 자동호출된다.
		 */
		super();
		System.out.println("2.Parent() 디폴트생성자");
	}
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("2.Parent(int member1, int member2) 생성자 호출");
	}


	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method1()");
	}
}
class Child extends Parent{
	public int member3;
	public Child() {
		/*
		 * - 클래스의 생성자첫번째라인에서는
		 *   부모클래스의 생성자가 반드시호출되어야한다.
		 * - 생략시 부모의 디폴트생성자 자동호출된다.
		 */
		super();
		System.out.println("3.Child() 디폴트생성자");
	}
	public Child(int member1,int member2,int member3) {
		/*
		 * - 매개변수를 가지고있는 생성자를 호출할수있다.
		 * - 매개변수를 가지고있는 생성자는 명시적으로 호출코드를 기술하여야한다.
		 */
		super(member1,member2);
		/*
		The field Parent.member1 is not visible
		this.member1=member1;
		this.member2=member1;
		*/
		this.member3 = member3;
		System.out.println("3.Child(int member1,int member2,int member3) 생성자 호출");
		
	}


	public void method3() {
		System.out.println("Child.method3()");
	}
}
public class ParentChildMain {
	public static void main(String[] args) {
		System.out.println("----------------");
		Child c1=new Child();
		System.out.println("----------------");
		Child c2=new Child(1, 2, 3);
		
	}
}














