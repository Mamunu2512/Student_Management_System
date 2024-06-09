package com.pk.com.sms;

//Main.java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pk.com.sms.entites.Grade;
import com.pk.com.sms.entites.Student;

public class Main {
 private static Map<String, Student> students = new HashMap<>();

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     while (true) {
         System.out.println("1. Add Student");
         System.out.println("2. Remove Student");
         System.out.println("3. Record Grade");
         System.out.println("4. Calculate GPA");
         System.out.println("5. Generate Report");
         System.out.println("6. Exit");
         System.out.print("Choose an option: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 addStudent(scanner);
                 break;
             case 2:
                 removeStudent(scanner);
                 break;
             case 3:
                 recordGrade(scanner);
                 break;
             case 4:
                 calculateGPA(scanner);
                 break;
             case 5:
                 generateReport(scanner);
                 break;
             case 6:
                 System.out.println("Exiting...");
                 scanner.close();
                 return;
             default:
                 System.out.println("Invalid option. Try again.");
         }
     }
 }

 private static void addStudent(Scanner scanner) {
     System.out.print("Enter student ID: ");
     String id = scanner.next();
     System.out.print("Enter student name: ");
     String name = scanner.next();
     students.put(id, new Student(id, name));
     System.out.println("Student added.");
 }

 private static void removeStudent(Scanner scanner) {
     System.out.print("Enter student ID to remove: ");
     String id = scanner.next();
     students.remove(id);
     System.out.println("Student removed.");
 }

 private static void recordGrade(Scanner scanner) {
     System.out.print("Enter student ID: ");
     String id = scanner.next();
     Student student = students.get(id);
     if (student == null) {
         System.out.println("Student not found.");
         return;
     }
     System.out.print("Enter course name: ");
     String courseName = scanner.next();
     System.out.print("Enter grade value: ");
     double gradeValue = scanner.nextDouble();
     System.out.print("Enter credits: ");
     int credits = scanner.nextInt();
     student.addGrade(new Grade(courseName, gradeValue, credits));
     System.out.println("Grade recorded.");
 }

 private static void calculateGPA(Scanner scanner) {
     System.out.print("Enter student ID: ");
     String id = scanner.next();
     Student student = students.get(id);
     if (student == null) {
         System.out.println("Student not found.");
         return;
     }
     double gpa = student.calculateGPA();
     System.out.println("GPA: " + gpa);
 }

 private static void generateReport(Scanner scanner) {
     for (Student student : students.values()) {
         System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", GPA: " + student.calculateGPA());
     }
 }
}
