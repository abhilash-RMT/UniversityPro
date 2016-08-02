package com.raremile.universitypro.handlers;

public interface Course {
	public void addCourse(int courseID, String CourseName);
	
	public void removeCourse(int courseID);
	
	public void generateCourseReport(int courseID);

}
