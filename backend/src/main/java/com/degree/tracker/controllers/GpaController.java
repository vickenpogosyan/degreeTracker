package com.degree.tracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.degree.tracker.services.GpaService;

@RestController 
public class GpaController {
	private final GpaService gpaService;
	
	
	public GpaController(GpaService gpaService) {
		this.gpaService = gpaService;
	}
	
	@GetMapping("/gpa")
	public double getGpa(@RequestParam Long userId) {
		return gpaService.calculateGPA(userId);
	}
	
}
