package com.itwill.timetable.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.timetable.vo.Report;
import com.itwill.timetable.vo.Time;

public class TimeDao {

   public int create(Time time) throws Exception {
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement pstmt = con.prepareStatement(TimeSQL.TIME_INSERT);
      pstmt.setInt(1, time.getLectureNumber());
      pstmt.setString(2, time.getDay());
      pstmt.setString(3, time.getStartTime());
      pstmt.setString(4, time.getEndTime());
      int rowCount = pstmt.executeUpdate();
      pstmt.close();
      ConnectionFactory.releaseConnection(con);

      return rowCount;
   }

   // lectureNumber로 가져오기
   public List<Time> selectByLectureNumber(int lectureNumber) throws Exception {
      ArrayList<Time> timeListByLectureNumber = new ArrayList<Time>();
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement pstmt = con.prepareStatement(TimeSQL.TIME_SELECT_BY_LECTURENUMBER);
      pstmt.setInt(1, lectureNumber);
      ResultSet rs = pstmt.executeQuery();

      while (rs.next()) {
         timeListByLectureNumber.add(new Time(rs.getInt("lectureNumber"), rs.getString("day"),
               rs.getString("startTime"), rs.getString("endTime")));
      }
      pstmt.close();
      ConnectionFactory.releaseConnection(con);
      return timeListByLectureNumber;
   }

   // 전부다 가져오기
   public List<Time> selectAll() throws Exception {
      ArrayList<Time> timeList = new ArrayList<Time>();
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement pstmt = con.prepareStatement(TimeSQL.TIME_SELECT_ALL);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
         timeList.add(new Time(rs.getInt("LectureNumber"), rs.getString("Day"), rs.getString("StartTime"),
               rs.getString("EndTime")));
      }
      pstmt.close();
      ConnectionFactory.releaseConnection(con);
      return timeList;
   }

   // lectureNumber로 삭제하기
   public int deleteByLectureNumber(int lectureNumber) throws Exception {
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement pstmt = con.prepareStatement(TimeSQL.TIME_DELETE_BY_LECTURENUMBER);
      pstmt.setInt(1, lectureNumber);
      int rowCount = pstmt.executeUpdate();
      pstmt.close();
      ConnectionFactory.releaseConnection(con);
      return rowCount;
   }

   // 수정하기
   public int update(Time time) throws Exception {
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement pstmt = con.prepareStatement(ReportSQL.REPORT_UPDATE);
      pstmt.setString(1, time.getDay());
      pstmt.setString(2, time.getStartTime());
      pstmt.setString(3, time.getEndTime());
      pstmt.setInt(4, time.getLectureNumber());
      int rowCount = pstmt.executeUpdate();
      pstmt.close();
      ConnectionFactory.releaseConnection(con);
      return rowCount;
   }

}