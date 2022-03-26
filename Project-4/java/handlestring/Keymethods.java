package in.co.rays.handlestring;

public class Keymethods {

	public static  void main(String[] args) throws InterruptedException {
		String s1 = "Vijay Dinanth Chuouhan";
		Object s2 = 4;
		String f=" ";
		String g=" ";
		System.out.println(s1.length ());
		
	 System.out.println("-----------------"+s1.indexOf('i'));
		//System.out.println(s2.wait());
		//System.out.println(f.hashCode());
		//System.out.println(g.hashCode());
		// System.out.println(s1.lastIndexOf("r") + " F" + s1.indexOf("r"));
		//String[] s3 = s1.split("h");
		//Object s4 = s1.getClass();
		//System.out.println(s4);
//		String[] s3 = s1.split("a");
//		System.out.println(s3[2]);
//		String ss=null;
//		System.out.println(s2.getClass());
		
		
		for (int i=s1.length()-1; i>=0; i--) {
			System.out.print(s1.charAt(i));
		}
	
		
		//System.out.println(s1.lastIndexOf("f"));
		
		//System.out.println(s1.replaceAll("nath(.*)", "jay"));

		// System.out.println(s1.trim());
		// System.out.println(s1.toString());

		char[] char5 = { 'S', 'H' };
		String s5 = new String(char5);
		// System.out.println(s5);
		/*
		 * System.out.println(s1.concat(s2)); System.out.println(s1.charAt(5));
		 * System.out.println(s2.indexOf("h")); System.out.println(s1.trim());
		 */
		// System.out.println(s1.length()+s2.length());
		// System.out.println(s1.toLowerCase());
		/*
		 * 
		 * 
		 * for(int i=s1.length()-1; i>=0; i--) { System.out.print(s1.charAt(i));
		 * 
		 * }
		 */
		Object obj1 = new Object();
		String str = "Java";
		// System.out.println(str.valueOf(obj1));
		

	}

}
