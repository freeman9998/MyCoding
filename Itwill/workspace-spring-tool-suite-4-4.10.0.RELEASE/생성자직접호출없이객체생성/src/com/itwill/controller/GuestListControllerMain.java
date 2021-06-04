package com.itwill.controller;

public class GuestListControllerMain {

	public static void main(String[] args) throws Exception{
		//GuestListController guestListController=new GuestListController();
		Class clazz=Class.forName("com.itwill.controller.GuestListController");
		Object object = clazz.newInstance();
		
	}

}
