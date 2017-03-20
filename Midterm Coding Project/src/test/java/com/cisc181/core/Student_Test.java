package com.cisc181.core;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import java.util.List;

public class Student_Test {
	
	//None of the elements of the lists are being added?
	
	static double GPA;
	static ArrayList<Course> CoursesL= new ArrayList<Course>();
	static Course Course1;
	static Course Course2;
	static Course Course3;
	
	static ArrayList<Semester> SemestersL= new ArrayList<Semester>();
	static Semester FallSemester;
	static Semester SpringSemester;
	
	static ArrayList<Section> SectionsL= new ArrayList<Section>();
	// C means Course, FS is FallSmester, SS is Spring Semester
	static Section Section1C1FS;
	static Section Section2C1SS;
	static Section Section1C2FS;
	static Section Section2C2SS;
	static Section Section1C3FS;
	static Section Section2C3SS;
	
	static ArrayList<Student> StudentsL=new ArrayList<Student>();
	static Student Student1;
	static Student Student2;
	static Student Student3;
	static Student Student4;
	static Student Student5;
	static Student Student6;
	static Student Student7;
	static Student Student8;
	static Student Student9;
	static Student Student10;
	
	static ArrayList<Enrollment> EnrollmentsL=new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() throws Exception{
		Course1=(new Course (UUID.randomUUID(),"CHEM101",4, eMajor.CHEM));
		Course2=(new Course (UUID.randomUUID(),"CHEM102",4, eMajor.NURSING));
		Course3=(new Course (UUID.randomUUID(),"BIO101",4, eMajor.PHYSICS));
		CourseL.add(Course1);
		CourseL.add(Course2);
		CourseL.add(Course3);
		
		FallSemester=(new Semester (UUID.randomUUID(),new Date(1), new Date(2)));
		SpringSemester=(new Semester (UUID.randomUUID(),new Date(3), new Date(4)));
		SemesterL.add(FallSemester);
		SemesterL.add(SpringSemester);
		
		//6 SECTION??
		Section1C1FS=(new Section (Course1.get(0).getCourseID(), UUID.randomUUID(), 001));
		Section2C1SS=(new Section (Course1.get(0).getCourseID(), UUID.randomUUID(), 002));
		Section1C2FS=(new Section (Course2.get(0).getCourseID(), UUID.randomUUID(), 003));
		Section2C2SS=(new Section (Course2.get(0).getCourseID(), UUID.randomUUID(), 004));
		Section1C3FS=(new Section (Course3.get(0).getCourseID(), UUID.randomUUID(), 005));
		Section2C3SS=(new Section (Course3.get(0).getCourseID(), UUID.randomUUID(), 006));
		SectionL.add(Section1C1FS);
		SectionL.add(Section2C1SS);
		SectionL.add(Section1C2FS);
		SectionL.add(Section2C2SS);
		SectionL.add(Section1C3FS);
		SectionL.add(Section2C3SS);
		
		Student1=(new Student ("FN1", "MN1", "LN1", new Date(0), eMajor.BUSINESS, "101 Malley RD", 
				"(000)-000-0001", "FN1@gmail.com"));
		Student2=(new Student ("FN2", "MN2", "LN2", new Date(0), eMajor.COMPSI, "102 Malley RD", 
				"(000)-000-0002", "FN2@gmail.com"));
		Student3=(new Student ("FN3", "MN3", "LN3", new Date(0), eMajor.CHEM, "103 Malley RD", 
				"(000)-000-0003", "FN3@gmail.com"));
		Student4=(new Student ("FN4", "MN4", "LN4", new Date(0), eMajor.PHYSICS, "104 Malley RD", 
				"(000)-000-0004", "FN4@gmail.com"));
		Student5=(new Student ("FN5", "MN5", "LN5", new Date(0), eMajor.NURSING, "105 Malley RD", 
				"(000)-000-0005", "FN5@gmail.com"));
		Student6=(new Student ("FN6", "MN6", "LN6", new Date(0), eMajor.BUSINESS, "106 Malley RD", 
				"(000)-000-0006", "FN6@gmail.com"));
		Student7=(new Student ("FN7", "MN7", "LN7", new Date(0), eMajor.COMPSI, "107 Malley RD", 
				"(000)-000-0007", "FN7@gmail.com"));
		Student8=(new Student ("FN8", "MN8", "LN8", new Date(0), eMajor.CHEM, "108 Malley RD", 
				"(000)-000-0008", "FN8@gmail.com"));
		Student9=(new Student ("FN9", "MN9", "LN9", new Date(0), eMajor.PHYSICS, "109 Malley RD", 
				"(000)-000-0009", "FN9@gmail.com"));
		Student10=(new Student ("FN10", "MN10", "LN10", new Date(0), eMajor.NURSING, "110 Malley RD", 
				"(000)-000-0010", "FN10@gmail.com"));
		
		StudentL.add(Student1);
		StudentL.add(Student2);
		StudentL.add(Student3);
		StudentL.add(Student4);
		StudentL.add(Student5);
		StudentL.add(Student6);
		StudentL.add(Student7);
		StudentL.add(Student8);
		StudentL.add(Student9);
		StudentL.add(Student10);

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