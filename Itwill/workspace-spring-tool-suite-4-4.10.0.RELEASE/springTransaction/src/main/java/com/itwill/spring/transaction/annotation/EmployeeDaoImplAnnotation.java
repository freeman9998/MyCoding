package com.itwill.spring.transaction.annotation;

import java.sql.*;
import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

import com.itwill.spring.transaction.Employee;
@Repository
public class EmployeeDaoImplAnnotation implements EmployeeDaoAnnotation {
	@Autowired
	private SqlSession sqlSession;
	
	public final static String NAMESPACE=
			"com.itwill.spring.transaction.EmployeeMapper.";
	

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void insert(Employee emp){
		sqlSession.insert(NAMESPACE+"insert", emp);
	}

	@Override
	public void update(Employee emp) {
		sqlSession.update(NAMESPACE+"update", emp);
	}

	@Override
	public void delete(int idx) {
		sqlSession.delete(NAMESPACE+"delete", idx);
	}

	@Override
	public List<Employee> list() {
		return sqlSession.selectList(NAMESPACE+"list");
	}

	@Override
	public Employee getPerson(int idx) {
		return sqlSession.selectOne(NAMESPACE+"getPerson",idx);
	}

	@Override
	public void increaseSalary(Map map) {
		sqlSession.update(NAMESPACE+"increaseSalary",map);
	}



}
