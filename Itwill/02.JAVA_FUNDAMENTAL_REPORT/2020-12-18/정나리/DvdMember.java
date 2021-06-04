package com.itwill04.array;

public class DvdMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린dvd
	
	private int num;
	private String name;
	private String cellNum;
	private Dvd[] dvds;
	
	public DvdMember() { //기본 생성자
	}

	public DvdMember(int num, String name, String cellNum) { //인자 4개짜리 생성자
		
		this.num = num;
		this.name = name;
		this.cellNum = cellNum;
	}
	
	
	public static void headPrint() {
		System.out.println("=======================================================================");
		System.out.println("회원번호   회원이름     전화번호    번호        제목        장르");
		System.out.println("=======================================================================");
	}
	
	public void print() {
		for(int i =0 ; i < dvds.length; i++) {	
			System.out.printf("%4d %10s %15s", this.num, this.name, this.cellNum);
			dvds[i].dvdInfoPrint();
		}
	}

	
	//getset 메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellNum() {
		return cellNum;
	}

	public void setCellNum(String cellNum) {
		this.cellNum = cellNum;
	}

	public Dvd[] getDvds() {
		return dvds;
	}

	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}
	
	
	
}