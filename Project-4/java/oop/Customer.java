package in.co.rays.oop;

public class Customer implements Cloneable {
	public String name;
	public Bankacc account;

	public Customer(String n) {
		name = n;
		account = new Bankacc(1000);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c1 = (Customer) super.clone();
		c1.account = (Bankacc) account.clone();

		return c1;

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1 = new Customer("Jay");
		Customer c2 = (Customer) c1.clone();
		c2.account.balance = 3000;
		c2.name = "Vijay";
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.account.balance);
	}

}
