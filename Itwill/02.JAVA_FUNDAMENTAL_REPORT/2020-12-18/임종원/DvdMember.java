package com.itwill03.B;

public class DvdMember {
	/*
	 * 회원번호
	 * 회원이름
	 * 성별
	 * 나이
	 * 주소
	 * 이메일
	 */
	private int dvdMemberNum;
	private String dvdMemberName;
	private String dvdMemberGendere;
	private	int age;
	private String address;
	private String email;
	private Dvd dvd;
	
	public DvdMember() {
		
	}

	public DvdMember(int dvdMemberNum, String dvdMemberName, String dvdMemberGendere, int age, String address,String email,Dvd dvd) {
		this.dvdMemberNum = dvdMemberNum;
		this.dvdMemberName = dvdMemberName;
		this.dvdMemberGendere = dvdMemberGendere;
		this.age = age;
		this.address = address;
		this.email = email;
		this.dvd = dvd;
	}
	
	public void haedPrint() {
		System.out.printf("---------------------------------------------DVD 정보출력------------------------------------------------------------%n");
		System.out.printf("%s %5s %5s %8s %10s %12s %15s %8s %12s%n", "회원번호","회원이름","성별","나이","주소","이메일","DVD번호","타이틀","장르" );
		System.out.printf("---------------------------------------------------------------------------------------------------------------------%n");
	}
	
	public void print() {
		System.out.printf("%3d %10s %6s %9d %11s %20s",this.dvdMemberNum,this.dvdMemberName,this.dvdMemberGendere,this.age,this.address,this.email);
		this.dvd.print();
	}
	
	//stter
	public void setDvdMemberNum(int dvdMemberNum) {
		this.dvdMemberNum = dvdMemberNum;
	}

	public void setDvdMemberName(String dvdMemberName) {
		this.dvdMemberName = dvdMemberName;
	}

	public void setDvdMemberGendere(String dvdMemberGendere) {
		this.dvdMemberGendere = dvdMemberGendere;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

}
