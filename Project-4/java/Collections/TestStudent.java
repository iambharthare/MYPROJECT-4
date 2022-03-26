package in.co.rays.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> l = Arrays.asList(new Student("2", 112233, "ravi"), new Student("1", 22233, "raj"),
				new Student("3", 332233, "rishi"));
		Collections.sort(l);
		l.forEach(li -> System.out.println(li));

	}

}
