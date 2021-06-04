package com.itwill04.array;

public class CarMain {

	public static void main(String[] args) {
		Car[] carArray = {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389",9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		/*
		null.메쏘드() --> NullPointerException
		 */
		System.out.println("1.전체차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null) {
				carArray[i].print();
			}
		}
		System.out.println("2.전체주차구획수");
		System.out.println(carArray.length);
		System.out.println("3.주차가능구획수");
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]==null) {
				count++;
			}
		}
		System.out.println(">> "+count);
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 * 2.빈자리 찾아서 대입
		 */
		Car car1 = new Car("7789", 13);
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				carArray[i]=car1;
				break;
			}
		}
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null) {
				carArray[i].print();
			}
		}
		System.out.println("5.차량번호 7789번 차 한대 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if ((carArray[i]!=null)&&carArray[i].getNo()=="7789") {
				carArray[i].print();
				break;
			}
		}
		
		System.out.println("6.입차시간 10시이후 차량 여러대 찾아서 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if ((carArray[i]!=null)&&carArray[i].getInTime() >= 10) {
					carArray[i].print();
			}
		}
		System.out.println("7.2389번 차량 12시 출차");
		/*
		 * 1. 2389번 차량 찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 주차장에서 차량 삭제
		 */
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null&&carArray[i].getNo()=="2389") {
				carArray[i].setOutTime(12);
				carArray[i].calculateFee();
				carArray[i].print();
				carArray[i] = null;
				break;
			}
		}	
	}
}
