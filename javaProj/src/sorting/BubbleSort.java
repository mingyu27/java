package sorting;

public class BubbleSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort 오름차순정렬합니다.");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort 내림차순정렬합니다.");
		
	}

	@Override
	public void description() {
		System.out.println("BubbleSort 방식입니다.");
	}
}
