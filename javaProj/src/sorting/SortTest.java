package sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬 방식을 선택하세요");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;	//인터페이스형 변수 
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}
		else if (ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}
		else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		//인터페이스형 변수를 이용하므로써, 정렬방식과 상관없이 공통적으로 사용할 수 있게 코드 작성가능ㅂ
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
