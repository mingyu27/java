package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		// 인스턴스를 생성이 가능한 BookShelf클래스로~
		// 인터페이스형 변수로 선언 > 목적이 뭘까...
		Queue shelfQueue = new BookShelf();	
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		
	}

}
