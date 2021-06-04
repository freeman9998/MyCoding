
public class CarMain {

	public static void main(String[] args) {
		//Car[] carArray = new Car[30];
		Car[] carArray = {
				null,null,new Car("5724", 8),null,null,
				null,new Car("9682", 12),null,null,null,
				null,null,null,new Car("1553", 11),null,
				new Car("2389", 7),null,null,new Car("7789", 4),null,
				null,null,null,null,new Car("3312", 10),
				null,new Car("8698", 9),null,null,null
		};
		//null.메소드() --> NullPointerException 오류
		System.out.println("1.전체 차량 출력");
			Car.headerPrint();
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]!=null) {
					carArray[i].print();
				}
			}
		System.out.println();	
		System.out.println("2.전체 주차구획수");
			System.out.println(">>"+carArray.length);
		
		System.out.println();
		System.out.println("3.주차가능한 주차구획수");
			int count = 0;
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]==null) {
					count++;
				}
			}
			System.out.println(">>"+count);
			
		System.out.println();
		System.out.println("4.입차");
			/*
			 * 1.차량 객체 생성
			 * 2.빈자리 찾아 대입
			 */
			Car car1 = new Car("1234", 11);
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]==null) {
					carArray[i] = car1;
					carArray[i].print();
					break;
				}
			}
		System.out.println();
		System.out.println("5.차량번호 7789번 정보 출력");
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]!=null && carArray[i].getNo().equals("7789")) {
					carArray[i].print();
					break;
				}
			}
		
		
		System.out.println();
		System.out.println("6.입차시간 10시 이후 차량 모두출력");
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]!=null && carArray[i].getInTime()>=10) {
					carArray[i].print();
				}
			}
			
		
		System.out.println();
		System.out.println("7.2389번차량 12시 출차");
			/*
			 * 1. 2389번차량찾기
			 * 2. 출차
			 * 3. 영수증출력
			 * 4. 주차장에서 차량삭제
			 */	
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]!=null && carArray[i].getNo().equals("2389")) {
					carArray[i].setOutTime(12);
					carArray[i].calculateFee();
					System.out.println("차량번호 "+carArray[i].getNo()+"번의 주차요금은 "+carArray[i].getFee()+"원 입니다.");
					carArray[i]=null;
				}
			}
					
	}

}
