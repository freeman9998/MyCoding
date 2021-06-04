package com.itwill03.포함;

public class DvdMember {
	// 회원번호
	private int no;

	// 회원이름
	private String name;

	// 전화번호
	private String tel;

	// 빌린dvd
	private Dvd rentDvd;

	// 대출제한여부
	private boolean rentLimit;

	public DvdMember() {

	}

	public DvdMember(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		rentLimit = true;

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

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}

	public boolean isRentLimit() {
		return rentLimit;
	}

	public void setRentLimit(boolean rentLimit) {
		this.rentLimit = rentLimit;
	}

	public void rentDvd(Dvd d) {
		if (rentLimit) {
			if (d.isRentAvailable()) {
				rentDvd = d;
				rentLimit = false;
				d.setRentAvailable(false);

			} else {
				System.out.println(d.getTitle() + "는 이미 대여된 DVD입니다.");

			}
		} else {
			System.out.println("대여는 1권까지만 가능합니다.");

		}

	}

	public void returnDvd(Dvd d) {
		if (rentLimit) {
			System.out.println("DVD를 대여한 적이 없습니다.");

		} else {
			rentDvd = null;
			rentLimit = true;
			d.setRentAvailable(true);

		}
	}

	public void printMember() {
		System.out.println();
		System.out.println("-----------회원정보-----------");
		System.out.printf("%s    %s    %s\n", "회원번호", "이름", "전화번호");
		System.out.println("------------------------------");
		System.out.printf("%5d %9s %13s\n", no, name, tel);
		System.out.println("---------대여DVD정보----------");
		System.out.printf("  %s      %s      %s\n", "번호", "타이틀", "장르");
		System.out.println("------------------------------");
		if (rentDvd == null) {
			System.out.println("        대여기록없음");
		} else {
			rentDvd.printDvd();

		}

	}

}
