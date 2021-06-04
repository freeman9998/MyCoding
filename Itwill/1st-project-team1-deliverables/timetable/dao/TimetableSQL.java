package com.itwill.timetable.dao;

public class TimetableSQL {
	public static final String lecture_INSERT = "insert into Lecture (L_name,L_lectureRoom,L_teacherName,L_date,L_time) values(?,?,?,?,?)";
	public static final String lecture_UPDATE = "update Lecture set L_name,L_lectureRoom,L_teacherName where m_id=?";
	public static final String lecture_DELETE = "delete Lecture where L_id=?";
	public static final String Lecture_SELECT = "select * from Lecture where L_lectureLoc";
}