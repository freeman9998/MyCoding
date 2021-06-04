package com.itwill03.포함;

public class DvdMember {
	// 회원번호
	private int no;

	// 회원이름
	private String name;

	// 전화번호
	private String phoneNumber;

	// 빌린dvd
	private Dvd[] dvds;

	// 대여제한여부
	private int rentLimit;

	public DvdMember() {

	}

	public DvdMember(int no, String name, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		dvds = new Dvd[3];
		rentLimit = 3;

	}

	public void rentDvd(Dvd d) {
		if (d.isRentAvailable()) {
			switch (rentLimit) {
			case 0:
				System.out.println("대여는 3개까지만 가능합니다.");
				break;
			default:
				for (int i = 0; i < dvds.length; i++) {
					if (dvds[i] == null) {
						dvds[i] = d;
						d.setRentAvailable(false);
						rentLimit--;
						break;
					}
				}
				break;
			}

		} else {
			System.out.println(d.getTitle() + "은(는) 이미 대여된 DVD입니다.");

		}
	}

	public void returnDvd(Dvd d) {
		if (d.isRentAvailable()) {
			System.out.println(d.getTitle() + "을(를) 대여한 적이 없습니다.");

		} else {
			for (int i = 0; i < dvds.length; i++) {
				if (dvds[i] == d) {
					dvds[i] = null;
					d.setRentAvailable(true);
					rentLimit++;
					break;

				}
			}
		}
	}

	public void memberPrint() {
		System.out.println();
		System.out.println("-----------회원정보-----------");
		System.out.printf("%s    %s    %s\n", "회원번호", "이름", "전화번호");
		System.out.println("------------------------------");
		System.out.printf("%5d %9s %13s\n", no, name, phoneNumber);
		System.out.println("---------대여DVD정보----------");
		System.out.printf("  %s      %s      %s\n", "번호", "타이틀", "장르");
		System.out.println("------------------------------");
		for (int i = 0; i < dvds.length; i++) {
			if (dvds[i] != null) {
				dvds[i].dvdPrint();
			}
		}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Dvd[] getDvds() {
		return dvds;
	}

	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}

	public int getRentLimit() {
		return rentLimit;
	}

	public void setRentLimit(int rentLimit) {
		this.rentLimit = rentLimit;
	}

}
