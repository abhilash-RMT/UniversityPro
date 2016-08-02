package com.raremile.universitypro.handlers;

public interface Student {
	public void addStudent(int studentID,String studentName);
	
	public void removeStudent(int studentID);
	
	public void generateStudentReport(int studentID);

}
