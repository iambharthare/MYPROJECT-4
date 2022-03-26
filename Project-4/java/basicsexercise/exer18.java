package in.co.rays.basicsexercise;

public class exer18 {

	public static void main(String[] args) {
		int[] ar = { 99, 98, 97, 96, 95, 94, 93, 92, 91 };
		int ck=checkindex(65, ar);
		System.out.println("Index of integer is:- "+ck);
	}

	public static int checkindex(int j, int[] ar) {
		for (int i = 0; i > ar.length; i++) {
			if(ar[i]==j) {
				return i;
			}

		}

		return -1;

	}

}
