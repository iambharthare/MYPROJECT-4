package in.co.rays.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronisedHashMap extends Thread {
	public static Map<String, Integer> chm = Collections.synchronizedMap(new HashMap<String, Integer>());

	@Override
	public void run() {
		chm.put("one", 1);
		super.run();
	}
	
	public static void main(String[] args) {
		
		chm.put("two", 2);
		chm.put("three", 3);
		
		chm.put("four", 4);

		SynchronisedHashMap tm=new SynchronisedHashMap();
		tm.start();
		
		for(Object o:chm.entrySet()) {
			System.out.println(o);
			
		}
		System.out.println(chm);
		
	}
	
	
}