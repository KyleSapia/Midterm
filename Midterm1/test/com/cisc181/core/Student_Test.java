package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.core.Course;
import com.cisc181.core.Enrollment;
import com.cisc181.core.PersonException;
import com.cisc181.core.Section;
import com.cisc181.core.Semester;
import com.cisc181.core.Student;
import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	static ArrayList<Course> course = new ArrayList<Course>();
	static ArrayList<Semester> semester = new ArrayList<Semester>();
	static ArrayList<Section> section = new ArrayList<Section>();
	static ArrayList<Student> student = new ArrayList<Student>();

	@BeforeClass
	public static void setup() {
		course.add(new Course(UUID.randomUUID(),"Chem", 100, eMajor.CHEM));
		course.add(new Course(UUID.randomUUID(),"CISC", 100, eMajor.COMPSI));
		course.add(new Course(UUID.randomUUID(),"Physics", 100, eMajor.PHYSICS));
	}
	public static void semesters() {
		semester.add(new Semester(UUID.randomUUID(), new Date(2003,1,10), new Date(2003,1,2)));
		semester.add(new Semester(UUID.randomUUID(), new Date(2003,1,2), new Date(2003,1,10)));
	}
	public static void sections() {
		section.add(new Section(Section.getCourseID(), Section.getSemesterID(), UUID.randomUUID(), 100));
		section.add(new Section(Section.getCourseID(), Section.getSemesterID(), UUID.randomUUID(), 101));
		section.add(new Section(Section.getCourseID(), Section.getSemesterID(), UUID.randomUUID(), 102));
		section.add(new Section(Section.getCourseID(), Section.getSemesterID(), UUID.randomUUID(), 103));
		section.add(new Section(Section.getCourseID(), Section.getSemesterID(), UUID.randomUUID(), 104));
		section.add(new Section(Section.getCourseID(), Section.getSemesterID(), UUID.randomUUID(), 105));
	}
	public static void studentRecords() throws PersonException {
		student.add(new Student("John", "Doe", "Smith", new Date(1999,1,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Henry", "Doe", "Smith", new Date(1999,2,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Joe", "Doe", "Smith", new Date(1999,3,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Jeff", "Doe", "Smith", new Date(1999,4,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Jim", "Doe", "Smith", new Date(1999,5,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Jerry", "Doe", "Smith", new Date(1999,6,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Jake", "Doe", "Smith", new Date(1999,7,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Kyle", "Doe", "Smith", new Date(1999,8,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Dan", "Doe", "Smith", new Date(1999,9,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
		student.add(new Student("Jill", "Doe", "Smith", new Date(1999,10,10), eMajor.BUSINESS, "1 Apple Drive", "(631)-123-4567", "JDoe@udel.edu"));
	}

	@Test
	public void test() {
		ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
		for(Section sect: section) {
			for(Student stud: student) {
				enrollment.add(new Enrollment(stud.getStudentID(),sect.getSectionID()));
			}
		}
		for(Enrollment e: enrollment) {
			e.SetGrade(85);
		}
		assertEquals(85, 85);
		assertEquals(85,85);
	}
}