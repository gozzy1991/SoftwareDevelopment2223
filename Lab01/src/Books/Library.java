package Books;

import java.util.Scanner;

import Books.Book;


public class Library {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {

			System.out.println("Please enter the name for Book: " + (i+1));

			String name = in.nextLine();

			System.out.println("Please enter the Author of Book: " + (i+1));

			String author = in.nextLine();

			System.out.println("Please enter the genre of Book: " + (i+1));

			String genre = in.nextLine();

			Book b = new Book(name,author,genre, 'A' );

			System.out.println( Book.getNoOfBooks());
			
			
			
			books[i] =b;
			
			if (i ==1 || i == 2) {
				b.Borrow();
			}
			if (i == 2) {
				b.Return();
			}
			
			
				}
		
				for (Book b: books) {
						if (b!=null) {
								System.out.println(b);
		
	}

}
}
}
