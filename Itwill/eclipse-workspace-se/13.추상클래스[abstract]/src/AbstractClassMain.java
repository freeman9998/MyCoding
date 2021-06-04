/*
추상클래스
  1.정의: 하나이상의 추상메소드가 정의되어있는 클래스
          클래스의객체생성을 허용하지않을때 사용
     ex> public abstract class Test{
         	//추상메쏘드();
         	public abstract int print(int i);
         	//일반메쏘드();
         	public void test(){
         	}
         }
         ==>추상메쏘드: 메쏘드의 구현부분이 없고 원형(signature)만 존재하는 메쏘드
            ex> public abstract int print(int i);             
  2. 추상클래스는 불완전한 추상메쏘드를 가지므로 객체생성
      이 불가능하다.
      Test t=new Test();(X)
  3. 추상클래스는 추상클래스를 상속받아서 추상메쏘드를 
     구현(오버라이딩)하는 자식 클래스를 만들어 
     사용(객체생성)해야한다 
*/
abstract class AbstractClass{
	public void method1() {
		System.out.println("난 구상(concrete)메쏘드");
	}
	public abstract void method2();
}
class AbstractClassChild extends AbstractClass{

	@Override
	public void method2() {
		System.out.println("AbstractClass 추상메쏘드 method2()를 재정의(구현)");
	}
	
}

public class AbstractClassMain {
	public static void main(String[] args) {
		/*
		Cannot instantiate the type AbstractClass
		AbstractClass  ac1=new AbstractClass();
		*/
		AbstractClassChild acc1=new AbstractClassChild();
		acc1.method1();
		acc1.method2();
		
		AbstractClass ac2=new AbstractClassChild();
		ac2.method1();
		ac2.method2();
	}
}













