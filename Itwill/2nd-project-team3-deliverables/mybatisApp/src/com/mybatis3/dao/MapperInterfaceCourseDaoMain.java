package com.mybatis3.dao;


import java.util.Date;

import com.mybatis3.domain.Course;
import com.mybatis3.domain.Tutor;

public class MapperInterfaceCourseDaoMain {

	public static void main(String[] args) {
		MapperInterfaceCourseDao courseDao = new MapperInterfaceCourseDao();
		Tutor tutor = new Tutor(2);
		Course course = new Course(9, "java", "java", new Date(), new Date() , tutor);
		System.out.println(courseDao.createCourse(course));

	}

}
