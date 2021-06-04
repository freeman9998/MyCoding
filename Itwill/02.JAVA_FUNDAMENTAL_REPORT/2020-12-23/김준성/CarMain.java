
public class CarMain {

	public static void main(String[] args) {
		Car[] carArray = { null, null, new Car("5654", 8), null, null, new Car("3422", 12), null, null, null, null,
				null, null, null, null, new Car("7789", 11), null, new Car("1120", 10), null, null, null, null, null,
				new Car("2389", 9), null, null, null, null, null, null, new Car("5555", 6) };
		/*
		 * null.메소드() --> NullPointerException
		 */

		System.out.println("1. 전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();
			}
		}
		System.out.println();

		System.out.println("2. 전체 주차구획수");
		System.out.println(">> " + carArray.length);
		System.out.println();

		System.out.println("3. 주차가능주차구획수");
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				count++;
			}
		}
		System.out.println(">> " + count);
		System.out.println();

		System.out.println("4. 입차");
		/*
		 * 1. 차량객체생성 2. 빈자리 찾아서 대입
		 */
		Car tempCar = new Car("3765", 17);

		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = tempCar;
				tempCar = null;
				break;
			}
		}
		System.out.println();

		System.out.println("5. 차량번호 7789번 차 한 대 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo().equals("7789")) {
				Car.headerPrint();
				carArray[i].print();
				break;
			}
		}
		System.out.println();

		System.out.println("6. 입차시간 10시 이후 차량 여러 대 찾아서 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getInTime() > 10) {
					carArray[i].print();
				}
			}
		}
		System.out.println();

		System.out.println("7.2389번차량 12시 출차");
		/*
		 * 1. 2389번차량찾기 2. 출차 3. 영수증출력 4. 주차장에서 차량삭제
		 */
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo().equals("2389")) {
				carArray[i].setOutTime(12);
				carArray[i].calculateFee();
				Car.headerPrint();
				carArray[i].print();
				carArray[i] = null;
				break;
			}
		}
		System.out.println();
	}

}
