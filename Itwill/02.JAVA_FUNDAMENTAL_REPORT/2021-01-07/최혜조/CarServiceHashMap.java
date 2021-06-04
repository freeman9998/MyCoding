package com.itwill06.collection.car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CarServiceHashMap {
	
	private HashMap<String,Car> carMap;
	private int count;// 주차장 구획수
	private int availablePark;
	public CarServiceHashMap() {
		carMap = new HashMap<String,Car>();
		count = 30;
		availablePark = 30;
	}

	public CarServiceHashMap(int count) {
		carMap = new HashMap<String,Car>();
		this.count = count;
		availablePark = count;
	}

	/*
	 * 0. 차객체인자로받아서 입차후 성공실패여부반환 
	 *   - 주차장이 만차이면 입차실패
	 */
	public boolean ipCha(Car inCar) {
		boolean isSuccess = false;
		if (availablePark == 0) {
			System.out.println("만차입니다.");
			return false;
		} else {
		carMap.put(inCar.getNo(), inCar);
		availablePark--;
		isSuccess = true;
		}
		return isSuccess;
	}

	/*
	 * 1. 전체차량출력
	 */
	
	public void print() {
		Car.headerPrint();
		Car findCar = null;
		Iterator<Car> it = carMap.values().iterator();
		while(it.hasNext()) {
			findCar = it.next();
			findCar.print();
		}
	}

	/*
	 * 2. 주차전체구획수반환 
	 */
	
	public int getParkingLotCount() {
		return this.count;
	}
	
	/*
	  3. 주차가능주차구획수반환 
	 */
	public int getAvailableParkingLotCount() {
		return count-carMap.size();
		//return availablePark;
	} 
	
	/*
	 * 5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {
		Car findCar = carMap.get(no);
		return findCar;
	}
	

	/*
	 * 6. 입차시간(8시이후)인자받아서 ArrayList(차객체배열) 참조변수반환
	 */
	public ArrayList<Car> findByInTime(int inTime) {
		Car findCar = null;
		ArrayList<Car> findCars = new ArrayList<Car>();
		Iterator<Car> it = carMap.values().iterator();
		while(it.hasNext()) {
		findCar = it.next();
		if(findCar.getInTime() >= inTime) {
			findCars.add(findCar);
		}
			
		}		
		return findCars;
	}

	/*
	 * 7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차";
	 */
	public Car chulCha(String no, int outTime) {
		Car removeCar= null;
		removeCar = carMap.get(no);
		removeCar.setOutTime(outTime);
		removeCar.calculateFee();
		carMap.remove(no);
		return removeCar;
	}
}