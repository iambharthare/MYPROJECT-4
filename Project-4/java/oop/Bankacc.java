package in.co.rays.oop;

public class Bankacc implements Cloneable {

	double balance;

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Bankacc(double balance) {
		this.balance = balance;
	}

	
	public static void main(String[] args) throws CloneNotSupportedException {
		Bankacc b1 = new Bankacc(2000);
		Bankacc b2 = (Bankacc) b1.clone();
		b2.balance = 4000;
		System.out.println(b1.balance);
		System.out.println(b2.balance);
	}
	
}