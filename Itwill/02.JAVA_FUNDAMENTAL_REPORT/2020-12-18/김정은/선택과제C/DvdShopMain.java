package com.itwill4.array;

public class DvdShopMain {

	public static void main(String[] args) {
		Dvdmember mb = new Dvdmember();

		Dvd dvd1 = new Dvd(55, "스위트홈", "스릴러");
		Dvd dvd2 = new Dvd(66, "펜트하우스", "드라마");
		Dvd dvd3 = new Dvd(70, "좋아하면울리는", "로맨스");

		Dvd dvds[] = { dvd1, dvd2, dvd3 };
		mb.setNo(1538);
		mb.setName("LEE");
		mb.setTel("01088889999");
		mb.setDvds(dvds);

		mb.headprint();
		mb.print();

	}

}
