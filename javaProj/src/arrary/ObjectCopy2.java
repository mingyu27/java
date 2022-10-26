package arrary;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 허세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");			//배열 복사 후 bookArray1[0]의 변경사항이 있음.
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}

		System.out.println("=== bookArray2 ===");
		for(int i = 0; i < bookArray2.length; i++) {		//변경사항이 bookArray2에도 적용이 되어서 출력됨. 복사된것이 인스턴스자체가 아니고, 
			bookArray2[i].showBookInfo();					// 인스턴스 주소가 복사되었기 때문이다.
		}
		
	}

}
