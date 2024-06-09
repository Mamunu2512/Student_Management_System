package com.pk.com.sms.entites;

public class Grade {
	 private String courseName;
	    private double gradeValue;
	    private int credits;

	    public Grade(String courseName, double gradeValue, int credits) {
	        this.courseName = courseName;
	        this.gradeValue = gradeValue;
	        this.credits = credits;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public double getGradeValue() {
	        return gradeValue;
	    }

	    public int getCredits() {
	        return credits;
	    }
	}


