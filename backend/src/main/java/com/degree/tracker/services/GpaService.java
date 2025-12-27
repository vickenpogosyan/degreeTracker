package com.degree.tracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.degree.tracker.models.Enrollment;
import com.degree.tracker.repositories.EnrollmentRepository;

@Service
public class GpaService {
	
	//A+  → highest
//	A
//	B+
//	B
//	C+
//	C
//	D+
//	D
//	E   → fail, but close to passing
//	F   → fail, worst
	
	private final EnrollmentRepository enrollmentRepository;
	
	public GpaService(EnrollmentRepository enrollmentRepository) {
		this.enrollmentRepository = enrollmentRepository;
	}

	public double calculateGPA(Long userId) {
		List<Enrollment> enrollments = enrollmentRepository.findByUserId(userId);
		
		double totalPoints = 0.0;
		int totalCredits = 0;
		
		for (Enrollment enrollment : enrollments) {
			if (enrollment.getStatus() == Enrollment.Status.COMPLETED 
					&& enrollment.getGrade() != null) {
				double points = gradeToPoints(enrollment.getGrade());
				
			}
		}
		return totalCredits;
	}

	private double gradeToPoints(String grade) {

	    if (grade == null) {
	        return 0.0;
	    }

	    switch (grade) {
	        case "A+":
	            return 4.3;
	        case "A":
	            return 4.0;
	        case "B+":
	            return 3.3;
	        case "B":
	            return 3.0;
	        case "C+":
	            return 2.3;
	        case "C":
	            return 2.0;
	        case "D+":
	            return 1.3;
	        case "D":
	            return 1.0;
	        case "E":   // fail, but close
	            return 0.5;
	        case "F":   // worst fail
	            return 0.0;
	        default:
	            return 0.0;
	    }
	}


}
