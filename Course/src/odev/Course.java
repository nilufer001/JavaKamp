package odev;

import java.sql.Date;

public class Course {
	
	
int id ;
String CourseName;
String StartDate;
String FinishDate;
String  TeacherName;
public Course() {
	//Constrryctýr (yapýcý )
	//System.out.println("Ben bu kursa baþlayacaðým  ");
	
}

public Course(int id, String courseName, String startDate,String finishDate,String teacherName) {
	
	this.id=id;
	this.CourseName=courseName;
	this.StartDate=startDate;
	this.FinishDate=finishDate;
	this.TeacherName=teacherName;
	
}
}