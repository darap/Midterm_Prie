package com.cisc181.core;
 
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.UUID;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;


public class Student_Test {
	
	static double GPA;
	static ArrayList<Course> CoursesL;
	static ArrayList<Semester> SemestersL;
	static ArrayList<Section> SectionsL;
	static ArrayList<Student> StudentsL;
	static ArrayList<Enrollment> EnrollmentsL;

	@BeforeClass
	public static void setup() throws Exception{
		CourseL=new ArrayList<Course>();
		CourseL.add(new Course (UUID.randomUUID(),"CHEM101",4, eMajor.CHEM));
		CourseL.add(new Course (UUID.randomUUID(),"CHEM102",4, eMajor.NURSING));
		CourseL.add(new Course (UUID.randomUUID(),"BIO101",4, eMajor.PHYSICS));
		
		SemesterL=new ArrayList<Semester>();
		SemesterL.add(new Semester (UUID.randomUUID(),new Date(1), new Date(2)));
		SemesterL.add(new Semester (UUID.randomUUID(),new Date(1), new Date(2)));
		
		//OTHER SECTION??
		SectionL=new ArrayList<Section>();
		SectionL.add(new Section (CourseL.get(0).getCourseID(), UUID.randomUUID(), 001));
		SectionL.add(new Section (CourseL.get(1).getCourseID(), UUID.randomUUID(), 002));
		SectionL.add(new Section (CourseL.get(2).getCourseID(), UUID.randomUUID(), 003));
		//SectionL.add
		//SectionL.add
		//SectionL.add
		
		StudentL = new ArrayList<Student>();
		StudentL.add(new Student ("FN1", "MN1", "LN1", new Date(0), eMajor.BUSINESS, "101 Malley RD", 
				"(000)-000-0001", "FN1@gmail.com"));
		StudentL.add(new Student ("FN2", "MN2", "LN2", new Date(0), eMajor.COMPSI, "102 Malley RD", 
				"(000)-000-0002", "FN2@gmail.com"));
		StudentL.add(new Student ("FN3", "MN3", "LN3", new Date(0), eMajor.CHEM, "103 Malley RD", 
				"(000)-000-0003", "FN3@gmail.com"));
		StudentL.add(new Student ("FN4", "MN4", "LN4", new Date(0), eMajor.PHYSICS, "104 Malley RD", 
				"(000)-000-0004", "FN4@gmail.com"));
		StudentL.add(new Student ("FN5", "MN5", "LN5", new Date(0), eMajor.NURSING, "105 Malley RD", 
				"(000)-000-0005", "FN5@gmail.com"));
		StudentL.add(new Student ("FN6", "MN6", "LN6", new Date(0), eMajor.BUSINESS, "106 Malley RD", 
				"(000)-000-0006", "FN6@gmail.com"));
		StudentL.add(new Student ("FN7", "MN7", "LN7", new Date(0), eMajor.COMPSI, "107 Malley RD", 
				"(000)-000-0007", "FN7@gmail.com"));
		StudentL.add(new Student ("FN8", "MN8", "LN8", new Date(0), eMajor.CHEM, "108 Malley RD", 
				"(000)-000-0008", "FN8@gmail.com"));
		StudentL.add(new Student ("FN9", "MN9", "LN9", new Date(0), eMajor.PHYSICS, "109 Malley RD", 
				"(000)-000-0009", "FN9@gmail.com"));
		StudentL.add(new Student ("FN10", "MN10", "LN10", new Date(0), eMajor.NURSING, "110 Malley RD", 
				"(000)-000-0010", "FN10@gmail.com"));

	}

	@Test
	public void TestEnroll() {
		//With AssertEquals??
		ArrayList<Enrollment> EnrollL = new ArrayList<Enrollment>();
		for (Student s : StudentL) {
		EnrollL.add(new Enrollment(StudentL.getStudentID(), SectionL.getSectionID()).setGrade(3.0)); 
	}
	}
	
	@Test
	public void TestMajorChange(){
		StudentL.get(0).setMajor(eMajor.CHEM);
		assertEquals(StudentL.get(0).getMajor(), eMajor.CHEM);

	}
		
}