package in.co.rays.handlestring;

public class Rruunnn {

	public static void main(String[] args) {
		
		String o = "Mayankaa  Madhya Pradesh bairagi";
		
		int j =0;
		for (int i = 0; i <= o.length()-1; i++) {
		
			char c =  o.charAt(i);
			
		String k =	String.valueOf(c);
			if(k.matches("a")) {
				j++;
			}
			
		}
		//System.out.println("no. of a in sttring is  " + j);
	
	
		int y = o.lastIndexOf(" ");
		for (int i = y; i <= o.length()-1; i++) {
			
			System.out.print(o.charAt(i));
			
		}
	}
}
