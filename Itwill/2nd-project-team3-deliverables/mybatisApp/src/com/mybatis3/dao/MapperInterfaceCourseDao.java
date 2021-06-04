package com.mybatis3.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis3.dao.mapper.CourseMapper;
import com.mybatis3.domain.Course;

public class MapperInterfaceCourseDao {
	private SqlSessionFactory sqlSessionFactory;
	public MapperInterfaceCourseDao() {
		try {
			InputStream mybatisConfigInputStream = Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int createCourse(Course course) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
		int count = courseMapper.createCourse(course);
		return count;
	}
	
}









