package se.school.model;

import java.util.*;

public class CourseGrades {
	private Course course;
	private List<Double> grades ;
	
	public CourseGrades() {
		
	}
	
	public CourseGrades(Course course) {
		this.course = course;
		this.grades = new ArrayList<Double>();
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setGrades(List<Double> grades) {
		this.grades = grades;
	}
	
	public List<Double> getGrades() {
		return new ArrayList<>(grades);
	}
	
	@Override
	public String toString() {
		return "[ Course "+course+" have "+grades;
	}
}
