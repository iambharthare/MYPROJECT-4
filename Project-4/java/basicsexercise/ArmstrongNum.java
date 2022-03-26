package in.co.rays.basicsexercise;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num = 153;
		int r, sum = 0;
		int t = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum + r * r * r;

		}
		if (t == sum) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}
	}

}
