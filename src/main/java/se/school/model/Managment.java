package se.school.model;

import java.util.*;

public class Managment {

	static Scanner sc = new Scanner(System.in);
	static List<Person> personList = new ArrayList<>();
	
	public static void putSomePersons() {

		personList.add(new Employee("Daniel", "ADR1", 49, 9, 30000));
		personList.add(new Employee("Ellen", "ADR2", 57, 3, 40000));
		personList.add(new Employee("Steve", "ADR3", 29, 14, 10000));
		personList.add(new Employee("Johnny", "ADR4", 37, 6, 25000));

		personList.add(new Athlet("Smith", "PARIS", 35, 10));
		personList.add(new Athlet("Clark", "LONDON", 19, 2));
		personList.add(new Athlet("Bolten", "TOKYO", 27, 4));
		personList.add(new Athlet("Brown", "NYC", 39, 7));

		personList.add(new Student("A", "NDFL 65", 21, "Cambrige", "Literature"));
		personList.add(new Student("B", "SJDG 25", 18, "Oxford", "Computers"));
		personList.add(new Student("C", "JSYH 10", 26, "Sorbonne", "History"));
		personList.add(new Student("D", "THTH 2", 26, "Binghamton", "Cultures"));
	}

	public static Person findById(int id) {
		for (Person p : personList) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}

	public static void addPerson(Person c) {
		if(c instanceof Student) {
			System.out.println("insert name address age SchoolName Program");
			personList.add(new Student(sc.next(), sc.next(), Integer.parseInt(sc.next()), sc.next(), sc.next()));
		}else if(c instanceof Employee) {
			System.out.println("insert name address age noOfProjects salary");
			personList.add(new Employee(sc.next(), sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Double.parseDouble(sc.next())));
		}else if(c instanceof Athlet) {
			System.out.println("insert name address age noOfMedals");
			personList.add(new Athlet(sc.next(),sc.next(),Integer.parseInt(sc.next()),Integer.parseInt(sc.next())));
		}
	}
	
	public static <T extends Person> void showListOf(Class<T> s) {
		String className = s.getName();
		for (Person p : personList) {
			if (p.getClass().getName().equalsIgnoreCase(className)) {
				System.out.println(p);
			}
		}
		System.out.println();
	}

	public static <T extends Person> List<T> listOf(Class<T> c) {
		List<T> temp = new ArrayList<>();
		String className = c.getName();

		for (Person p : personList) {
			if (p.getClass().getName().equalsIgnoreCase(className)) {
				temp.add((T) p);
			}
		}
		return temp;
	}
	public static void blackLine(int a) {
		for (int i = 0; i <a; i++) {
			System.out.println();
		}
	}
}
