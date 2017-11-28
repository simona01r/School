package se.school.model;

import static se.school.model.Managment.*;

public class StudentsMenu {
	private Student stu;

	public StudentsMenu(Student stu) {
		this.stu = stu;
		run();
	}

	private void run() {
		boolean loop = true;
		while (loop) {
			switch (menu()) {
			case 1:
				System.out.println("Enter the course name");
				stu.addNewCourse(Course.valueOf(sc.next().toUpperCase()));
				break;
			case 2:
				System.out.println("Enter the course name and the grade");
				stu.addGradeTo(Course.valueOf(sc.next().toUpperCase()), Double.parseDouble(sc.next()));
				break;
			case 3:
				System.out.println(stu.getAllCourse());
				break;
			case 4:
				stu.getCourseGrades().forEach(System.out::println);
				break;

			default:
				break;
			}
		}
	}

	public int menu() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~ Student menu for " + stu.getName() + " ~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1- add new course.");
		System.out.println("2- add new grade to a course.");
		System.out.println("3- show all courses.");
		System.out.println("4- show all grades for a course.");

		System.out.println("5- show the avrage of all courses");
		System.out.println("6- show the avrage of one course");
		System.out.println("7- show maximum grade in courses");
		System.out.println("8 - back to main menu.");
		return Integer.parseInt(sc.next());
	}

}
