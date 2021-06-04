
public class CarMain {

	public static void main(String[] args) {
		//Car[] carArray = new Car[30];
		
		Car[] carArray = {
				null, null, new Car("5654", 8), null, null,
				new Car("3422", 12), null, null, null, null,
				null, null, null, null, new Car("7789", 11),
				new Car("1120", 10), null, null, null, null,
				null, new Car("2389", 9), null, null, null,
				null, null, null, null, new Car("5555", 6)
		};
		/*
		 * null.메소드() --> NullPointerException
		 */
		System.out.println("1. 전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null) {
				carArray[i].print();
			}
		}
		System.out.println("2. 전체 주차 구획수");
		System.out.println(">>" + carArray.length);
		System.out.println("3. 주차가 가능한 주차구획수");
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				count++;
			}
		}
		System.out.println(">>" + count);
		System.out.println("4. 입차");
		/*
		 * 1. 차량 객체생성
		 * 2. 빈차리 찾아서 대입
		 * 
		 */
		
		Car[] car1 = new Car[5];
		car1[0] = new Car("3264", 13);
		car1[1] = new Car("4259", 6);
		car1[2] = new Car("9721", 8);
		car1[3] = new Car("3254", 7);
		car1[4] = new Car("7487", 12);
		for(int j = 0; j < car1.length; j++) {
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i] == null) {
					carArray[i] = car1[j];
					break;
				}
			}
		}
		
		System.out.println("5.입차시간 10시이후 차량 여러대 찾아서 출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] != null) {
				if(carArray[i].getInTime() >= 10) {
						carArray[i].print();
				}
			}
		}
		
	}

}
