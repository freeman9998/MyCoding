package com.itwill.timetable.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import com.itwill.timetable.dao.ReportDao;
import com.itwill.timetable.vo.Lecture;
import com.itwill.timetable.vo.Report;

public class ReportService {
	private ReportDao reportDao;

	public ReportService() {
		reportDao = new ReportDao();
	}

	/*
	 * 과제등록
	 */
	/*
	 * 1.수업을 선택
	 * 	1-1.id와 lectureName을 가져옴
	 * 
	 * 2.데이터 입력
	 * 	2-1.과제이름
	 * 	2-2.제출기한
	 * 
	 * 3.Report create
	 */
	public int reportRegister(Lecture lecture, String reportName, String timeLimtString) throws Exception {
		Date timeLimit = this.convertTimeStringToSqlDate(timeLimtString);

		Report newReport = new Report(lecture.getLectureNumber(), reportName, timeLimit);
		return reportDao.create(newReport);
	}

	/*
	 * 선택한 과목의 과제를 보여줌
	 */
	public List<Report> getReportList(int lectureNumber) throws Exception {
		return reportDao.selectByLectureNumber(lectureNumber);
	}

	/*
	 * 과제삭제
	 */
	public int reportDelete(int reportNumber) throws Exception {
		return reportDao.delete(reportNumber);
	}

	public int reportDeleteByLectureNumber(int lectureNumber) throws Exception {
		return reportDao.deleteByLectureNumber(lectureNumber);
	}

	/*
	 * 과제수정
	 */
	public int reportUpdate(Report report) throws Exception {
		return reportDao.update(report);
	}

	/*
	 * D-DAY 계산
	 */
	public int calculateDoomsDay(Date timeLimit) {
		LocalDate fromDate = LocalDate.now();
		LocalDate toDate = LocalDate.of(timeLimit.getYear() + 1900, timeLimit.getMonth() + 1, timeLimit.getDate());
		return (int) ChronoUnit.DAYS.between(fromDate, toDate);
	}

	/*
	 * String --> Date
	 */
	public Date convertTimeStringToSqlDate(String timeString) {
		return Date.valueOf(timeString);

	}

	/*
	 * Date --> String
	 */
	public String convertSqlDateToTimeString(Date date) {
		SimpleDateFormat convert = new SimpleDateFormat("yyyy-MM-dd");
		return convert.format(date);
	}
}
