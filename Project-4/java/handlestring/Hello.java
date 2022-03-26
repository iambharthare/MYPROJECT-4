package in.co.rays.handlestring;

public class Hello {

	public static void main(String[] args) {
		String s = "Vijay Dina Nath Chouhan";
		 System.out.println("Hello " + s);
		
		/* count of character "a" in string */
		int g = 0;
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i) == 'a') {
				g++;
			}
		}
		System.out.println("The count of character a is :- " + g);

		
		/* print last name */
		int j = s.lastIndexOf(" ");
		for (int i = j; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		
		/* reverse a string */
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
