package in.co.rays.basicsexercise;

public class exer17 {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int h = 0;
		int g = 0;

		for(int f: ar) {
			h=h+f;
		}
		
		for(int k:arr) {
			g=g+k;
		}
		System.out.println(h - g);

		// ------------------>>>>>>>>>>>---------------------------------
		/*
		 * int[] ar = { 78, 93, 17, 56, 88, 99, 23, 45, 89, 2, 91 }; int[] arr = { 78,
		 * 17, 56, 88, 99, 23, 45, 89, 2, 91 };
		 * 
		 * int h = 0; int g = 0; for (int o : ar) { h = h + o;
		 * 
		 * } for (int p : arr) { g = g + p; } System.out.println("missing no. is " + (h
		 * - g));
		 * 
		 */

	}

}
