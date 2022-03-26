package in.co.rays.Collections;

import java.util.Comparator;

public class ComparatorEmpl implements Comparator<ComparatorEmpl> {
	private String name;
	private String address;
	private int salary;

	public ComparatorEmpl(String name, String address, int salary) {
		this.name = name;
		this.address = address;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	public int getSalary() {
		return salary;
	}

	public String toString() {
		return "ComaparatorEmpl [name=" + name + ", address=" + address + ", salary="+salary+"] ";

	}

	public int compare(ComparatorEmpl c1, ComparatorEmpl c2) {
		return 0;

	}

}
