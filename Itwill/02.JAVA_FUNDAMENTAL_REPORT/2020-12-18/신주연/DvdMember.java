package com.itwill03.포함;

public class DvdMember {
	// 회원번호
	// 회원이름
	// 전화번호
	// 빌린dvd
	private int no;
	private String name;
	private String hp;
	private Dvd dvd;

	public DvdMember(int no, String name, String hp) {
		this.no = no;
		this.name = name;
		this.hp = hp;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

	public void headerPrint() {
		System.out.println("----------------------------------------");
		System.out.println("회원번호 이름 핸드폰 DVD번호 타이틀 쟝르");
		System.out.println("----------------------------------------");
	}

	public void print() {
		System.out.print(this.no + " " + this.name + " " + this.hp + " ");
		this.dvd.print();
		System.out.println();
	}
	
	//getter,setter
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

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public Dvd getDvd() {
		return dvd;
	}
	

}
