package com.itwill.timetable.test;

import java.sql.Timestamp;

import com.itwill.timetable.dao.LectureDao;
import com.itwill.timetable.vo.Lecture;

public class LectureDaoTestMain {

	public static void main(String[] args) throws Exception {
		String lectureName = null;
		LectureDao lectureDao = new LectureDao();
		System.out.println("1.create:" + lectureDao.create(new Lecture("영어의정석", "과학관", 50,125,144)));
		System.out.println("2.selectById:" + lectureDao.selectByLectureNumber(16));
		Lecture lecture = lectureDao.selectByLectureNumber(16);
		lecture.setLectureName("한국사의이해");
		lecture.setLocation("한국관");
		lecture.setColorR(240);
		lecture.setColorG(150);
		lecture.setColorB(48);
		System.out.println("3.updateById:" + lectureDao.updateByLectureNumber(lecture));
		
		System.out.println("4.selectAll" + lectureDao.selectAll());
		System.out.println("5.deleteByLectureNumber:" + lectureDao.deleteByLectureNumber(10));
	}
}
