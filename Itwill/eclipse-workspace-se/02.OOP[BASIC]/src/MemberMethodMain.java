class MemberMethod {
	//멤버필드(인스턴스변수)
	int member1;
	
	
	//멤버메쏘드(인스턴스메쏘드)
	void method1() {
		System.out.println("void method1()실행");
		/*
		 * - 모든 메쏘드의 마지막에는 항상 실행흐름을
		 *   호출한곳(클래스,객체)으로 반환하여야한다.
		 * - return문을 만나면 호출한곳으로 반환된다.
		 * - return type이 void인경우에는 생략이 가능하다.
		 * - return문이 생략된경우에는 자동return된다.
		 */
		return;
	}
	void method2(int count) {
		int localVar=11111;
		System.out.println("void method2(int count)실행 파라메타count값-->"+count);
		System.out.println("method2 블록안에서 선언된변수-->"+localVar);
		return;
	}
	void method3(String msg,int count) {
		System.out.println("void method3(String msg,int count)실행");
		for (int i = 0; i < count; i++) {
			System.out.println(msg+"["+i+"]");
		}
		return;
	}
	void method4(String name,String msg,int count) {
		System.out.println("void method4(String name,String msg,int count)");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s 님 %s%n",name,msg);
		}
		return;
	}
	void print() {
		System.out.println("void print():  this.member1-->"+this.member1);
	}
}

public class MemberMethodMain {

	public static void main(String[] args) {
		MemberMethod mm =new MemberMethod();
		mm.member1=2147483647;
		/*
		 * 멤버메쏘드실행(호출)
		 *  - 형식:참조변수.메쏘드이름()
		 *  - mm객체의 method1메쏘드 블록을 실행하기위해
		 *    main실행흐름을 method1블록으로 보낸다
		 */
		//정의: void method1() 
		mm.method1();
		//정의: void method2(int count)
		mm.method2(45);
		//정의: void method3(String msg,int count)
		mm.method3("김경호는 못생겼다", 1);
		mm.method3("김경호는 잘생겼다", 2);
		mm.method3("김경호는 강사다.", 3);
		mm.method3("안물,안궁~~~", 4);
		//정의: void method4(String name,String msg,int count)
		mm.method4("김경호", "너무 멋지세요!!!", 2);
		mm.method4("이효리", " 님 뭐하세요!!!", 7);
		System.out.println("---------print------------");
		mm.print();
		
		return;
	}

}







