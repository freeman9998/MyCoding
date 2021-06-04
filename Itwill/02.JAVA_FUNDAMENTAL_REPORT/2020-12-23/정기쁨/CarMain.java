
public class CarMain {

	public static void main(String[] args) {
		//Car[] carArray=new Car[30]
		
		Car[] carArray = {
				null,null,new Car("1234", 8),null,null,
				new Car("5678", 12),null,null,null,null,
				null,null,null,null,new Car("9012", 10),
				new Car("3456", 10),null,null,null,null,
				null,new Car("7789", 9),null,null,null,
				null,null,null,null,new Car("2389", 6)
		};
		System.out.println("1.전체 차량 출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
			carArray[i].print();			
			}
		}
		System.out.println("2.전체 주차 구획수");
		System.out.println(">> "+carArray.length);
		System.out.println("3.주차 가능 구획수");
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
			count++;
			}
		}
		System.out.println(">> "+count);
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 * 2.빈자리찾아서 대입
		 */
		Car car1 = new Car("5555", 14);
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]==null) {
				carArray[i]=car1;
				carArray[i].print();	
				break;
			}
		}
		
		System.out.println("5.차량번호 7789번 차한대 정보 출력");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null&&carArray[i].getNo().equals("7789")) {
				carArray[i].print();
			}
		}
		
		System.out.println("6.입차시간 10시이후 차량 여러대 찾아서 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getInTime()>=10) {
				carArray[i].print();
			}
		}
				System.out.println("7.2389번 차량 12시 출차");
		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 주차장에서 차량삭제
		 */
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null&&carArray[i].getNo().equals("2389")) {
				carArray[i].setOutTime(12);
				carArray[i].calculateFee();
				carArray[i].print();
				carArray[i] = null;
				break;
			}

		}
		
	}
}
