
public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1 = new DvdMember(1,"임종원","010-0000-0000");
		/*
		 * Dvd들객체생성
		 */
		Dvd dvd1 = new Dvd(1222, "터미네이터", "액션");
		Dvd dvd2 = new Dvd(4885, "007", "액션");
		Dvd dvd3 = new Dvd(9952, "어벤저스", "액션");
		Dvd dvd4 = new Dvd(1124, "해리포터", "판타지");
		Dvd dvd5 = new Dvd(3365, "찰리와초콜릿공장", "판타지");

		/*
		 * 회원이Dvd들을 대여 - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */
		Dvd [] dvds = {dvd1,dvd2,dvd3,dvd4,dvd5};
		String msg = "님!! 3개까지 대여 가능합니다.!!";
		m1.setDvds(dvds);
		for (int i = 0; i < dvds.length; i++) {
			if (dvds.length > 4) {
				System.out.println("**********고객님에게***********");
				System.out.println(m1.getName()+msg);
				return;
			}else {
				System.out.println("-----------회원 목록-----------");
				m1.print();		
				break;
			}
		}
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		System.out.println("-----------대여 목록-----------");
		for (int i = 0; i < dvds.length; i++) {
			m1.getDvds()[i].print();
		}

	}

}
