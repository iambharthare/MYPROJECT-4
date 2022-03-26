package in.co.rays.basicsexercise;

public class HarmonicSeries {
	public static void main(String[] args) {
		int num = 5;
		double res = 0.0;

		while (num > 0) {
			res = res + (double) 1 / num;

			num--;

			System.out.print(res + ",");

		}
	}

}
