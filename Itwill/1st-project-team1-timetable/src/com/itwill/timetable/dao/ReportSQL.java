package com.itwill.timetable.dao;

public class ReportSQL {
	public static final String REPORT_INSERT = "insert into report (lectureNumber, reportNumber, reportName, timeLimit) VALUES(?, report_reportNumber_SEQ.nextval, ?, ?)";
	public static final String REPORT_UPDATE = "update report set reportName = ?, timeLimit = ? where reportNumber = ?";
	public static final String REPORT_DELETE = "delete report where reportNumber = ?";
	public static final String REPORT_DELETE_BY_LECTURENUMBER = "delete report where lectureNumber = ?";
	public static final String REPORT_SELECT_LECTURE = "select * from report where lectureNumber = ?";
	public static final String REPORT_SELECT_ALL = "select * from report";
	public static final String REPORT_SELECT_MAX_REPORTNUMBER = "select max(reportnumber) from report";

}
