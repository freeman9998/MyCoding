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
			if(carArray[i]==null) {
				isSuccess = true;
				carArray[i]=inCar;
				break;
			}else if(carArray[i]!=null&&carArray[i].getNo().equals(inCar.getNo())) {
				System.out.println("중복되는 차량번호입니다.");
				break;
			}
		}
		
		return isSuccess;
	}

	//1. 전체차량출력
	public void print() {
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
	}
	
	//2. 주차구획수반환
	public int parking() {
		return carArray.length;
	}
	
	//3. 주차가능주차구획수반환
	public int availableParking() {
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		return count;
	}
	
	//5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	public Car findByNo(String no) {
		Car findCar = null;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null&&carArray[i].getNo().equals(no)) {
				findCar = carArray[i];
				break;
			}
		}
		return findCar;
	}
	
	//6. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	public Car[] findByInTime(int inTime) {
		Car[] findCars = null;
		int count =0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null&&carArray[i].getInTime()>=inTime) {
				count++;
			}
		}
		findCars = new Car[count];
		count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null&&carArray[i].getInTime()>=inTime) {
				findCars[count]=carArray[i];
				count++;
			}
		}
		return findCars;
	}
	
	//7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차");
	public void outCar(String no,int outTime) {
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null&&carArray[i].getNo().equals(no)) {
				carArray[i].setOutTime(outTime);
				carArray[i].calculateFee();
				carArray[i].print();
				carArray[i]=null;
				break;
			}
		}
	}

	
	
}
