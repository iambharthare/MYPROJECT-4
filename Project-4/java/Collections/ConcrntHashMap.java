package in.co.rays.Collections;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class ConcrntHashMap extends Thread {
	public static ArrayBlockingQueue<Integer> chm = new ArrayBlockingQueue<>(45);

	@Override
	public void run() {
		chm.add(50);
		super.run();
	}

	public static void main(String[] args) {

		chm.add(2);
		chm.add(3);
		chm.add(4);

		ConcrntHashMap tm = new ConcrntHashMap();
		tm.start();

		Iterator it = chm.iterator();

		while (it.hasNext()) {

			Object o = it.next();

			System.out.println(o);
		}
	}

}