package com.attedance;

public enum AppData {
	
  APP_NAME("AT Management System"),
  APP_USERNAME("mosi"),
  App_password("admin123");

	final String myData;
	
	AppData(String pass) {
		this.myData = pass;
	}
	//APPData.APP_NAME.myData
}
