package in.co.rays.Collections;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	/*
	 * public int getId() { return id; }
	 * 
	 * public int getSalary() { return salary; }
	 * 
	 * public String getName() { return name; }
	 */

	@Override
	public String toString() {

		return "Employee[id=" + id + ",name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {

		return 0;
	}
}
