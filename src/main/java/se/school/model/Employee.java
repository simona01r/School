package se.school.model;

public class Employee extends Person {

    private int noOfProjects;
    private double salary;
    private int idEmpl;
    static private int idGenerator = 1;

    public Employee() {}
    public Employee(String name, String address, int age, int noOfProjects, double salary) {
        super(name, address, age);
        this.noOfProjects = noOfProjects;
        this.salary = salary;
        this.idEmpl = idGenerator;
        idGenerator++;
    }

    public int getNoOfProjectj() {
        return noOfProjects;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "[ E" + getIdEmpl() + "/" + super.toString() + "]";
    }

    public int getIdEmpl() {
        return idEmpl;
    }
}
