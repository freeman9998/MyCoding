package com.itwill.timetable.dao;

public class TimeSQL {
	public static final String TIME_INSERT = 
			"insert into Time (lectureNumber, day, startTime, endTime) "
			+ "VALUES (?,?,?,?)";

	public static final String TIME_UPDATE = 
			"update Time set day=?, startTime = ?, endTime = ? where lectureNumber=? and day = ? startTime = ? and endTime = ?";

	public static final String TIME_DELETE_BY_LECTURENUMBER = 
			"delete Time where lectureNumber=?";

	public static final String TIME_SELECT_BY_LECTURENUMBER = 
			"select lectureNumber, day, startTime, endTime from Time where lectureNumber=?";

	public static final String TIME_SELECT_BY_DAY = 
			"select lectureNumber, startTime, endTime from Time where day=?";

	public static final String TIME_SELECT_LECTURENUMBER = 
			"select lectureNumber from Time where day=? and srartTime=? and endTime=?";
	
	public static final String TIME_SELECT_ALL = 
			"select * from Time";	
}
