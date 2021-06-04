package com.itwill.hello;

public class HelloDao {
	public HelloDao() {
		System.out.println("0. ### HelloDao()생성자");
	}
	public Hello hello() {
		System.out.println("C.### HelloDao.hello() 메쏘드 호출");
		return new Hello("안녕Spring MVC");
	}
}
