package com.mybatis3.dao;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis3.dao.mapper.StudentMapper;
import com.mybatis3.domain.Student;

public class MapperInterfaceStudentDao {
	private SqlSessionFactory sqlSessionFactory;
	public static final String NAMESPACE="com.mybatis3.dao.mapper.StudentMapper.";
	public MapperInterfaceStudentDao() {
		try {
			InputStream mybatisConfigInputStream = 
					Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = 
					sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 resultType Dto 
	*/
	public Student findStudentById(Integer studId) {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
		Student findStudent=
				studentMapper.findStudentById(studId);
		sqlSession.close();
		return findStudent;
	}
	public List<Student> findAllStudents() {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
		List<Student> studentList=studentMapper.findAllStudents();
		sqlSession.close();
		return studentList;
	}
	
	
	
}
