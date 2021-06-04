package com.itwill.timetable.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.timetable.dao.ConnectionFactory;
import com.itwill.timetable.dao.TimetableSQL;
import com.itwill.timetable.vo.lecture;

//L_lectureLoc,L_lectureRoom,L_teacher,L_date,L_time

public class TimetableDao {
// 뭘로 강의를 구분할 것인지 강의를 추가할때 마다 id값을 줄 것인지
	public int create(lecture lecture) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(TimetableSQL.lecture_INSERT);
		pstmt.setString(1, lecture.getL_lectureLoc());
		pstmt.setString(2, lecture.getL_lectureRoom());
		pstmt.setString(3, lecture.getL_teacher());
		pstmt.setDate(0, null);
		pstmt.setTime(0, null);
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public int delete(String m_id) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(TimetableSQL.lecture_DELETE);
		pstmt.setString(1, m_id);
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public int update(lecture lecture) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(TimetableSQL.lecture_UPDATE);
		pstmt.setString(1, lecture.getL_lectureLoc());
		pstmt.setString(2, lecture.getL_lectureRoom());
		pstmt.setString(3, lecture.getL_teacher());
		pstmt.setDate(0, null);
		pstmt.setTime(0, null);
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}


}