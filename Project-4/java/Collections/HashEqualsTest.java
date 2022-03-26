package in.co.rays.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashEqualsTest {

	public static void main(String[] args) {
		HashEqualsEmpl h1 = new HashEqualsEmpl(1);
		HashEqualsEmpl h2 = new HashEqualsEmpl(2);

		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("jdks", 6);
		mp.put("tyfghf", 5);

		System.out.println(h1.equals(h2));
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());

		System.out.println(mp.size());
		System.out.println(mp.entrySet());

		/*
		 * ArrayList a = new ArrayList(); a.add("one"); a.add("gfgggggggggggh");
		 * a.add("onehjg"); a.add("onhgfe"); a.add("ohhjne");
		 * 
		 * Integer e = new Integer(4); a.add(e); Integer f=(Integer) a.get(5);
		 * System.out.println(f);
		 */
	}

}
