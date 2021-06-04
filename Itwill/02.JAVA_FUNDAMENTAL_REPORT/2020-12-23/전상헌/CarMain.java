package com.itwill04.array;

public class CarMain {	
	public static void main(String[] args) {
		Car[] carArray= {
			null,null,new Car("5654",8),null,null,	
			null,new Car("3422",12),null,null,null,	
			null,null,null,new Car("7789",11),null,	
			new Car("1120",10),null,null,null,null,	
			null,null,new Car("2389",9),null,null,	
			null,null,null,new Car("5555",6),null	
		};
		System.out.println("1.전체 차량 출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
				
			}
		}
		
		/*
		 * null.메쏘드()-->NullPointException 
		 */
		
		
		System.out.println("2.전체 주차 구획수 ");
		
		System.out.println(carArray.length);
		
		
		System.out.println("3.주차 가능 주차 구획수 ");
		
		int parkingPossible=0;
		
		for (int i = 0; i < carArray.length; i++) {
			
			if(carArray[i]==null) {
				parkingPossible++;
			}
		}
		System.out.println("주차 가능한 구획수 :"+parkingPossible);
		
		
		System.out.println("4.입차 ");
		
		/*
		 * 1.차량객체생성
		 * 2.빈자리 찾아서 대입
		 * 
		 */
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				carArray[i]=new Car("3333", 10);
				break;
			}
		}
		
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
				
			}
		}
		
		
		System.out.println("5.입차시간 10시이후 차량여러대 찾아서 출력 ");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getInTime()>=10) {
				carArray[i].print();
			}
		}
		
		
		//  1.2389번차량찾기
		System.out.println("1.2389번차량찾기");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null && carArray[i].getNo()=="2389") {
				carArray[i].print();
							}
			
		}
		//  2.출차
		// 3422차량이 23시에 출차 
		System.out.println("2.출차");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null && carArray[i].getNo().equals("3422")) {
				carArray[i].setOutTime(23);
				
			}
			
		}
		
		
		
		
		
		//  3.영수증출력
		//  3422차량 영수증출력
		System.out.println("영수증 출력");
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null && carArray[i].getNo().equals("3422")) {
				carArray[i].bill();
				
			}
			
		}
		
		
		
		
		
		
		
		
		System.out.println("------------------차량삭제---------------");
		//  4.주차에서 차량삭제
		//나가는 차량넘버가 "3422"인경우
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null && carArray[i].getNo().equals("3422")) {
				carArray[i]=null;
				
			}
			
		}
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
				
			}
		}
		
		
		
		
		
		
		
	}

}
