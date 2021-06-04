package com.itwill03.포함;

public class Dvd {
		private int no;//번호
		private String title;//타이틀
		private String ganre;//쟝르
		
		public Dvd() {}
		
		public Dvd(int no, String title, String ganre) {
			this.no = no;
			this.title = title;
			this.ganre = ganre;
		}
		public void print() {
			System.out.println("빌린 책");
			System.out.println("번호         타이틀        장르");
			System.out.printf("%3d %11s %5s%n", no, title, ganre);
		}
		
		
}
