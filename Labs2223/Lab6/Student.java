// Author : Brendan Phelan
// Date : 14/11/2022

package Lab6;

public class Student extends Person {
	
	 private int numCourses; 
	 private String[] courses;
	 private int[] grades; 
	 private static final int Max = 30; 

	 // Constructor
	 public Student(String name, String address) {
	 super(name, address);
	 numCourses = 0;
	 courses = new String[Max];
	 grades = new int[Max];
	 }

	 @Override
	 public String toString() {
	 return "Student: " + super.toString();
	 }

	 
	 public void addCourseGrade(String course, int grade) {
	 courses[numCourses] = course;
	 grades[numCourses] = grade;
	 ++numCourses;
	 }

	 
	 public void printGrades() {
	 System.out.print(this);
	 for (int i = 0; i < numCourses; ++i) {
	 System.out.println(" " + courses[i] + ":" + grades[i]);
	 }
	 System.out.println();
	 }

	 
	 public double getAverageGrade() {
	 int sum = 0;
	 for (int i = 0; i < numCourses; i++ ) {
	 sum += grades[i];
	 }
	 return (double)sum/numCourses;
	 }
	}

