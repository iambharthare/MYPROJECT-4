package in.co.rays.funcInterf8;

@FunctionalInterface
interface Dev {
	public int calculate(int x);

	public default void show() {
		System.out.println("hello Default");
	}

	static void hello() {
	}
}

public class Shamu {

	public static void main(String[] args) {

		Dev.hello();

		int a = 5;
		Dev s = (int x) -> x + x;
		;
		int result = s.calculate(a);
		System.out.println(result);

	}

}
