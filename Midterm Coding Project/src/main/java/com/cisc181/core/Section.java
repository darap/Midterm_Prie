package com.cisc181.core;
import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(){
		
	}
	
	public Section(UUID CourseID, UUID SemesterID, UUID SectionID){
		this.CourseID=CourseID;
		this.SemesterID=SemesterID;
		this.SectionID=UUID.randomUUID();
		this.RoomID=RoomID;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}

}
