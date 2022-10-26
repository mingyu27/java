package arrary;

public class Book {
	private String bookName;		//외부에서 사용할수 없도록 감춰놓음
	private String author;
	
	public Book() {}		//그냥 생성자
	
	public Book(String bookName, String author) {
		this.bookName = bookName;						//왜 this.를 붙일까...
		this.author = author;
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
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
	
}
