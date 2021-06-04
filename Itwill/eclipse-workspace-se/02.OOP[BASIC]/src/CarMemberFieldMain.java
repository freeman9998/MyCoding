
public class CarMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.차량입차 1234번 12시
		 */
	
		//차객체의 주소를 저장할 참조변수선언
		Car car1;
		
		//차객체힙 메모리에 생성후에 객체의 주소값이 car1변수에대입
		car1 = new Car();
		
		//차객체의 no 멤버필드에 값대입
		car1.no="1234";
		//차객체의 inTime 멤버필드에 값대입
		car1.inTime=12;
		/*
		 * 2.16시 car1 차량출차 1234차량 출차
		 */
		//차객체의 outTime 멤버필드(변수)에 16대입 
		car1.outTime=16;
		//주차요금계산
		//차객체의 fee 멤버필드에 계산후대입
		car1.fee = (car1.outTime-car1.inTime)*1000; 
		//영수증출력
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %7d %9d %7d%n",car1.no,car1.inTime,car1.outTime,car1.fee);
	}
}
