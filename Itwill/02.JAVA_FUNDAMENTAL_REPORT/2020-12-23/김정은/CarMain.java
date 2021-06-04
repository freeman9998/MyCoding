package com.itwill4.array;

public class CarMain {

	public static void main(String[] args) {
		Car[] carArray = {
				null,null,new Car("5654", 8),null,null,
				new Car("5555", 15),null,null,null,null,
				null,null,null,null,new Car("2525", 3),
				null,null,null,null,new Car("1111", 12),
				new Car("2323", 11),null,null,null,null,
				null,null,new Car("8888",1),null,null,

		};
		
		System.out.println("1.전체 차량 출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();
			}
		}
		System.out.println("2.전체주차구획수");
		System.out.println(">>"+carArray.length);
		System.out.println("3.주차가능주차구획수");
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]==null) {
				count++;
			}
		}
		System.out.println(">>"+count);
		
		System.out.println("4.입차");
		/*
		 1.차량 객체 생성
		 2.빈자리 찾아서 대입
		 */
		Car car = new Car("5135", 5);
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = car;
				break; //주차자리 찾으면 바로 나와야함
			}
		}

		System.out.println("5.입차시간 10시이후차량 여러대 찾아서 출력");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getInTime() > 10) {
				carArray[i].print();

			}

		}

	}

}
