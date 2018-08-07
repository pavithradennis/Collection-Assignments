package EmployeeSavings;

//class to store information about the employee
public class Employee {
	private int id;
	private String name;
	private String designation;
	private double salary;
	private String communications;

	// parameterized constructor
	public Employee(int id, String name, String designation, double salary, String communications) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.communications = communications;
	}

	// getter methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public String getCommunications() {
		return communications;
	}

}
