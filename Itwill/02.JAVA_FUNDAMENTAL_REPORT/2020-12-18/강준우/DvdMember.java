package com.itwill03.포함;

public class DvdMember {
		private int no;//회원번호
		private String name;//회원이름
		private int callnum;//전화번호
		private Dvd dvd;//빌린dvd
		
		public DvdMember() {}
		
		public DvdMember(int no, String name, int callnum, Dvd dvd) {
			this.no = no;
			this.name = name;
			this.callnum = callnum;
			this.dvd = dvd;
		}
		
		public void setData(int no, String name, int callnum, Dvd dvd) {
			this.no = no;
			this.name = name;
			this.callnum = callnum;
			this.dvd = dvd;
		}
		public void print() {
			System.out.println("회원정보");
			System.out.println("번호   이름   전화번호");
			System.out.printf("%3d %5s %3d%n", no, name, callnum);
			dvd.print();
		}
}
