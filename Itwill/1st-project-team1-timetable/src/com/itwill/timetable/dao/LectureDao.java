package com.itwill.timetable.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.timetable.vo.Lecture;

public class LectureDao {

	public int create(Lecture lecture) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(LectureSQL.LECTURE_INSERT);

		pstmt.setString(1, lecture.getLectureName());
		pstmt.setString(2, lecture.getLocation());
		pstmt.setInt(3, lecture.getColorR());
		pstmt.setInt(4, lecture.getColorG());
		pstmt.setInt(5, lecture.getColorB());

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;

	}

	public Lecture selectByLectureNumber(int lectureNumber) throws Exception {
		Lecture lecture = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(LectureSQL.LECTURE_SELECT_BY_LECTURENUMBER);
		pstmt.setInt(1, lectureNumber);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			lecture = new Lecture(rs.getInt("lectureNumber"), rs.getString("lectureName"), rs.getString("location"),
					rs.getInt("colorR"), rs.getInt("colorG"), rs.getInt("colorB"));
		}
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return lecture;
	}

	public List<Lecture> selectAll() throws Exception {
		ArrayList<Lecture> lectureList = new ArrayList<Lecture>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(LectureSQL.LECTURE_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			lectureList.add(new Lecture(rs.getInt("lectureNumber"), rs.getString("lectureName"),
					rs.getString("location"), rs.getInt("colorR"), rs.getInt("colorG"), rs.getInt("colorB")));
		}
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return lectureList;
	}

	public int deleteByLectureNumber(int lectureNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(LectureSQL.LECTURE_DELETE_BY_LECTURENUMBER);
		pstmt.setInt(1, lectureNumber);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	//	public List<Lecture> deleteByDetail() throws Exception {
	//		ArrayList<Lecture> lectureList = new ArrayList<Lecture>();
	//		Connection con = ConnectionFactory.getConnection();
	//		PreparedStatement pstmt=con.prepareStatement(LectureSQL.LECTURE_DELETE_BY_Detail);
	//		ResultSet rs = pstmt.executeQuery();
	//		while(rs.next()) {
	//			lectureList.add(
	//					new Lecture(
	//							rs.getInt("lectureNumber"),
	//							rs.getString("lectureName"),
	//							rs.getString("location"),
	//							rs.getInt("color")
	//							));
	//		}
	//		pstmt.close();
	//		ConnectionFactory.releaseConnection(con);
	//		return lectureList;
	//	}

	public int updateByLectureNumber(Lecture lecture) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(LectureSQL.LECTURE_UPDATE);
		pstmt.setString(1, lecture.getLectureName());
		pstmt.setString(2, lecture.getLocation());
		pstmt.setInt(3, lecture.getColorR());
		pstmt.setInt(4, lecture.getColorG());
		pstmt.setInt(5, lecture.getColorB());
		pstmt.setInt(6, lecture.getLectureNumber());
		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public int selectMaxLectureNumber() throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(LectureSQL.LECTURE_SELECT_MAX_LECTURENUMBER);
		ResultSet rs = pstmt.executeQuery();
		int max_lec_no = 0;
		if (rs.next()) {

			max_lec_no = rs.getInt("max_lec_no");
		}
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return max_lec_no;
	}

}
