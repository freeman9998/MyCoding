package com.itwill.prm.dao;
/*
이름        널?       유형           
--------- -------- ------------ 
DEPT_NO   NOT NULL NUMBER(10)   
DEPT_NAME NOT NULL VARCHAR2(40) 

*/
public class DepartmentsSQL {
	
	public static final String Departments_INSERT=
			"insert into departments(dept_no, dept_name) values(?, ?)";
	
	public static final String Departments_UPDATE=
			"update departments set dept_no=?, dept_name=?";
	
	public static final String Departments_DELETE=
			"delete departments where dept_no=?";
	
	public static final String Departments_SELECT_NO=
			"select dept_no, dept_name from departments where dept_no=?";
	
	public static final String Departments_SELECT_ALL=
			"select dept_no, dept_name from departments";
	
	public static final String Departmnets_SELECT_MEMBER_NO=
			"select d.dept_no,d.dept_name from departments d join members m on d.dept_no=m.dept_no where m.member_no=?";
}
