/*
 * static 제한자(제어자,modifier)
 *   1.멤버필드(변수)나,멤버메쏘드 앞에 부칠수있다.
 * 	 2.static 제한자가 붙어있는 멤버필드(변수)나 멤버메쏘드는
 *     객체생성 없이도 사용이가능하다.
 *   3.클래스(틀)가 가지고있는 멤버변수나 멤버메쏘드이다.
 *     -->클래스변수,클래스메쏘드라고도한다.
 *   4.클래스로부터 생성되는 객체들이 공유하는 필드(변수),메쏘드 이다.      
 *     -->공용필드(공용메쏘드)라고도한다.
 *     
 *  -형식: 
 *  	멤버변수: public static int i;
 * 		멤버메쏘드:public static void print(){}
 * 
 * - 변수
 *  1.지역변수       : 메쏘드의 블록안에 선언된변수(매개변수)
 *  2.멤버필드(변수) : 클래스의 블록안에 선언된변수
 * 			2-1. 객체 필드(변수):인스턴스 생성되어야 사용할수있는 필드
 *          2-2. 정적 필드(변수):인스턴스 생성과 관계없이 사용가능한 필드
 *                               클래스로딩시 클래스에 생성되는 필드(변수)
 *                               
 * - 메쏘드
 *  1.멤버메쏘드
 *          1-1.객체 메쏘드:인스턴스 생성되어야 호출가능한메쏘드
 *          1-2.정적 메쏘드:인스턴스 생성과 관계없이 호출가능한 메쏘드
 *                          클래스로딩시 클래스에 생성되는 메쏘드                              
 */
class Static{
	public int instance_field=100;
	public static int static_field=200;
	
	public void instance_method() {
		System.out.println("난 인스턴스(객체)메쏘드에서 instance field:"+this.instance_field);
		System.out.println("난 인스턴스(객체)메쏘드에서 static field  :"+Static.static_field);
	}
	public static void static_method() {
		/*
		 * this 사용불가능
		 * << Cannot use this in a static context >>
		 */
		System.out.println("난 정적(static)메쏘드 instance field: 접근불가능(this 사용불가능)");
		System.out.println("난 정적(static)메쏘드 static field: "+Static.static_field);
	}
}

public class StaticMain {

	public static void main(String[] args) {
		
		System.out.println("-------static member--------------");
		/*
		 * 정적멤버접근
		 *   클래스이름.정적멤버이름
		 */
		System.out.println("1.Static.static_field:"+Static.static_field);
		Static.static_field=88888;
		System.out.println("2.Static.static_field:"+Static.static_field);
		Static.static_method();
		
		
		System.out.println("-------instance member--------------");
		/*
		 * 인스턴스멤버접근
		 *    참조변수.멤버이름
		 */
		Static st1=new Static();
		st1.instance_field=1;
		System.out.println(st1+"-->st1.instance_field:"+st1.instance_field);
		st1.instance_method();
		
		Static st2=new Static();
		st2.instance_field=2;
		System.out.println(st2+"-->st2.instance_field:"+st2.instance_field);
		st2.instance_method();
		
		System.out.println("-----------------모두 같은정적필드에 접근----------------------");
		System.out.println("3.Static.static_field:"+Static.static_field);
		//The static field Static.static_field should be accessed in a static way
		System.out.println("4.st1.static_field:"+st1.static_field);
		System.out.println("5.st2.static_field:"+st2.static_field);
		System.out.println("-----------------모두 같은정적메쏘드에 접근----------------------");
		Static.static_method();
		st1.static_method();
		st2.static_method();
		
			
		
		
	}

}





