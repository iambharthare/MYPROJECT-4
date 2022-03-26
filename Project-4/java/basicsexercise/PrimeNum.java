package in.co.rays.basicsexercise;

public class PrimeNum {
	public static void main(String[] args) {
		int num = 24;
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println(num + " is Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}
		
		Integer a=new Integer(4);
		int s=a.parseInt("4");
		System.out.println(s);
	}

}
