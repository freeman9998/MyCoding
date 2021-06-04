package com.itwill.spring.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository("empDao")
public class EmployeeDaoImplJDBC implements EmployeeDao {
	@Autowired
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Employee emp){
		String insertSql = "INSERT INTO employee (id,name, email, phone) VALUES (employee_id_seq.nextval,?, ?, ?)";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getEmail());
			pstmt.setString(3, emp.getPhone());
			pstmt.executeUpdate();
			//con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Employee emp) {
		String updateSql="UPDATE employee SET name = ?, phone = ?, email = ? WHERE id = ?";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(updateSql);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getPhone());
			pstmt.setString(3, emp.getEmail());
			pstmt.setInt(4, emp.getId());
			pstmt.executeUpdate();
			//con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int idx) {
		String deleteSql="DELETE FROM employee WHERE id = ?";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(deleteSql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
			//con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> list() {
		String selectAllSql="SELECT id, name, email, phone, salary FROM employee ORDER BY id DESC";
		List<Employee> empList = new ArrayList<Employee>();
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(selectAllSql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				empList.add(new Employee(
							rs.getInt("id"),
							rs.getString("name"),
							rs.getString("email"), 
							rs.getString("phone"),
							rs.getInt("salary")));
			}
			//con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return empList;
	}

	@Override
	public Employee getPerson(int idx) {
		String selectSql="SELECT id, name, email, phone, salary FROM employee WHERE id = ?";
		Employee emp = null;
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(selectSql);
			pstmt.setInt(1, idx);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				emp=new Employee(idx,
						rs.getString("name"),
						rs.getString("email"), 
						rs.getString("phone"),
						rs.getInt("salary"));
			}else {
				emp=null;
			}
			//con.close();
		} catch (Exception ex) {
			emp = null;
			ex.printStackTrace();
		}
		return emp;
	
	}

	@Override
	public void increaseSalary(Map map) {
		String increaseSalaryUpdateSql="UPDATE employee SET salary = (salary + ?) WHERE id = ?";
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(increaseSalaryUpdateSql);
			pstmt.setInt(1, (int)map.get("salary"));
			pstmt.setInt(2, (int)map.get("id"));
			pstmt.executeUpdate();
			//con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
