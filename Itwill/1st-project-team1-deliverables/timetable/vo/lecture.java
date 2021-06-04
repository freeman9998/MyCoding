package com.itwill.timetable.vo;

//L_lectureLoc,L_lectureRoom,L_teacher,L_date,L_time
public class lecture {
	private String L_lectureLoc;
	private String L_lectureRoom;
	private String L_teacher;
	private String L_date;
	private int L_time;

	public lecture() {
	}

	public String getL_lectureLoc() {
		return L_lectureLoc;
	}

	public void setL_lectureLoc(String L_lectureLoc) {
		L_lectureLoc = L_lectureLoc;
	}

	public String getL_lectureRoom() {
		return L_lectureRoom;
	}

	public void setL_lectureRoom(String l_lectureRoom) {
		L_lectureRoom = l_lectureRoom;
	}

	public String getL_teacher() {
		return L_teacher;
	}

	public void setL_teacher(String L_teacher) {
		L_teacher = L_teacher;
	}

	public String getL_date() {
		return L_date;
	}

	public void setL_date(String l_date) {
		L_date = l_date;
	}

	public int getL_time() {
		return L_time;
	}

	public void setL_time(int l_time) {
		L_time = l_time;
	}

	@Override
	public String toString() {
		return "lecture [L_lectureLoc=" + L_lectureLoc + ", L_lectureRoom=" + L_lectureRoom + ", L_teacher=" + L_teacher
				+ ", L_date=" + L_date + ", L_time=" + L_time + "]";
	}

}
