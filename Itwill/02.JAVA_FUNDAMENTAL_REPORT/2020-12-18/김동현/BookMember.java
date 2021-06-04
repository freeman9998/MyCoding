package com.itwill00.variable.김동현;

public class BookMember {

		private int no;
		private String number;
		private String name,book;
		
		

		public BookMember() {}
	
		public BookMember(int no, String name, String book, String number) {
			this.no = no;
			this.name = name;
			this.book = book;
			this.number = number;
		}

		
		public void setMemberData(int no, String name, String book, String number) {
			this.no = no;
			this.name = name;
			this.book = book;
			this.number = number;
		}
		
		
		public void headerPrint() {
			System.out.printf("-------사서 출력---------------------%n");
			System.out.printf("회원번호   이름           책              휴대폰번호%n");
			System.out.printf("-----------------------------------%n");

		}

		public void print() {
			System.out.println("  "+this.no+"     "+ this.name+"  "+this.book+ "     "+this.number);
		}

	}