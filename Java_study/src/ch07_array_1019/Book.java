package ch07_array_1019;

public class Book {

	private String bookName;
	private String author;
	private int price; //가격 추
	
	public Book(){}
	
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public Book(String bookName, String author, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo(){
		System.out.println(bookName + "," + author + "," + price);
	}
}
