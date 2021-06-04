package com.itwill03.포함;

public class SelectBMain {

	public static void main(String[] args) {
		SelectB B = new SelectB();
		B.setX(4);
		B.setY("홍길동");
		
		System.out.println("x ="+B.getX());
		System.out.println("y ="+B.getY());
		B.m1();
		B.m2();
	}

}
