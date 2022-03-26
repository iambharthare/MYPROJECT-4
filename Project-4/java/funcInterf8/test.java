package in.co.rays.funcInterf8;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		String s = "5";
		int f=4;
		int i = Integer.parseInt(s);
		int g= Integer.valueOf(4);
		System.out.println(i);
		System.out.println(g);

		String[] arr1= {"s","b","a","M", "5","@", "A4"};
		Arrays.parallelSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
