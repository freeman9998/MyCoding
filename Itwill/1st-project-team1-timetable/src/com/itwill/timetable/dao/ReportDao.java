package com.itwill.timetable.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.timetable.vo.Report;

public class ReportDao {
	public int create(Report report) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReportSQL.REPORT_INSERT);
		pstmt.setInt(1, report.getLectureNumber());
		pstmt.setString(2, report.getReportName());
		pstmt.setDate(3, report.getTimeLimit());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public List<Report> selectByLectureNumber(int lectureNumber) throws Exception {
		ArrayList<Report> reportListByLectureNumber = new ArrayList<Report>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReportSQL.REPORT_SELECT_LECTURE);
		pstmt.setInt(1, lectureNumber);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			reportListByLectureNumber.add(new Report(rs.getInt("lectureNumber"), rs.getInt("reportNumber"),
					rs.getString("reportName"), rs.getDate("timeLimit")));
		}
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return reportListByLectureNumber;
	}

	public List<Report> selectAll() throws Exception {
		ArrayList<Report> reportList = new ArrayList<Report>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReportSQL.REPORT_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			reportList.add(new Report(rs.getInt("lectureNumber"), rs.getInt("reportNumber"), rs.getString("reportName"),
					rs.getDate("timeLimit")));
		}
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return reportList;
	}

	public int delete(int reportNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReportSQL.REPORT_DELETE);
		pstmt.setInt(1, reportNumber);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;

	}

	public int deleteByLectureNumber(int lectureNumber) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReportSQL.REPORT_DELETE_BY_LECTURENUMBER);
		pstmt.setInt(1, lectureNumber);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public int update(Report report) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReportSQL.REPORT_UPDATE);
		pstmt.setString(1, report.getReportName());
		pstmt.setDate(2, report.getTimeLimit());
		pstmt.setInt(3, report.getReportNumber());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

}
