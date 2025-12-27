package com.degree.tracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.degree.tracker.models.Enrollment;

public interface EnrollmentRepository extends 
		JpaRepository<Enrollment, Long>{
	
	List<Enrollment> findByUserId(Long userId);

}
