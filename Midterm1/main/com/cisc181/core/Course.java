package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.*;

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
	
	public Course(UUID courseID, String courseName, int gradePoints, com.cisc181.eNums.eMajor eMajor) {
		super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		this.eMajor = eMajor;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public eMajor geteMajor() {
		return eMajor;
	}

	public void seteMajor(eMajor eMajor) {
		this.eMajor = eMajor;
	}
	
}
