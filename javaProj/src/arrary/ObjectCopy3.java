package arrary;

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 허세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());		//bookArray2배열에 책이름부여, 배열1에서 가져옴.
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());			//저자이름부여
		}
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();								//bookArray2배열의 책명,저자 정보 순서대로 출력.
		}

		bookArray1[0].setBookName("나목");		//bookArray1[0] 정보 변경
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();					//bookArray1배열 정보 출력
		}
		
		System.out.println("=== bookArray2 ===");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();					//bookArray2배열 정보 출력
		}
		
	}

}
