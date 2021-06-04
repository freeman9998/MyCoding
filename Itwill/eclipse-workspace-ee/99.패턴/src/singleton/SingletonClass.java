package singleton;
/*
싱글턴 패턴(Singleton pattern)을 따르는 클래스는, 
생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고
최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.
 이와 같은 디자인 유형을 싱글턴 패턴이라고 한다.
 */
/*
인스턴스를 1개만 만들 수 있는 패턴
어떤 클래스의 인스턴스를 하나만 만들 수 있는 패턴
*/
public class SingletonClass {
	private static SingletonClass _instance=null;
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		if(_instance==null) {
			_instance=new SingletonClass();
		}
		return _instance;
	}
	
	
}
