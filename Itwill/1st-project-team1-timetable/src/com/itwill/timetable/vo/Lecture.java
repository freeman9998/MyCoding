package com.itwill.timetable.vo;

import java.util.Date;

import com.itwill.timetable.vo.Time.*;

public class Lecture {

	public Week week;
	public int periodStart;
	public int periodEnd;

	private int lectureNumber;
	private String lectureName;
	private String location;
	private int colorR;
	private int colorG;
	private int colorB;

	public Lecture() {
		// TODO Auto-generated constructor stub
	}

	public Lecture(int lectureNumber, String lectureName, String location, int colorR, int colorG, int colorB) {
		super();
		this.lectureNumber = lectureNumber;
		this.lectureName = lectureName;
		this.location = location;
		this.colorR = colorR;
		this.colorG = colorG;
		this.colorB = colorB;
	}
	
	public Lecture(String lectureName, String location, int colorR, int colorG, int colorB) {
		this.lectureName = lectureName;
		this.location = location;
		this.colorR = colorR;
		this.colorG = colorG;
		this.colorB = colorB;
	}

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}

	public int getPeriodStart() {
		return periodStart;
	}

	public void setPeriodStart(int periodStart) {
		this.periodStart = periodStart;
	}

	public int getPeriodEnd() {
		return periodEnd;
	}

	public void setPeriodEnd(int periodEnd) {
		this.periodEnd = periodEnd;
	}

	public int getLectureNumber() {
		return lectureNumber;
	}

	public void setLectureNumber(int lectureNumber) {
		this.lectureNumber = lectureNumber;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getColorR() {
		return colorR;
	}

	public void setColorR(int colorR) {
		this.colorR = colorR;
	}

	public int getColorG() {
		return colorG;
	}

	public void setColorG(int colorG) {
		this.colorG = colorG;
	}

	public int getColorB() {
		return colorB;
	}

	public void setColorB(int colorB) {
		this.colorB = colorB;
	}

	@Override
	public String toString() {
		return "Lecture [lectureNumber=" + lectureNumber + ", lectureName=" + lectureName + ", location=" + location
				+ ", colorR=" + colorR + ", colorG=" + colorG + ", colorB=" + colorB + "]\n";
	}

	

}
