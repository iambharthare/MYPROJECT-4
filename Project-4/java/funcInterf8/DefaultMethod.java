package in.co.rays.funcInterf8;

@FunctionalInterface
interface DefaultMeth {
	public void add();

	public default void defMethod() {
		System.out.println("Default Method");
	}

}
