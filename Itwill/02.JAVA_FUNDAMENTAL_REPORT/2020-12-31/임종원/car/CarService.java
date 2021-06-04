package com.itwill05.service.car;
public class CarService {

	private Car[] carArray;

	public CarService() {
		carArray = new Car[30];
	}

	public CarService(int count) {
		carArray = new Car[count];
	}

	/*
	 * 0. 차객체인자로받아서 입차후 성공실패여부반환 - 주차장이 만차이면 입차실패 - 차량번호중복체크
	 */
	public boolean ipChar(Car inCar) {
		boolean isSuccess = false;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				carArray[i] = inCar;
				isSuccess = true;
				break;
			}else if(carArray[i]!=null) {
				isSuccess=false;	
			}	
		}
		return isSuccess;
	}


//	1. 전체차량출력
	public void print() {
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i]!=null) {
				carArray[i].print();				
			}
		}
	}
//	2. 주차구획수반환

	public int parkingNo() {
		return carArray.length;
	}
//	3. 주차가능주차구획수반환

	public int findParking() {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		return count;
		
	}
//	5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환

	public Car finbyCarNo(String no) {
		Car findeByNo = new Car();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo().equals(no)) {
				findeByNo = carArray[i];
			}
		}
		return findeByNo;
		
	}



//	6. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	public Car[] inTime(int time) {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getInTime() >= time) {
				count++;
			}
		}
		Car[] findByCarInTime = new Car[count];
		count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getInTime() >= time) {
				findByCarInTime[count]=carArray[i];
				count++;
			}
		}
		return findByCarInTime;
	}
//	7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차"
	public void outTime(String no, int outTime) {
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null && carArray[i].getNo().equals(no)) {
				carArray[i].setOutTime(outTime);
				carArray[i].calculateFee();
				carArray[i].print();
				carArray[i] = null;
				break;
			}
		}
	}


}
