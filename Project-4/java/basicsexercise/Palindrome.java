package in.co.rays.basicsexercise;

public class Palindrome {
	public static void main(String[] args) {
		int num = 123421;
		int t = num;
		int rem, s = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			s = s * 10 + rem;

		}
		System.out.println(s);

		if (t == s) {
			System.out.println("Number is Palindrome");

		} else {
			System.out.println("Number is not Palindrome");
		}

	}

}
