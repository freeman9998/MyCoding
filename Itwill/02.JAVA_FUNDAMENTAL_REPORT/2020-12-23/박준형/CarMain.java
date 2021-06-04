package com.itwill04.array;

public class CarMain {

	public static void main(String[] args) {
		Car[] carArray = {
				null,null,new Car("5654",8),null,null,
				new Car("3422",12),null,null,null,null,
				null,null,null,null,new Car("7789",11),
				new Car("1120",10),null,null,null,null,
				null,new Car("2389",9),null,null,null,
				null,null,null,null,new Car("5555",6)
		};
		/*
		 * null 메쏘드() -> NullPointerException
		 */
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for(int i=0; i<carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		System.out.println("2.전체 주차 구획수");
		System.out.println(">>"+carArray.length);
		System.out.println("3.주차가능 주차구");
		int count=0;
		for(int i=0; i<carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		System.out.println(">>"+count);
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 * 2.빈자리찾아서 대입
		 */
		int random;
		String carno;
		int intime;
		//빈자리에 입차
		for(int i=0; i<carArray.length; i++) {
			if(carArray[i]==null) {
				random = (int)(Math.random()*10000);
				if(random>1000 && random<10000) { //차량번호를 1000~9999로 잡기위한 조건
					carno= String.valueOf(random); //int타입을 Stirng타입으로 변환	
					intime= (int)(Math.random()*23); //0~23시간 기준
					carArray[i] = new Car(carno,intime);
					//차량번호 중복체크
					for (int j = 0; j < i; j++) {
						if(carArray[i]==carArray[j]) {
							i--;
						}
					}
				}else {
				//차량번호가 1000~9999사이를 만족못 할 경우
					i--;
				}
			}
		}
		System.out.println("5.입차시간 10시이후 차량여러대 찾아서 출력");
		Car.headerPrint();
		for(int i=0; i<carArray.length; i++) {
			if(carArray[i].getInTime()>10) {
				carArray[i].print();				
			}
		}
		
		System.out.println("6.차량번호 7789번 차한대 정보출력");
		Car.headerPrint();
		for(int i=0; i<carArray.length; i++) {
			if(carArray[i].getNo().equals("7789")) {
				carArray[i].print();				
			}
		}
		System.out.println("7.2389번 차량 12시 출차");
		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 주차장에서 차량삭제
		 */
		for(int i=0; i<carArray.length; i++) {
			if(carArray[i].getNo().equals("2389")) {
				carArray[i].setOutTime(12); //출차시간 입력
				carArray[i].calculateFee(); //주차 요금 계산
				Car.headerPrint();
				carArray[i].print(); //영수증 출력
				carArray[i]=null; //차량 삭제
			}
		}
	}

}
