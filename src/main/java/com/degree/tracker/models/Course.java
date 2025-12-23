package com.degree.tracker.models;

public class Course {
	private String id;
	private String name;
	private String courseCode;
	private int credits;
	
	public Course(String id, String name, String courseCode, int credits) {
		this.id = id;
		this.name = name;
		this.courseCode = courseCode;
		this.credits = credits;
		
	}

}
