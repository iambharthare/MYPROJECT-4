package in.co.rays.oop;

public class Person extends Passport {

	public Person(String n, String p) {
		super(n, p);
		name = n;
		PId = p;
	}

	public static void main(String[] args) {
		
		Passport p = new Passport("SHUBH", "1234");
		System.out.println(p.name);
		System.out.println(p.PId);
	}
}
