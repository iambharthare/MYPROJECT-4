package in.co.rays.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomFiftyInt {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int p = 0; p <= 100000; p++) {
			al.add(p);
		}
		// System.out.println(al);

		Random r = new Random();
		for (int i = 0; i <= 50; i++) {
			int p = r.nextInt(5000);
		System.out.println(al.get(p));
		}
		HashSet hs = new HashSet();
		hs.addAll(al);
	//	System.out.println(hs);

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}

}
