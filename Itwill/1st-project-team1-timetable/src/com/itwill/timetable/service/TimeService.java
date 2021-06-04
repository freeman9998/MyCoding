package com.itwill.timetable.service;

import java.sql.Date;
import java.util.List;

import com.itwill.timetable.dao.TimeDao;
import com.itwill.timetable.vo.Lecture;
import com.itwill.timetable.vo.Report;
import com.itwill.timetable.vo.Time;

public class TimeService {
	private static TimeDao timeDao;

	public TimeService() {
		timeDao = new TimeDao();
	}

	//타임추가
	public int timeCreate(Time newTime) throws Exception {
		return timeDao.create(newTime);
	}

	//lectureNumber로 삭제하기
	public int timeDeleteByLectureNumber(int lectureNumber) throws Exception {
		return timeDao.deleteByLectureNumber(lectureNumber);
	}

	//lectureNumber로 가져오기
	public List<Time> findByLectureNumber(int lectureNumber) throws Exception {
		return timeDao.selectByLectureNumber(lectureNumber);
	}

	//전부 다 가져오기
	public static List<Time> findByAll() throws Exception {
		return timeDao.selectAll();
	}

	public int timeRegister(Lecture lecture, String day, String startTime, String endTiem) throws Exception {
		Time newTime = new Time(lecture.getLectureNumber(), day, startTime, endTiem);
		return timeDao.create(newTime);
	}
}
