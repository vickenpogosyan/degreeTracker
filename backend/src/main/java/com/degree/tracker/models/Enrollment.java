package com.degree.tracker.models;

import jakarta.persistence.*;

@Entity
public class Enrollment {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    @ManyToOne
	    @JoinColumn(name = "course_id")
	    private Course course;

	    @Enumerated(EnumType.STRING)
	    private Status status;

	    private String grade;
	
	public Enrollment() {
		
	}
	
	public enum Status {
		COMPLETED,
		ENROLLED,
		NOT_COMPLETED
	}
	
	public Course getCourse() {
		return course;
	}

	public Status getStatus() {
		return status;
	}

	public String getGrade() {
		return grade;
	}

}
