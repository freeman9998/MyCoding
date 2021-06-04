package com.itwill.timetable.service;

import java.util.ArrayList;
import java.util.List;
import com.itwill.timetable.dao.SettingDao;
import com.itwill.timetable.vo.Setting;

public class SettingService {
	private SettingDao settingDao;

	public SettingService() {
		settingDao = new SettingDao();
	}

	public int update(String str) throws Exception {
		return settingDao.update(str);
	}

	public String getTime24() throws Exception {
		return settingDao.getTime24();
	}

}
