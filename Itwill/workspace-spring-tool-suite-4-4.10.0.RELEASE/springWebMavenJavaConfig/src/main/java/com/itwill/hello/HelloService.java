package com.itwill.hello;

public class HelloService {
	private HelloDao helloDao;
	
	public HelloService() {
		System.out.println("1. ### HelloService()생성자");
	}
	public HelloDao getHelloDao() {
		return helloDao;
	}
	public void setHelloDao(HelloDao helloDao) {
		System.out.println("2. ### HelloService.setHelloDao("+helloDao+") 메쏘드호출");
		this.helloDao = helloDao;
	}
	public Hello hello() {
		System.out.println("B.### HelloService.hello() 메쏘드 호출");
		return helloDao.hello();
		
	}
	
}
