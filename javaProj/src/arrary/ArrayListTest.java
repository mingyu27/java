package arrary;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>(); // ArrayList 선언
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 허세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐베리"));
		
		//library복사해서 book에 대입 방법1
		for(int i = 0; i < library.size(); i++) {	//library ArrayList의 길이만큼 반복할것
			Book book = library.get(i);	//book형의 book변수 선언, library ArrayList에서 (길이)번 반복하여 대입하기
			book.showBookInfo();	//대입할때마다 bookInfo보여줄것
		}
		System.out.println();
		
		//library복사해서 book에 대입 방법1
		System.out.println("===향상된 for문 사용===");
		for(Book book : library) {		//library ArrayList를 복사 > book형의 book에 대입
			book.showBookInfo();	//복사할때마다 bookInfo 보여줄것
		}

	}

}
