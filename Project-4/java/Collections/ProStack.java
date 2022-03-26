package in.co.rays.Collections;

import java.util.Stack;

public class ProStack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.push("5");
		
		System.out.println(s);
		
		String a= (String) s.pop();
		String b= (String) s.pop();
		String c= (String) s.pop();
		String d= (String) s.pop();
		String e= (String) s.pop();
		
		Stack s1= new Stack();
		s1.push(a);
		s1.push(b);
		s1.push(c);
		s1.push(d);
		s1.push(e);
		
		System.out.println(s1);
		
		
		
		
		
	}

}
