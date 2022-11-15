// Author : Brendan Phelan
// Date : 14/11/2022

package Lab6;

public class Teacher extends Person {
	 
	 private int numCourses; 
	 private String[] courses; 
	 private static final int Max = 10; 

	 // Constructor
	 public Teacher(String name, String address) {
	 super(name, address);
	 numCourses = 0;
	 courses = new String[Max];
	 }

	 @Override
	 public String toString() {
	 return "Teacher: " + super.toString();
	 }

	 
	 public boolean addCourse(String course) {
	 
	 for (int i = 0; i < numCourses; i++) {
		 
	 if (courses[i].equals(course)) return false;
	 }
	 
	 courses[numCourses] = course;
	 numCourses++;
	 return true;
	 }

	 
	 public boolean removeCourse(String course) {
	 
	 int courseIndex = numCourses;
	 for (int i = 0; i < numCourses; i++) {
	 if (courses[i].equals(course)) {
	 courseIndex = i;
	 break;
	 }
	 }
	 if (courseIndex == numCourses) { 
	 return false;
	 } else { 
	 for (int i = courseIndex; i < numCourses-1; i++) {
	 courses[i] = courses[i+1];
	 }
	 numCourses--;
	 return true;
	 }
	 }
	}
