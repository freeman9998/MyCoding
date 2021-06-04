package com.itwill.timetable.vo;

public class Time {

	public Week week;
	public int periodEnd;
	public int periodStart;
	private int lectureNumber;
	private String day;
	private String startTime;
	private String endTime;

	public Time() {
	}

	public Time(int lectureNumber, String day, String startTime, String endTime) {
		super();
		this.lectureNumber = lectureNumber;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getLectureNumber() {
		return lectureNumber;
	}

	public void setLectureNumber(int lectureNumber) {
		this.lectureNumber = lectureNumber;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Time [lectureNumber=" + lectureNumber + ", day=" + day + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}

	public int getInteval() {
		// TODO Auto-generated method stub
		return periodEnd - periodStart;
	}

}