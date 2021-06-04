package com.itwill05.service.car;

public class CarServiceMain {

	public static void main(String[] args) {
			CarService carService=new CarService(65);
			System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
			boolean isSuccess = carService.ipChar(new Car("2344",3 ));
			if(!isSuccess) {
				System.out.println("만차..");
			}
			carService.ipChar(new Car("4566",4 ));
			carService.ipChar(new Car("1046",9 ));
			carService.ipChar(new Car("6578",1 ));
			carService.ipChar(new Car("4885",10 ));
			carService.ipChar(new Car("4567",8 ));
			carService.ipChar(new Car("7891",5 ));
			carService.ipChar(new Car("9824",6 ));
			carService.ipChar(new Car("4677",8 ));
			
			System.out.println("1.CarService객체야 전체차량출력해줘");
			carService.print();
			
			System.out.println("2.CarService객체야 전체주차구획수반환해줘");
			int parking = carService.parking();
			
			
			System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
			parking = carService.availableParking();
			
			
			System.out.println("5.CarService객체야 차량번호(4567번) 인자로줄께  차객체한대 참조변수반환해줘");
			Car findCar = carService.findByNo("4567");
			
			
			System.out.println("6.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
			Car[] findCars = carService.findByInTime(8);
			
			
			System.out.println("7.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜줘");
			carService.outCar("7891", 12);
	}

}
