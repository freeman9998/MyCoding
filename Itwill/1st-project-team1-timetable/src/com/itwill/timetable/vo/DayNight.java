package com.itwill.timetable.vo;

public enum DayNight {
	DAY, NIGHT;

	public static DayNight getLecturTime(String text) {
		if (text.contains("주간"))
			return DAY;
		if (text.contains("야간")) {
			return NIGHT;
		}
		return null;
	}
}

/*
 * Location:
 * D:\Downloads\pknutimetable-r31\pknutimetable-r31.jar!\data\DayNight.class
 * Java compiler version: 6 (50.0) JD-Core Version: 0.7.1
 */