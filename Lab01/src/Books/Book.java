package Books;


public class Book {
	
	
private String bookName;
private String bookAuthor;
private String bookGenre;
private char bookStatus;
private int numOfBooks;
private String bookNum;

private int ISBN = 1;
private static int ISBNCount = 0;

private boolean borrowed;

	
	
	public Book(String bookName, String bookAuthor, String bookGenre, char bookStatus, int numOfBooks) {
		
		setBookName(bookName);
		setBookAuthor(bookAuthor);
		setBookGenre(bookGenre);
		setBookStatus(bookStatus);
		setNumOfBooks(numOfBooks);
		ISBNCount++;
		ISBN = ISBNCount;
		
		
		
		
	}
	
	public void setBookName(String name) {
		bookName = name;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookAuthor(String author) {
		bookAuthor = author;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
	public void setBookGenre(String genre) {
		bookGenre = genre;
	}
	
	public String getBookGenre() {
		return bookGenre;
	}
	
	
	public void setBookStatus(char status) {
		bookStatus = status;	
	}
	
	public char getBookStatus() {
		return bookStatus;
	}
	
	public void setNumOfBooks(int books) {
		numOfBooks = books;
	}
	
	public int getNumOfBooks () {
		return numOfBooks;
	}
	
	public int getISBN () {
		return ISBN;
	}
	
	public String getNoOfBooks() {
		
		return "There is "+ ISBN + " book object/s total.";
	}
	
	
	public String toString()
	{
	    return  "\nAuthor: " + bookAuthor + "\nTitle: " + bookName + 
	  "\nGenre: " +bookGenre + "\nBook Status: "+ bookStatus+ "\nNumber Of Copies " + numOfBooks +"\nISBN: " + ISBN;
	}
	
	public boolean isBorrowed() {

	    if (bookStatus == 'A' || bookStatus == 'a') {
		borrowed = false;
		}
	    else if (bookStatus == 'B' || bookStatus == 'b') {
	    	
	    borrowed = true;
	    }
		return borrowed;
		
		}
	
	public void Borrow() {
		if (isBorrowed()==false) {
			bookStatus ='B';
		}
			
	}
	
	public void Return() {
		if (isBorrowed()==true) {
			bookStatus ='A';
			
		}
}
}