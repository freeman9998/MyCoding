package com.itwill.dao;

import java.sql.Date;

public class BookMemberSQL {
	
	public static final String MEMBER_INSERT=
	"INSERT INTO bookmember(member_id,member_password,member_name,member_birthday,member_phone_1,member_phone_2,member_phone_3,member_email_1,member_email_2,member_regdate,member_count,member_penalty) values(?,?,?,?,?,?,?,?,?,sysdate,?,?)";
	public static final String MEMBER_UPDATE=
	"update bookmember set member_password=?,member_phone_1=?, member_phone_2=?, member_phone_3=?, member_email_1=?, member_email_2=?where member_id=?";
	public static final String MEMBER_DELETE=
	"delete bookmember where member_id=?";
	public static final String MEMBER_SELECT_ID=
	"select member_id, member_password, member_name, member_email_1, member_email_2, member_phone_1, member_phone_2, member_phone_3, "
	+ "member_birthday, member_regdate, member_count, member_penalty from bookmember where member_id=?";
	public static final String MEMBER_SELECT_ALL=
	"select member_id, member_password, member_name, member_email_1, member_email_2, member_phone_1, member_phone_2, member_phone_3,"
	+ "member_birthday, member_regdate, member_count, member_penalty from bookmember";
	
	//멤버 카운터를 바꾸는 SQL문
	public static final String MEMBER_UPDATE_COUNT=
	"update bookmember set member_count=? where member_id=?";
}
