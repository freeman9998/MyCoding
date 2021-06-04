
package com.itwill.prm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.prm.vo.Departments;

/*
Dao(Data Access Object)
 - 회원들의 데이터를 저장하고있는 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위메쏘드를 가지고있는 클래스
 - MemberService객체 의 요청(메쏘드호출)을 받아서 
   Data Access(File, DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */
public class DepartmentsDao {

	public int create(Departments departments) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(DepartmentsSQL.Departments_INSERT);
		
		pstmt.setInt(1, departments.getDept_no());
		pstmt.setString(2, departments.getDept_name());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public Departments selectByNo(int dept_no) throws Exception {
		Departments departments = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(DepartmentsSQL.Departments_SELECT_NO);
		
		pstmt.setInt(1, dept_no);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			departments = new Departments(rs.getInt("dept_no"),
										  rs.getString("dept_name")
										  );
		}
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return departments;
	}

	public List<Departments> selectAll() throws Exception {
		ArrayList<Departments> departmentsList = new ArrayList<Departments>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(DepartmentsSQL.Departments_SELECT_ALL);

		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			departmentsList.add(new Departments(rs.getInt("dept_no"),
												rs.getString("dept_name")
												));

		}
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return departmentsList;
	}

	public int deleteByNo(int dept_no) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(DepartmentsSQL.Departments_DELETE);
		
		pstmt.setInt(1, dept_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public int updateByNo(Departments departments) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(DepartmentsSQL.Departments_UPDATE);
		
		pstmt.setInt(1, departments.getDept_no());
		pstmt.setString(2, departments.getDept_name());
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	public Departments selectDeptMemberNo(int member_no) throws Exception {
		Departments findDept = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(DepartmentsSQL.Departmnets_SELECT_MEMBER_NO);
		pstmt.setInt(1, member_no);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			findDept = new Departments(rs.getInt("dept_no"),
									   rs.getString("dept_name")
									  );
		}
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return findDept;
	}

}