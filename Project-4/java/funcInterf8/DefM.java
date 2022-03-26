package in.co.rays.funcInterf8;

@FunctionalInterface
interface DefI {
	public void add();

	public default void show() {
		System.out.println("default run successfully");
	}

	public static void hello() {
		System.out.println("hello static");
	}
}

public class DefM {

	public static void main(String[] args) {

		DefI.hello();

		DefI d = () -> {

		};
		d.show();
	}

}
