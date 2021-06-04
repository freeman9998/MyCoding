package com.itwill.timetable.dao;

public class SettingSQL {
	public static final String SETTING_INSERT = "INSERT INTO setting (time24) VALUES (?)";

	public static final String SETTING_UPDATE = "UPDATE setting SET time24 = ?";
	
	public static final String SETTING_SELECT = "SELECT * from setting";
}
