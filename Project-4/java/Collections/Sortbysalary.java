package in.co.rays.Collections;

import java.util.Comparator;

public class Sortbysalary implements Comparator<ComparatorEmpl> {

	@Override
	public int compare(ComparatorEmpl c1, ComparatorEmpl c2) {

		if (c1.getSalary() == c2.getSalary()) {
			return 0;
		} else if (c1.getSalary() > c2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}
