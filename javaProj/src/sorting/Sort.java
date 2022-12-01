package sorting;

public interface Sort {

	void ascending(int[] arr);	//오름차순
	void descending(int[] arr);	//내림차순
	default void description() {
		System.out.println("정렬 알고리즘입니다.");
	}
}
