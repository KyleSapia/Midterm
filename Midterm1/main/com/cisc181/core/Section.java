package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private static UUID CourseID;
	private static UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		super();
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}

	public static UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public static UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	
	

}
