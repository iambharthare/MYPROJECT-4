package in.co.rays.basicsexercise;

public class Exercise16 {
	public static void main(String[] args) {
		int[] ar = { 78, 93, 17, 56, 88, 99, 23, 45, 89, 2, 91,99,100,101 };

		int large = ar[0];
		int sec_large = ar[1];

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > large) {
				sec_large = large;
				large = ar[i];

			} else if (ar[i] > sec_large && ar[i] != large) {
				sec_large = ar[i];

			}

		}

		System.out.println(sec_large);

	}

}
