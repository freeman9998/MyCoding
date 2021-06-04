package com.itwill05.service.car;


public class CarService {
	
	private Car[] carArray;
	
	public CarService() {
		carArray=new Car[30];
	}
	public CarService(int count) {
		carArray=new Car[count];
	}
	/*
	0. 차객체인자로받아서 입차후 성공실패여부반환
	     - 주차장이 만차이면 입차실패
	     - 차량번호중복체크
	*/
	public boolean ipChar(Car inCar) {
		boolean isSuccess=false;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]==null) {
				carArray[i]=inCar;
				isSuccess=true;
				break;
			}
		}
		
		
		
		
		
		return isSuccess;
	}
	
	//1. 전체차량출력
	public void allPrint() {
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		
		
	}
	
	
	//2. 주차구획수반환
	
	public int parkingZone(){
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null) {
				count++;
				
			}
		}
		
		return count;
	}
	
	
	//3. 주차가능주차구획수반
	
	public int parkingPossible() {
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]==null) {
				count++;
			}
		}
		return count;
	}

	
	//5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	public Car findNo(String no) {
		Car findCar=null;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i].getNo().equals(no)) {
				findCar=carArray[i];
				break;
			}
		}
		return findCar;
	}
	
	
	
	
	
	//6. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	
	public Car[] findIpchaTime(int inTime) {
		int count=0;
		Car[] intTimeArray;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null && carArray[i].getInTime()>=inTime) {
				count++;
			}
			
		}
		intTimeArray=new Car[count];
		int count2=0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null && carArray[i].getInTime()>=inTime) {
				intTimeArray[count2]=carArray[i];
				count2++;
			
			}
		}
		return intTimeArray;
	}
	
	
	
	
	//7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차"
	
	public Car findOutTimeCar(String no,int outTime) {
		Car outCar=null;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null && !carArray[i].equals(no)) {
				System.out.println("그런차 없습니당");
				break;
			}
		}
		
		
		
		
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null && carArray[i].getNo().equals(no)) {
				carArray[i].setOutTime(outTime);
				carArray[i].calculateFee();
				outCar=carArray[i];
				carArray[i]=null;
				
			}
			
			
		}
		return outCar;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}