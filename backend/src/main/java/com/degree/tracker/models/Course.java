package com.degree.tracker.models;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private int credits;

    public Course() {}

    public int getCredits() {
        return credits;
    }

    
}
