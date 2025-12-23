package com.degree.tracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgressController {
	
	@GetMapping("/")
	public String checkStatus() {
		return "The Backend is working";
	}

}
