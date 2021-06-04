package com.itwill.timetable.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import com.itwill.timetable.dao.ReportDao;
import com.itwill.timetable.vo.Report;

public class ReportDaoTestMain {

	public static void main(String[] args) throws Exception {
		ReportDao reportDao = new ReportDao();

		String sampleInput = "2021-02-25";
		Date timeLimit = Date.valueOf(sampleInput);

		System.out.println("1.create: " + reportDao.create(new Report(1, "문제풀이", timeLimit)));

		List<Report> reportListByLecture = reportDao.selectByLectureNumber(1);
		System.out.println("2.selectedByLecture: " + reportListByLecture);

		System.out.println("3.updateByReportNumber: "
				+ reportDao.update(new Report("자기소개", new Date(System.currentTimeMillis()), 15)));

		System.out.println("4.delete: " + reportDao.delete(10));
		System.out.println("5.selectByLectureNumber: " + reportDao.selectByLectureNumber(2));

		List<Report> reportAll = reportDao.selectAll();
		System.out.println("6.selectAll: " + reportAll);

	}

}
