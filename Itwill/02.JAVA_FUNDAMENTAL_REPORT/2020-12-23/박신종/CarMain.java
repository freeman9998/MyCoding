public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] carArray = {
				null, null, new Car("3456", 8), null, null,
				new Car("1226", 12), null, null, null, null,
				null, null, null, null, new Car("7756", 11),
				new Car("2506", 10), null, null, null, null,
				null, new Car("0084", 9), null, null, null,
				null, null, null, null, new Car("9996", 6)
		};

		System.out.println("1. 전체 차량 출력");
		Car.printHeader();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print(i + 1);
			}
		}
		System.out.println();

		System.out.println("2. 전체주차구획수");
		System.out.println(carArray.length);
		System.out.println();

		System.out.println("3. 주차 가능 주차 구획수 (비어있는)");
		int enableParkingNum = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				enableParkingNum++;
			}
		}
		System.out.println(enableParkingNum);
		System.out.println();

		System.out.println("4. 입차");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				String strInCarNo = Car.generateCarNo();
				for (int j = 0; j < carArray.length; j++) {
					if (carArray[j] != null) {
						if (carArray[j].getNo().equals(strInCarNo)) {
							continue;
						}
						carArray[i] = new Car(strInCarNo, (int) (Math.random() * 24) + 1);
					}
				}
			}
		}
		Car.printHeader();
		for (int i = 0; i < carArray.length; i++) {
			carArray[i].print(i + 1);
		}
		System.out.println();

		System.out.println("5. 입차시간 10시 이후 차량여러대 찾아서 정보 출력");
		Car.printHeader();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i].getInTime() >= 10) {
				carArray[i].print(i + 1);
			}
		}

	}

}
