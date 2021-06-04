package com.itwill05.service.car;

public class CarServiceMain {

	public static void main(String[] args) {
		CarService carService = new CarService(65);

		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		boolean isSuccess = carService.ipChar(new Car("2344", 3));
		if (!isSuccess) {
			System.out.println("만차..");
		}
		carService.ipChar(new Car("4567", 1));
		carService.ipChar(new Car("1221", 2));
		carService.ipChar(new Car("4521", 4));
		carService.ipChar(new Car("9871", 7));
		carService.ipChar(new Car("4532", 8));

		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.carPrint();
		
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		int parkingTotNo = carService.parkingLotTot();
		System.out.println(">>주차구획수: "+parkingTotNo);
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		int parkingLotno = carService.parkingLot();
		System.out.println(">>주차가능구획수: "+parkingLotno);
		System.out.println("5.CarService객체야 차량번호(4567번) 인자로줄께  차객체한대 참조변수반환해줘");
		Car findCar = carService.findByNo("4567");
		
		System.out.println("6.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		Car[] findInTime = carService.findByIpCha(8);
		System.out.println("7.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜줘");
		carService.findCarChulCha("7891", 12);

	}

}

