package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment(){
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID){
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public UUID getStudentID(){
		return StudentID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public UUID getEnrollmentID(){
		return EnrollmentID;
	}
	
	public double getGrade(){
		return Grade;
	}
	
	public void SetGrade(double Grade){
		this.Grade=Grade;
	}

}
