package se.school.model;

import java.util.*;
import java.util.stream.Collectors;



public class Student extends Person {

	private String Schoolname;
	private String Program;
	private List<CourseGrades> allCourseGrades;

	public Student() {
	}

	public Student(String name, String address, int age,String SchoolName, String Program) {
		super(name, address, age);
		this.Schoolname = SchoolName;
		this.Program = Program;
		allCourseGrades = new ArrayList<>();
	}
	public List<Course> getAllCourse(){
		return allCourseGrades.stream().map(s->s.getCourse()).collect(Collectors.toList());
	}
	
	public List<CourseGrades> getCourseGrades(){
		return new ArrayList<>(allCourseGrades);
	}

	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}

	public String getSchoolname() {
		return Schoolname;
	}

	public void setProgram(String program) {
		Program = program;
	}

	public String getProgram() {
		return Program;
	}

	public void addNewCourse(Course cource) {
		int antal = getAllCourse().stream().filter(s->s.compareTo(cource)==0).collect(Collectors.toList()).size();
		if(antal>0) {
			System.out.println(cource +" is registerd before");
		}else {
			allCourseGrades.add(new CourseGrades(cource));
		}
		
	}

	@Override
	public String toString() {
		return "[ Student = " + super.toString() + "]";
	}
	
	public void addGradeTo(Course course,double grade) {
		if(!getAllCourse().contains(course)) {
			addNewCourse(course);
			addGradeTo(course, grade);
		}else {
			for(CourseGrades e:allCourseGrades) {
				if(e.getCourse().compareTo(course)==0) {
					e.getGrades().add(grade);
				}
			}
		}
	}

}
