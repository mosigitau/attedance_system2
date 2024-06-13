package com.attedance;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Attedance {
     String id;
     Course course;
     Unit unit;
     Student student;
     String date;
	public Attedance(String id,Course course, Unit unit, Student student) {
	
		this.id = id;
		this.unit = unit;
		this.student = student;
		this.course = course;
		
		this.date = getCurrentDate();
		
	}
     
	public String getCurrentDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd HH:mm:ss");
		Date currentDate = new Date();
		return dateFormat.format(currentDate);
	}
}
