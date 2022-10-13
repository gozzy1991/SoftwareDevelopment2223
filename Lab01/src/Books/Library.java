package Books;

import Books.Book;


public class Library {

	public static void main(String[] args) {
		
		Book bookOne = new Book("HTML for Dummies", "John Bloggs", "Educational", 'A', 2 );
		Book bookTwo = new Book("The Host", "Mary Bourke", "Drama", 'A', 3 );
		Book bookThree = new Book("My Long Summer", "Martin Keane", "Comedy", 'A', 4 );
		
		System.out.print(bookOne + "\n");
		System.out.print(bookOne.getNoOfBooks()+ "\n");
		
		System.out.print(bookTwo + "\n");
		System.out.print(bookTwo.getNoOfBooks()+ "\n");
		
		System.out.print(bookThree + "\n");
		System.out.print(bookThree.getNoOfBooks()+ "\n");
		
		
		bookTwo.Borrow();
		
		System.out.print(bookTwo + "\n");
		
		bookTwo.Return();
		
		System.out.print(bookTwo + "\n");
	}

}
