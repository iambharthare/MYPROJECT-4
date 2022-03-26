package in.co.rays.handlestring;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * String s ="madam"; String r = "";
		 * 
		 * for (int i = s.length()-1; i >=0; i--) { r = r + s.charAt(i); }
		 * System.out.println(r); if(s.equals(r)) {
		 * System.out.println("its palindrome"); }
		 */
		
		StringBuffer sb= new StringBuffer("JAVATECH");
		sb.append("Rays");
		StringBuffer fb=new StringBuffer("RAYS");
		System.out.println(sb);
	//	System.out.println(sb.insert(4, "c"));
		//System.out.println(sb.reverse());
		/*
		 * System.out.println(sb.capacity()); System.out.println(sb.delete(3, 6));
		 * System.out.println(sb.append(fb));
		 */
		}
}
