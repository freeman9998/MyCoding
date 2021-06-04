package com.itwill02.constructor;

//회원번호
//회원이름
//전화번호
//빌린dvd
public class DvdMember {
	private int id;
	private String name, tel;
	private Dvd dvd;

	public DvdMember() {
	}

	public DvdMember(int id, String name, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
	}

	public void headprint() {
		System.out.println("--------------출력정보----------------");
		System.out.println("회원이름 회원이름 전화번호 번호 타이틀 장르");
		System.out.println("--------------출력정보----------------");
	}

	public void print() {
		System.out.printf("%d %4s %5s", this.id, this.name, this.tel);
		this.dvd.print();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

}
