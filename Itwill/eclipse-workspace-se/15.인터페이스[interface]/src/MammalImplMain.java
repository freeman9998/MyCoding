interface Animal{
	public void method1();
	public void method2();
}

interface Mammal extends Animal{
	public void method3();
}

class MammalImpl implements Mammal{
	public void method1() {
		System.out.println("Animal-->Mammal.method1()재정의[구현]");
	}
	public void method2() {
		System.out.println("Animal-->Mammal.method2()재정의[구현]");
	}
	public void method3() {
		System.out.println("Mammal.method3()재정의[구현]");
	}
	public void method4() {
		System.out.println("MammalImpl.method4()");
	}
}


public class MammalImplMain {

	public static void main(String[] args) {
		MammalImpl maImpl=new MammalImpl();
		System.out.println("-------------MammalImpl---------------");
		maImpl.method1();
		maImpl.method2();
		maImpl.method3();
		maImpl.method4();
		System.out.println("-------------Mammal---------------");
		Mammal ma=maImpl;
		ma.method1();
		ma.method2();
		ma.method3();
		//ma.method4();
		
		System.out.println("-------------Animal---------------");
		Animal ani = maImpl;
		ani.method1();
		ani.method2();
		
		
		

	}

}
