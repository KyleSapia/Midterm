package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double grade;
	
	private Enrollment() {
	}
	
	public Enrollment(UUID StudentID,UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		EnrollmentID = UUID.randomUUID();
	}
	public void SetGrade(double grade) {
		this.grade = grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public double getGrade() {
		return grade;
	}

}
