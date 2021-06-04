package com.itwill.timetable.vo;
//작성자 : 김도형

public class Setting {
	private String time24;

	public Setting() {
		// TODO Auto-generated constructor stub
	}

	public Setting(String time24) {
		super();
		this.time24 = time24;
	}

	public String getTime24() {
		return time24;
	}

	public void setTime24(String time24) {
		this.time24 = time24;
	}

	@Override
	public String toString() {
		return "Setting [time24=" + time24 + "]";
	}
}
