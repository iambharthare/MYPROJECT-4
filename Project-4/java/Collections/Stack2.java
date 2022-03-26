package in.co.rays.Collections;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack op = new Stack();

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(op.push(i));

		}
		System.out.println("  ");

		Stack io = new Stack<>();
		while (!op.isEmpty()) {
			System.out.print(io.push(op.pop()));
		}
		System.out.println(" ");

		while (!io.isEmpty()) {
			System.out.print(op.push(io.pop()));
		}

	}

}
