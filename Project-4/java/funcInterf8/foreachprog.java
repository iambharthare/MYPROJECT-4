package in.co.rays.funcInterf8;

import java.util.ArrayList;

public class foreachprog {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
arr.forEach(li -> System.out.println("->" + li));
	
}
		/*
		 * System.out.println("                               " +
		 * "--------------------------");
		 * System.out.println("                               " +
		 * "Example for String values");
		 * System.out.println("                               " +
		 * "--------------------------");
		 * System.out.println("1-> this is internal loop for int value");
		 * System.out.println("                       "); ArrayList<String> arr = new
		 * ArrayList<String>(); arr.add("ansh"); arr.add("saxena"); arr.add("sidd");
		 * arr.add("kaushal"); System.out.println("----------------------------------");
		 * System.out.println("2-> this is foreach internal loop for String value" +
		 * " "); System.out.println("                            "); arr.forEach(i ->
		 * System.out.println("->" + i));
		 */
	}

