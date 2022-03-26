package in.co.rays.Collections;

import java.util.Comparator;

public class sortbynam implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
		
	}
	
	
	/*
	 * public int compare1(Employee o3, Employee o4) {
	 * 
	 * if (o3.getfirstName().equals(o4.getfirstName())) { 
	 * return o3.getlastName().compareTo(o4.getlastName()); 
	 * 
	 * }
	 *  return o3.getfirtsname().compareTo(o4.getfirstname();
	 * 
	 * }
	 */

}
