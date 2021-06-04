package com.itwill06.collection.student;

import java.util.Comparator;

public class NameAscComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
