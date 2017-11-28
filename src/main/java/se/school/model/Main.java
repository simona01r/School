package se.school.model;

import static se.school.model.Managment.*;

public class Main {

	static boolean loop = true;

	public static void main(String[] args) {
		while (loop) {
			switchCase(opt());
		}
	}

	public static void switchCase(int opt) {
		switch (opt) {
		case 1:
			putSomePersons();
			break;

		case 2:
			System.out.println("List of Employee:");
			showListOf(Employee.class);

			System.out.println("List of Athlets:");
			showListOf(Athlet.class);

			System.out.println("List of Students:");
			Managment.showListOf(Student.class);
			break;

		case 3:
			System.out.println("1- Student\n2- Athlet\n3- Employee");
			switch (sc.nextLine()) {
			case "1":
				addPerson(new Student());
				break;
			case "2":
				addPerson(new Athlet());
				break;
			case "3":
				addPerson(new Employee());
				break;
			default:
				break;
			}
			break;
		case 4:
			System.out.println("Enter id of a person.");
			Person p = findById(Integer.parseInt(sc.next()));
			if(p instanceof Student)
				new StudentsMenu((Student)p);
			if(p instanceof Employee)
				new EmployeesMenu((Employee)p);
			break;
		
		case 5:
			System.out.println("Thank you!");
			loop = false;
			break;
		default:
			System.out.println("No option/ Try again!");
		}
	}

	public static int opt() {
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ Main Menu  ~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. Put some persons to the list.");
		System.out.println("2. Show list of Persons.");
		System.out.println("3. Add a person to list.");
		System.out.println("4. choose a person by id to more actions.");
		System.out.println("5. finish.");

		System.out.println("Insert an option:");
		int opt = Managment.sc.nextInt();
		Managment.sc.nextLine();
		return opt;
	}
}
