package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	
	@Override
	public String deQueue() {
		return shelf.remove(0);	//배열 첫 요소를 삭제하고 변환
	}

	@Override
	public int getSize() {
		return getCount();	//인터페이스의 추상메서드를 상위클래스의 메서드로 완성해버리기..
	}

}
