package com.attedance;

// this class file includes all the data displayed 

//Note We have 
/* 
 * Course class in Course.java file
 * Unit class in Unit.java file
 * Student in Student.java file
 * */


//this class will help manage our data and query them anywhere
public class Data {
	//used in addUnitDialog.java , AddStudentDilaog Page and also HomePage
	static Course[] courses = {
		new Course("1", "Cs level 6"),
		new Course("1", "ICt level 6"),
		new Course("1", "Cs level 5"),
		new Course("1", "ICts level 5"),
		new Course("1", "Cs level 6")
	};
	
	//this data is used in Home page
	
	static Unit[] units = {
			new Unit("1", " numeracy", courses[0]),
			new Unit("1", " digital", courses[0]),
			new Unit("1", " Database", courses[0]),
			new Unit("1", " communacation", courses[0]),
			new Unit("1", " Artificial intelligence", courses[0]),
			new Unit("1", " web design", courses[0]),
			new Unit("1", " Networking", courses[0]),
			new Unit("1", " Basic electronics", courses[0]),
	};
	
	//this data is used in homepage
	static Student[] students = {
			new Student("2023R001", "Amos gitau" , courses[0]),
			new Student("2023R002", "peter g" , courses[1]),
			new Student("2023R003", "clinton t" , courses[2]),
			new Student("2023R004", "simpiri" , courses[0]),
			new Student("2023R005", "Gloria" , courses[3]),
			new Student("2023R006", "Tiffany" , courses[2]),
			new Student("2023R007", "clinton t" , courses[0]),
			new Student("2023R008", "simpiri" , courses[1]),
			new Student("2023R009", "Gloria" , courses[3]),
			new Student("2023R010", "Tiffany" , courses[3]),
			new Student("2023R011", "Gloria" , courses[2]),
			new Student("2023R012", "Tiffany" , courses[0]),
			
	};
	
	//not yet used but shows a model to be used to query And save data in Database
	static Attedance[] attedances = {
			new Attedance("1", students[0].course, units[0], students[0] ),//
			new Attedance("2", students[0].course, units[0], students[0] ),
			new Attedance("3", students[0].course, units[0], students[0] ),
			new Attedance("3", students[0].course, units[0], students[0] ),
			new Attedance("4", students[0].course, units[0], students[0] ),
			new Attedance("5", students[0].course, units[0], students[0] ),
			
	};
	
	//my Suggestion is that 
	//we will have the following
	/* 
	 * tables - user
	 *        - Course
	 *        - unit
	 *        - students
	 *        
	 *        - attendance
	 *
	 *each table will have columns some as the fields defined in there class eg Course - have id, and name 
	 *
	 *attendance (Columns) - id
	 *                     - student id
	 *                     - student name
	 *                     - course
	 *                     - Date - this is the major column that will be created each an every day a user wants to mark attendance of unit
	 * */
	

	


}
