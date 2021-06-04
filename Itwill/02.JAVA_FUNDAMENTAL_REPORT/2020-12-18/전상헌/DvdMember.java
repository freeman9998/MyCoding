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
		if(dvds.length>3) {
			//빌린dvd를검수하는 과정에서 3개가 초과될시 너무 많이 빌렸다 하면서 초기화
			System.out.println("너무많이 빌리셨어요");
			return;
		}
		this.dvds = dvds;
	}


	public void print() {
		System.out.println(no+"\t"+name+"\t"+tel+"\t");
		for (int i = 0; i < dvds.length; i++) {
			dvds[i].print();
		}
	}
}