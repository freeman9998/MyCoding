package com.itwill05.service.car;
public class CarServiceMain {
	public static void main(String[] args) {
		
		CarService carService=new CarService(3);
		
		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		carService.carIn(new Car("4567",1));
		carService.carIn(new Car("7891",9 ));
		carService.carIn(new Car("2222",9 ));
		boolean isSuccess = carService.carIn(new Car("7891",3 ));
		if(!isSuccess) {		}		
		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.print();		
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		System.out.println(carService.parkinglot());
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		carService.availableparkinglot();
		System.out.println("5.CarService객체야 차량번호(4567번) 인자로줄께  차객체한대 참조변수반환해줘");
		carService.returncar("4567");
		System.out.println("6.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		carService.returncar(8);
		System.out.println("7.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜줘");
		Car.headerPrint();
		carService.carOut("7891", 12);
		
	}

}