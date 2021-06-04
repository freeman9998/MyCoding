package com.itwill4.array;

public class Dvdmember {
	private int no;
	private String name;
	private String tel;
	private Dvd[] dvds;

	public Dvdmember() {

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

	public void headprint() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("%s %4s %9s %16s %10s %10s%n", "번호", "이름", "전화번호", "dvd번호", "dvd이름", "dvd장르");
		System.out.println("-------------------------------------------------------------------------");
	}

	public void print() {
		for (int i = 0; i < dvds.length; i++) {
			System.out.print(no + "\t" + name + "\t" + tel + "\t");
			dvds[i].print();
		}
	}

}
