package com.itwill06.collection.car;

import java.util.ArrayList;

public class CarServiceHashMapMain {

	public static void main(String[] args) {

		CarServiceHashMap carService = new CarServiceHashMap(50);

		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		Car c1 = new Car("2344", 3);
		boolean isSuccess = carService.carIn(c1);
		if (!isSuccess) {
			System.out.println("만차 차빼!!!");
		}
		carService.carIn(new Car("4566", 4));
		carService.carIn(new Car("4567", 5));
		carService.carIn(new Car("3321", 6));
		carService.carIn(new Car("3908", 7));
		carService.carIn(new Car("7891", 8));
		carService.carIn(new Car("3433", 9));
		System.out.println();

		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.print();
		System.out.println();

		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		System.out.println(">>전체주차구획수: " + carService.getParkingLotCount());
		System.out.println();

		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		System.out.println(">>주차가능구획수: " + carService.getAvailableParkingLotCount());
		System.out.println();

		System.out.println("4.CarService객체야 차객체인자로줄께 입차시켜줘");
		carService.carIn(new Car("9090", 19));
		System.out.println();

		System.out.println("5.CarService객체야 차량번호(4567번) 인자로줄께  차객체한대 참조변수반환해줘");
		Car findCar = carService.findByNo("4567");
		Car.headerPrint();
		findCar.print();
		System.out.println();

		System.out.println("6.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		ArrayList<Car> findCars = carService.findByInTime(8);
		Car.headerPrint();
		for (int i = 0; i < findCars.size(); i++) {
			Car tempCar = findCars.get(i);
			tempCar.print();
		}
		System.out.println();

		System.out.println("7.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜줘");
		Car removeCar = carService.carOut("7891", 12);
		Car.headerPrint();
		removeCar.print();
		System.out.println();

		System.out.println("--------- 전체차량출력 --------------");
		carService.print();

	}

}