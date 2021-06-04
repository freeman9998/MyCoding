package com.itwill.timetable.test;

import java.util.List;

import com.itwill.timetable.service.ReportService;
import com.itwill.timetable.vo.Lecture;
import com.itwill.timetable.vo.Report;

public class ReportServiceTestMain {

	public static void main(String[] args) throws Exception {
		ReportService reportService = new ReportService();
		Lecture sampleLecture = new Lecture();
		sampleLecture.setLectureNumber(1);
		sampleLecture.setLectureName("해부학");

		//과제등록
		reportService.reportRegister(sampleLecture, "자기소개", "2021-04-01");

		//과제리턴
		List<Report> sampleList = reportService.getReportList(sampleLecture.getLectureNumber());
		Report sampleReport = sampleList.get(0);
		System.out.println(sampleList);

		//과제수정
		sampleReport.setReportName("17분할");
		sampleReport.setTimeLimit(reportService.convertTimeStringToSqlDate("2021-03-08"));
		reportService.reportUpdate(sampleReport);

		//D-DAY계산
		System.out.println(reportService.calculateDoomsDay(sampleReport.getTimeLimit()));

		//과제삭제
		reportService.reportDelete(sampleReport.getReportNumber());

	}

}
