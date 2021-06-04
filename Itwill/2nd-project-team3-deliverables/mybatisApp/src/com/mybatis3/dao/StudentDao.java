package com.mybatis3.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.core.lookup.LowerLookup;

import com.mybatis3.domain.Student;

public class StudentDao {
	private SqlSessionFactory sqlSessionFactory;
	public static final String NAMESPACE="com.mybatis3.dao.mapper.StudentMapper.";
	public StudentDao() {
		try {
			InputStream mybatisConfigInputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*@@@@@@@@@@@@@@@@@@@@@@@SELECT JOIN[students + addresses]@@@@@@@@@@@@@@@@@@@@@@@@@*/
	public Student findStudentByIdWithAddress(Integer studId) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		Student findStudent = sqlSession.selectOne(NAMESPACE+"findStudentByIdWithAddress",studId);
		sqlSession.close();
		return findStudent;
	}	
	/*@@@@@@@@@@@@@@@@@@@@@@@SELECT JOIN[students + courses]@@@@@@@@@@@@@@@@@@@@@@@@@*/
	public Student findStudentByIdWithCourses(Integer studId) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		Student findStudent = sqlSession.selectOne(NAMESPACE+"findStudentByIdWithCourses",studId);
		sqlSession.close();
		return findStudent;
	}
	/*@@@@@@@@@@@@@@@@@@@@@@@UPDATE@@@@@@@@@@@@@@@@@@@@@@@@@*/
	public int updateStudentById(Student student) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		int rowCount = sqlSession.insert(NAMESPACE+"updateStudentById",student);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}
	/*@@@@@@@@@@@@@@@@@@@@@@@DELETE@@@@@@@@@@@@@@@@@@@@@@@@@*/
	public int deleteStudentById(Integer studId) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		int rowCount = sqlSession.insert(NAMESPACE+"deleteStudentById",studId);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}
	public int deleteStudentByName(String name) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		int rowCount = sqlSession.insert(NAMESPACE+"deleteStudentByName",name);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}
	public int deleteStudentByNameLike(String name) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		int rowCount = sqlSession.insert(NAMESPACE+"deleteStudentByNameLike",name);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}
	/*@@@@@@@@@@@@@@@@@@@@@@@INSERT@@@@@@@@@@@@@@@@@@@@@@@@@*/
	public int insertStudent(Student student) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		int rowCount = sqlSession.insert(NAMESPACE+"insertStudent",student);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}
	public int insertStudentBySequence1(Student student) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		int rowCount = sqlSession.insert(NAMESPACE+"insertStudentBySequence1",student);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}
	public int insertStudentBySequence2(Student student) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		int rowCount = sqlSession.insert(NAMESPACE+"insertStudentBySequence2",student);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}
	/*@@@@@@@@@@@@@@@@@@@@@@@SELECT@@@@@@@@@@@@@@@@@@@@@@@@@*/
	/*
	 * resultMap
	 */
	public Student findStudentByIdResultMap(Integer studId) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		Student findStudent = sqlSession.selectOne(NAMESPACE+"findStudentById",studId);
		sqlSession.close();
		return findStudent;
	}
	public List<Student> findAllStudentsResultMap() {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		List<Student> studentList = sqlSession.selectList(NAMESPACE+"findAllStudents");
		sqlSession.commit();
		sqlSession.close();
		return studentList;
	}
	/*
	 * resultType Dto
	 */
	public Student findStduentById(Integer studId) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		Student findStudent = sqlSession.selectOne(NAMESPACE+"findStudentById",studId);
		sqlSession.close();
		return findStudent;
	}
	public List<Student> findAllStudents() {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		List<Student> studentList = sqlSession.selectList(NAMESPACE+"findAllStudents");
		sqlSession.commit();
		sqlSession.close();
		return studentList;
	}
	public List<Student> findAllOrderdStudents(String columnName) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		List<Student> studentList = sqlSession.selectList(NAMESPACE+"findAllOrderdStudents",columnName);
		sqlSession.commit();
		sqlSession.close();
		return studentList;
	}
	/*
	 * resultType Wrapper(String)
	 */
	public String findStudentNameById(Integer studId) {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		String studentName = sqlSession.selectOne(NAMESPACE+"findStudentNameById",studId);
		sqlSession.commit();
		sqlSession.close();
		return studentName;
	}
	public List<String> findStudentNameList() {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		List<String> studentNameList = sqlSession.selectList(NAMESPACE+"findStudentNameList");
		sqlSession.commit();
		sqlSession.close();
		return studentNameList;
	}
	/*
	 * resultType Map
	 */
	public Map findStudentByIdMap(Integer studId) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		Map studentMap = sqlSession.selectOne(NAMESPACE+"findStudentByIdMap", studId);
		sqlSession.close();
		return studentMap;
	}
	public List<Map> findAllStudentsMapList() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		List<Map> studentMapList = sqlSession.selectList(NAMESPACE+"findAllStudentsMapList");
		sqlSession.close();
		return studentMapList;
	}
	//@@@@@@@@ parameterType[java.util.Map,java.util.HashMap,map,hashmap] @@@@@@@@
	public List<Student> findStudentByIdRangeParamMap(HashMap idRangeMap) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Student> studentList = sqlSession.selectList(NAMESPACE+"findStudentByIdRangeParamMap",idRangeMap);
		sqlSession.close();
		return studentList;
	}
	
	public List<Student> findStudentsThreeParamMap(HashMap studentsMap) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Student> studentList = sqlSession.selectList(NAMESPACE+"findStudentsThreeParamMap",studentsMap);
		sqlSession.close();
		return studentList;
	}
	
}