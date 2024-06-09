package com.pk.com.sms.entites;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	 private String id;
	    private String name;
	    private List<Grade> grades;

	    public Student(String id, String name) {
	        this.id = id;
	        this.name = name;
	        this.grades = new ArrayList<>();
	    }

	    public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Grade> getGrades() {
	        return grades;
	    }

	    public void addGrade(Grade grade) {
	        grades.add(grade);
	    }

	    public double calculateGPA() {
	        double totalPoints = 0;
	        int totalCredits = 0;

	        for (Grade grade : grades) {
	            totalPoints += grade.getGradeValue() * grade.getCredits();
	            totalCredits += grade.getCredits();
	        }

	        return totalCredits == 0 ? 0 : totalPoints / totalCredits;
	    }


}
