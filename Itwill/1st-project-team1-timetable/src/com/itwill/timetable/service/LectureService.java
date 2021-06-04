package com.itwill.timetable.service;

import java.util.List;

import com.itwill.timetable.dao.LectureDao;
import com.itwill.timetable.vo.Lecture;

public class LectureService {
	private LectureDao lectureDao;

	/*
	 * Dao객체 생성 생성자
	 */
	public LectureService() {
		lectureDao = new LectureDao();
	}

	/*
	 * 사용자가 UI에서 강의정보를 입력해서 추가버튼을 누르면 추가되는 서비스
	 */
	public int lectureCreate(Lecture newLecture) throws Exception {
		return lectureDao.create(newLecture);
	}

	/*
	 * 사용자가 UI에서 삭제버튼을 누르면 해당 강의를 포함하여 해당 강의와 lectureNumber가 같은 강의들 모두 삭제
	 */
	public int lectureDeleteByLectureNumber(int lectureNumber) throws Exception {
		return lectureDao.deleteByLectureNumber(lectureNumber);
	}

	//	public List<Lecture> lectureDeleteByDetail() throws Exception {
	//		return lectureDao.deleteByDetail();
	//	}
	/*
	 * 사용자가 UI에서 강의정보를 수정하고 수정버튼을 누르면 해당 강의의 정보 수정 
	 */
	public int lectureUpdate(Lecture lecture) throws Exception {
		return lectureDao.updateByLectureNumber(lecture);
	}

	/*
	 * 사용자가 UI에서 강의를 누르면 해당 강의 정보가 나오는 서비스 
	 */
	public Lecture lectureSelectByLectureNumber(int lectureNumber) throws Exception {
		return lectureDao.selectByLectureNumber(lectureNumber);
	}

	/*
	 * 사용자가 UI에서 강의 전체보기를 누르면 현재 추가되어있는 전체 강의를 볼 수 있는 서비스
	 */
	public List<Lecture> lectureSelectAll() throws Exception {
		return lectureDao.selectAll();
	}

	public int selectMaxLectureNumber() throws Exception {
		return lectureDao.selectMaxLectureNumber();
	}
}
