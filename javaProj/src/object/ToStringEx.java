package object;

class Book{
	//멤버변수
	int bookNumber;
	String bookTitle;
	
	//생성자
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
