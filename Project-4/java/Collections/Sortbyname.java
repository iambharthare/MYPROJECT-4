package in.co.rays.Collections;

import java.util.Comparator;

public class Sortbyname implements Comparator<ComparatorEmpl> {

	@Override
	public int compare(ComparatorEmpl c1, ComparatorEmpl c2) {
		
		return c1.getName().compareTo(c2.getName());
	}
	
	

}
