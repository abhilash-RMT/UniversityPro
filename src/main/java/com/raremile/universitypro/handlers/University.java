package com.raremile.universitypro.handlers;

public interface University {
	public void addUniversity(int UniversityID,String UniversityName);
	
	public void removeUniversity(int UniversityID);
	
	public void updateUniversity(int UniversityID,String newUniversityName);
	
	public void generateUniversityReport(int UniversityID);

}
