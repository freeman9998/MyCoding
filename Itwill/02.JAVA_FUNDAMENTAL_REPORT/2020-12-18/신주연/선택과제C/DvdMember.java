package com.itwill04.array;

public class DvdMember {
	private int no;// 회원번호
	private String name;// 회원이름
	private String tel;// 전화번호
	private Dvd[] dvds;// 빌린dvd들[최대3개]

	public DvdMember() {

	}

	public void setDvd(Dvd[] dvds) {
		this.dvds = dvds;
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

	public static void headerPrint() {
		System.out.println("----------------------------------------");
		System.out.println("회원번호 이름 핸드폰 DVD번호 타이틀 쟝르");
		System.out.println("----------------------------------------");
	}

	public void print() {
		System.out.print(no + "\t" + name + "\t" + tel + " ");
		for (int i = 0; i < dvds.length; i++) {
			if (dvds.length < 4) {
				dvds[i].print();
			} else {
				for (int j = 0; j < 3; j++) {
					dvds[j].print();
				}
				System.out.println("DVD대여는 최대 3개까지 가능합니다.");
				break;
			}
		}

	}
}
