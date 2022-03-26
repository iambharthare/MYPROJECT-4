package in.co.rays.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompTest {

	public static void main(String[] args) {
		List<ComparatorEmpl> l = Arrays.asList(new ComparatorEmpl("ram", "bhopal", 8000),
				new ComparatorEmpl("shyam", "indore", 35000), new ComparatorEmpl("balram", "goa", 25000));

		String s1 = "ghfshgs";

		if (s1.equals("Sortbysalary")) {
			Collections.sort(l, new Sortbyname());
		} else {
			Collections.sort(l, new Sortbysalary());
		}
		for (Object o : l) {
			System.out.println(o);
		}

		/*
		 * if (m1.getFirstname().equals(m2.getFirstname()) == true) { 
		 * return m1.getLastname().compareTo(m2.getLastname());
		 * 
		 * } else { 
		 * return m1.getFirstname().compareTo(m2.getFirstname());
		 *  }
		 */

	}

}
