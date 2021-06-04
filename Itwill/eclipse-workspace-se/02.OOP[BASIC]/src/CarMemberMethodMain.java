
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1.차량입차 1234번 12시
		 */
		Car car1=new Car();
		car1.setIpChaData("1234", 12);
		Car car2=new Car();
		car2.setIpChaData("5678", 13);
		
		/*
		 * 2.16시 car1 차량출차 1234차량 출차
		 */
		car1.setOutTime(16);
		car1.calculateFee();
		
		car2.setOutTime(16);
		car2.calculateFee();
		
		/* 멤버필드접근
		 *   - 형태: 참조변수.필드이름=데이타;
		 *    
		 * 멤버메쏘드실행(호출)
		 *   - 형태:참조변수.메쏘드이름(); 
		 *   - 의미:car1객체의 print이름을가진 메쏘드(블록)를 실행하기위해서
		 *          실행흐름(쓰레드)을 print메쏘드(블록)로 보낸다
		 */
		car1.print();
		car2.print();
		System.out.println("----------반복출력-----------");
		car1.print();
		
		return;
	}

}








