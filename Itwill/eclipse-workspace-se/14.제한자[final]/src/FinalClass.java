
public class FinalClass {
	public void method1() {
		System.out.println("FinalClass.method1()");
	}
	public final void method2() {
		System.out.println("FinalClass.method2() 난 final메쏘드 재정의금지");
	}
}

class FinalClassChild extends FinalClass{
	@Override
	public void method1() {
		System.out.println("FinalClassChild에서 FinalClass.method1()재정의");
	}
	/*
	<< Cannot override the final method from FinalClass>>
	public void method2() {
		
	}
	*/
}
