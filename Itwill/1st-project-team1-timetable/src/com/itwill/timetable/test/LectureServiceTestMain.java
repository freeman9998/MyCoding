package com.itwill.timetable.test;

import java.sql.Date;
import java.sql.Timestamp;

import com.itwill.timetable.service.LectureService;
import com.itwill.timetable.vo.Lecture;

public class LectureServiceTestMain {
	public static void main(String[] args) throws Exception {
		String lectureName=null;
		LectureService ls=new LectureService();
		/*System.out.println("1.Create:"
				+ls.lectureCreate(new Lecture(
								"수학", 
								"수학관",
								55,56,250
								)));
		System.out.println("2.SelectId:"
				+ls.lectureSelectByLectureNumber(19));
		Lecture lecture=ls.lectureSelectByLectureNumber(19);
		lecture.setLectureName("과학");
		lecture.setLocation("과학관");
		System.out.println("3.Update:"
			+ls.lectureUpdate(lecture));
		System.out.println("4.Delete:"
				+ls.lectureDeleteByLectureNumber(13));*/
		
		System.out.println("5.SelectAll:"+ ls.lectureSelectAll());
		
		
	}
}
