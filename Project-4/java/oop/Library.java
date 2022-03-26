package in.co.rays.oop;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Books> book;

	public Library(List<Books> b) {
		book = b;
	}

	public static void main(String[] args) {
		Books b1 = new Books("ASHA", "JP SHARMA");
		Books b2 = new Books("BADAL", "NEERAJ");
		List<Books> book = new ArrayList<Books>();
		book.add(b1);
		book.add(b2);
		Library lib = new Library(book);
		for (Books books : book) {
			 System.out.println(books.title + " " + books.author);

		}

	}

}
