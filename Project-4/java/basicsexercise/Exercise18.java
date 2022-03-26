package in.co.rays.basicsexercise;

public class Exercise18 {
	public static void main(String[] args) {
		 int[] ar = { 78, 17, 56, 88, 99, 23, 97, 89, 2, 91 };

			int o = checkIndex(97, ar);
			System.out.println("index of s " + o);
		}

		public static int checkIndex(int j, int[] ar) {

			for (int i = 0; i < ar.length; i++) {
				if (ar[i] == j) {
					return i;
				}
			}
			return -1;
		
	    
	}

}
