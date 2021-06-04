package study03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		
		DvdMember dvdm = new DvdMember();
		dvdm.setNo(1);
		dvdm.setName("PARK");
		dvdm.setTel("010-1234-4321");
		
		/*
		 * Dvd객체생성
		 */
		Dvd movie = new Dvd(10, "오직그대만", "로맨스");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		dvdm.setDvd(movie);
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		dvdm.headprint();
		dvdm.print();
		
	}

}