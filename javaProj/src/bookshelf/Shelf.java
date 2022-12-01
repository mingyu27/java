package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	// 멤버변수
	// Shelf를 상속받아서 배열을 쓸것이므로, protected로 선언
	protected ArrayList<String> shelf;
	
	//생성자
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	
	// getShelf()
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
	
}
