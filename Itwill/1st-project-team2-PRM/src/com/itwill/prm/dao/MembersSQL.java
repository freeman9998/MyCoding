package com.itwill.prm.dao;

public class MembersSQL {
	public static final String MEMBERS_INSERT=
			"insert into members values(?,?,sysdate,?,?,?,?,?,?)";
	
	public static final String MEMBERS_UPDATE=
			"update members set member_id =?,member_password=? where member_no=?";
	
	public static final String MEMBERS_DELETE=
			"delete members where member_no=?";
	
	public static final String MEMBERS_SELECT_NO=
			"select * from members where member_no=?";
	
	public static final String MEMBERS_SELECT_ID=
			"select * from members where member_id=?";
	
	public static final String MEMBERS_SELECT_ALL=
			"select * from members";

}





