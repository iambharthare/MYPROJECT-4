package in.co.rays.basicsexercise;

public class Exercise15 {

	public static void main(String[] args) {
		int[] a = { 22, 99, 61, 99, 1000 };
		int maxnum = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxnum) {
				maxnum = a[i];

			}
		}
		 System.out.println("Max number is: " + maxnum);

		for (int i = 1,p=1; i <= 5; i++,p++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(p);
			}
			System.out.println();
		}

	}

}
