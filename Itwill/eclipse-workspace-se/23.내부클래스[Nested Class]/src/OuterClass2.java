
public class OuterClass2 {
	public static void main(String[] args) {
		OuterClass2 oc2=new OuterClass2();
		System.out.println("-----member inner class---");
		oc2.outer_member_method1();
		System.out.println("-----anonymous local inner class---");
		oc2.outer_member_method2();
	}
	public int outer_member_field;
	public void outer_member_method2() {
		/*
		 * 익명 로칼 내부클래스(anonymous local inner class)
		 */
		 AClass aChild=new AClass() {
			 @Override
				public void print() {
					System.out.println("AClass를 상속받는 익명클래스 에서 AClass.print()메쏘드 재정의");
				}
		 };
		 aChild.print();
		 BClass bChild=new BClass(){
			 @Override
				public void method1() {
					System.out.println("abstract BClass를 상속받는 익명클래스 에서 BClass.method1()메쏘드 재정의[구현]");
				}
			 	/*
			    public void xxx() {
			    	
			    }
			    */
		 };
		 System.out.println(bChild);
		 bChild.method1();
		 //bChild.xxx();
		 
		 CInterface cChild=new CInterface() {
			 @Override
				public void method_one() {
					System.out.println("CInterface를 implement하는 익명클래스에서 CInterface.method_one()재정의[구현]");
				}
				@Override
				public void method_two() {
					System.out.println("CInterface를 implement하는 익명클래스에서 CInterface.method_two()재정의[구현]");
				}
			 
		 };
		 cChild.method_one();
		 cChild.method_two();
		 
		 Object oChild=new Object() {
			 @Override
			public String toString() {
				return "Object를 상속받는익명클래스에서 재정의된 toString()";
			}
		 };
		 System.out.println(oChild.toString());
		 
		 
		
	}
	public void outer_member_method1() {
		/*
		 * 특정클래스를 상속받아서 메쏘드를 재정의한 
		 * Inner클래스의 객체생성& 재정의된메쏘드 호출 
		 */
		AClassChild aChild=new AClassChild();
		aChild.print();
		BClassChild bChild=new BClassChild();
		bChild.method1();
		CInterfaceImpl cChild=new CInterfaceImpl();
		cChild.method_one();
		cChild.method_two();
	}
	/***************member inner class*****************/
	/*
	 * 특정클래스를 상속받아서 메쏘드를 재정의한 Inner 클래스
	 */
	public class AClassChild extends AClass{
		@Override
		public void print() {
			System.out.println("AClassChild에서 AClass.print()메쏘드 재정의");
		}
		
	}
	public class BClassChild extends BClass{
		@Override
		public void method1() {
			System.out.println("BClassChild에서 BClass.method1()메쏘드 재정의[구현]");
		}
	}
	public class CInterfaceImpl implements CInterface{
		@Override
		public void method_one() {
			System.out.println("CInterfaceImpl에서 CInterface.method_one()재정의[구현]");
		}
		@Override
		public void method_two() {
			System.out.println("CInterfaceImpl에서 CInterface.method_two()재정의[구현]");
		}
		
	}
	/***********************************************************/
	
}
