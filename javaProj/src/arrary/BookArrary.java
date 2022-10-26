package arrary;

public class BookArrary {

	public static void main(String[] args) {
		Book[] library = new Book[5];		//Book형의 배열명: library, 배열수:5
						// 인스턴스5개가 생성된것이 아님, 생성될 수 있도록, 주소가 저장될 칸만 형성된것.
		
		for(int i = 0; i <library.length; i++) {
			System.out.println(library[i]);		//library[0]~[4]출력, 주소값이 출력될것 같음, 참조변수라서..?
		}
		

	}

}
