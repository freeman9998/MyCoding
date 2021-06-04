package com.itwill04.array;


public class DvdMember {
	private int no;//회원번호
	private String name;//회원이름
	private String tel;//전화번호
	private Dvd[] dvds;//빌린dvd들[최대3개]
	public DvdMember() {
		
	}
	public DvdMember(int no, String name, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Dvd[] getDvds() {
		return dvds;
	}
	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}
	public static void headerPrint() {
		System.out.printf("-------------------------------대여정보출력-------------------------------------------------------------------%n");
		System.out.printf("%s %s %6s %10s %9s %9s  %n",
				"회원번호","회원이름","전화번호","Dvd번호","Dvd제목","분류");
		System.out.printf("--------------------------------------------------------------------------------------------------------------%n");
	}
	public void print() {
		for (int i = 0; i < dvds.length; i++) {
			System.out.printf("%5d %7s %14s",no,name,tel);
			this.dvds[i].print();
		}
	}
}