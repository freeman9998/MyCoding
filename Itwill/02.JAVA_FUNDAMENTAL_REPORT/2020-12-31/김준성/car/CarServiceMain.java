package com.itwill05.service.car;

public class CarServiceMain {
	public static void main(String[] args) {
		CarService carService = new CarService(65);

		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		boolean isSuccess = carService.carIn(new Car("2344", 3));
		if (!isSuccess) {
			System.out.println("만차");
		}
		carService.carIn(new Car("4566", 1));
		carService.carIn(new Car("1221", 2));
		carService.carIn(new Car("4521", 4));
		carService.carIn(new Car("9871", 7));
		carService.carIn(new Car("4532", 8));

		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.print();
		System.out.println();
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		System.out.println(">> 전체주차구획수: " + carService.parkingMaxNo());
		System.out.println();
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		System.out.println(">> 주차가능 주차구획수: " + carService.parkingAvailableNo());
		System.out.println();
		System.out.println("5.CarService객체야 차량번호(4567번) 인자로줄께 차객체한대 참조변수반환해줘");
		Car findCar = carService.findCarByNo("4567");
		if (findCar.getNo() != null) {
			Car.headerPrint();
			findCar.print();
		}
		System.out.println();
		System.out.println("6.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		Car[] findCars = carService.findCarByInTime(8);
		Car.headerPrint();
		if (findCars != null) {
			for (int i = 0; i < findCars.length; i++) {
				findCars[i].print();
			}
		}
		System.out.println("7.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜줘");
		carService.carOut("7891", 12);

	}

}