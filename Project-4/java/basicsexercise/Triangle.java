package in.co.rays.basicsexercise;

public class Triangle {

	public static void main(String[] args) {

		for (int i = 1,p=5; i <= 5; i++,p--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p);

			}
			System.out.println();
		}

		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = i; j <= 5; j++) {
		 * System.out.print(" "); } for (int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print(" "); } for (int j = i; j <= 5; j++) {
		 * System.out.print("*"); } System.out.println();
		 * 
		 * }
		 */

		/*
		 * for (int i = 1, p = 5; i <= 5; i++, p--) { for (int j = i; j <= 5; j++) {
		 * System.out.print(p + "");
		 * 
		 * } System.out.println(); }
		 */

		/*
		 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= 5; j++) {
		 * System.out.print(" "); } for (int j = i; j <= 5; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		for (int i = 1, p = 1; i <= 5; i++, p++) {
			for (int j = 1; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();

		}

	}
}
