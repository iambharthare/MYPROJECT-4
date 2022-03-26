package in.co.rays.basicsexercise;

public class Exercise17 {

	public static void main(String[] args) {
		int[] ar = { 78, 93, 17, 56, 88, 99, 23, 45, 89, 2, 91 };
		int[] arr = { 78, 17, 56, 88, 99, 23, 45, 89, 2, 91 };

		int h = 0;
		int g = 0;
		for (int o : ar) {
			h = h + o;

		}
		for (int p : arr) {
			g = g + p;
		}
		System.out.println("missing no. is " + (h - g));

	}

}

