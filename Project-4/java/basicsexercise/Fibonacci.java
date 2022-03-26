package in.co.rays.basicsexercise;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 100, a = 0, b = 1;

		System.out.println("Fibonacci Series Upto " + n + ": ");

		for (int i = 0; i < n; i++) {
			System.out.print(a + ", ");

			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}

	}

}
