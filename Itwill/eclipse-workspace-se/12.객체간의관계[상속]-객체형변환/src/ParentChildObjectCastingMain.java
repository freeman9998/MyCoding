

/*
 참조변수의 형변환(type casting)
   1. 부모자식관계에있는 클래스들에서만 가능하다.
   2. 자식객체를 부모클래스타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
   3. 부모 객체를 자식클래스타입으로 형변환
       - 원칙적으로는 불가능하다
       - 자동으로 이루어지지않는다.(명시적)
       - 부모의 탈을쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */

class Parent {
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
	public void method4() {
		System.out.println("Parent.method4()");
	}
	public void method5() {
		System.out.println("Parent.method5()");
	}
	
}
class Child extends Parent{
	public void method5() {
		System.out.println("Child.method5()[Parent.method5()를 Child에서재정의 ]");
	}
	public void method6() {
		System.out.println("Child.method6()");
	}
}

public class ParentChildObjectCastingMain {

	public static void main(String[] args) {
		System.out.println("--------------Child----------------");
		Child c1=new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		c1.method6();
		System.out.println("--------------Child-->Parent-------------");
		/*
		2. 자식객체를 부모클래스타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
		 */
		Parent p1 = c1;
		p1.method1();
		p1.method2();
		p1.method3();
		p1.method4();
		p1.method5();
		//p1.method6();
		
		System.out.println("--------------Parent-->Child-------------");
		/*
	    3. 부모 객체를 자식클래스타입으로 형변환
       	  - 원칙적으로는 불가능하다
       	  - 자동으로 이루어지지않는다.(명시적)
       		Parent p=new Parent();
       		Child cccc = p;(X)
		 */
		 Parent p2=new Parent();
		 /*
		 << compile error >>
		 Type mismatch: cannot convert from Parent to Child
		 Child c2 = p2;
		 */
		 
		 /*
		 명시적형변환시 Compile은 가능 
		 실행시 ClassCastException 발생: Parent cannot be cast to Child
		 
		*/
		 Child c2=(Child)p2;
		 /*
		  - 부모의 탈을쓴 자식객체 는 가능하다.(명시적형변환)
		    Parent p=new Child()
		    Child c=(Child)p;
		 */
		 
		 Parent p3=new Child();
		 /*
		 명시적형변환이 가능 실행시 ClassCastException 발생하지않는다.
		 */
		 Child c3 = (Child)p3;
		 c3.method1();
		 c3.method2();
		 c3.method3();
		 c3.method4();
		 c3.method5();
		 c3.method6();
		 
		  
		
	}

}



















