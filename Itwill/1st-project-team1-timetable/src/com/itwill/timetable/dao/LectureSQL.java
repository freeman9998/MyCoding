package com.itwill.timetable.dao;

public class LectureSQL {
	public static final String LECTURE_INSERT = "INSERT INTO lecture (lectureNumber, lectureName, location, colorR, colorG, colorB) \r\n"
			+ "	VALUES (lecture_lectureNumber_SEQ.nextval, ?, ?, ?, ?, ?)";

	public static final String LECTURE_UPDATE = "update lecture set lectureName=?, location=?, colorR=?,colorG=?,colorB=? where lectureNumber=?";

	public static final String LECTURE_DELETE_BY_Detail = "delete lecture where lectureNumber=? and lectureName=? and location=? and colorR=? and colorG=? and colorB=?";

	public static final String LECTURE_DELETE_BY_LECTURENUMBER = "delete lecture where lectureNumber=?";

	public static final String LECTURE_SELECT_BY_LECTURENUMBER = "select lectureNumber, lectureName, location, colorR, colorG, colorB from lecture where lectureNumber=?";

	public static final String LECTURE_SELECT_ALL = "select lectureNumber, lectureName, location, colorR, colorG, colorB from lecture";
	
	public static final String LECTURE_SELECT_MAX_LECTURENUMBER = "select max(lecturenumber) as max_lec_no from lecture";

}
