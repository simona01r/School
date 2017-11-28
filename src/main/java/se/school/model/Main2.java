package se.school.model;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException {
		ss(Student.class);
		CourseGrades e = new CourseGrades();
		
		
	}
	
	public static void ss (Class s) {
		System.out.println(s.getName());	
	}
}
