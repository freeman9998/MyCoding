package nogeneric;

class GenericNoClass {
	private Object member;

	public Object getMember() {
		return member;
	}

	public void setMember(Object member) {
		this.member = member;
	}
}

class GenericClass<T> {
	private T member;

	public T getMember() {
		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}
}
class GenericClassTwo<K,V>{
	private K member1;
	private V member2;
	
	public K getMember1() {
		return member1;
	}
	public void setMember1(K member1) {
		this.member1 = member1;
	}
	public V getMember2() {
		return member2;
	}
	public void setMember2(V member2) {
		this.member2 = member2;
	}
	
}

public class GenericMain {
	public static void main(String[] args) {
		System.out.println("-------no generic-----------");
		GenericNoClass genericNoClass=new GenericNoClass();
		genericNoClass.setMember(new Account(1, "KIM", 89000, 0.3));
		Account getAccount=(Account)genericNoClass.getMember();
		getAccount.print();
		System.out.println("-------generic-----------");
		GenericClass<Account> genericClass=new GenericClass<Account>();
		genericClass.setMember(new Account(2, "KANG", 99000, 0.01));
		getAccount=genericClass.getMember();
		getAccount.print();
		
		System.out.println("-------generic타입파라메타대입안한경우-----------");
		GenericClass genericClass2=new GenericClass();
		genericClass2.setMember(new Account(2, "KANG", 99000, 0.01));
		getAccount=(Account)genericClass2.getMember();
		getAccount.print();
		System.out.println("-------parameter 2개-----------");
		GenericClassTwo<Account,Car> genericClassTwo=new GenericClassTwo<Account,Car>();
		genericClassTwo.setMember1(new Account(3, "SAM", 33333, 0.333));
		genericClassTwo.setMember2(new Car("1111", 12, 16, 50000));
		Account acc=genericClassTwo.getMember1();
		Car car=genericClassTwo.getMember2();
		acc.print();
		car.print();
		
		
	}

}






