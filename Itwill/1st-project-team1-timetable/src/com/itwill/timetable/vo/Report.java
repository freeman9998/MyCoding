package com.itwill.timetable.vo;

import java.sql.Date;

public class Report {
	private int lectureNumber;
	private int reportNumber;
	private String reportName;
	private Date timeLimit;

	public Report() {
		// TODO Auto-generated constructor stub
	}

	public Report(int lectureNumber, int reportNumber, String reportName, Date timeLimit) {
		super();
		this.lectureNumber = lectureNumber;
		this.reportNumber = reportNumber;
		this.reportName = reportName;
		this.timeLimit = timeLimit;
	}

	public Report(int lectureNumber, String reportName, Date timeLimit) {
		super();
		this.lectureNumber = lectureNumber;
		this.reportName = reportName;
		this.timeLimit = timeLimit;
	}

	public Report(String reportName, Date timeLimit, int reportNumber) {
		super();
		this.reportName = reportName;
		this.timeLimit = timeLimit;
		this.reportNumber = reportNumber;
	}

	public int getLectureNumber() {
		return lectureNumber;
	}

	public void setLectureNumber(int lectureNumber) {
		this.lectureNumber = lectureNumber;
	}

	public int getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(int reportNumber) {
		this.reportNumber = reportNumber;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public Date getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(Date timeLimit) {
		this.timeLimit = timeLimit;
	}

	@Override
	public String toString() {
		return "Report [lectureNumber=" + lectureNumber + ", reportNumber=" + reportNumber + ", reportName="
				+ reportName + ", timeLimit=" + timeLimit + "]";
	}

}
