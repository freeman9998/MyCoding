package com.itwill.io;

public class IO1 {
	/*
	 * 사용자들이상속받아사용할수있는 멤버
	 */
	protected int protected_member_field;
	protected void protected_method() {
		System.out.println("IO1.protected_method()");
	}
	/*
	 * 사용자들이 접근할수없는멤버
	 * 같은패키지에있는 다른클래스들만 사용가능
	 */
	int default_member_field;
	void default_method() {
		System.out.println("IO1.default_method()");
	}
}
