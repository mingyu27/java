package sorting;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort 오름차순정렬합니다.");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort 내림차순정렬합니다.");
		
	}

	@Override
	public void description() {
		System.out.println("HeapSort 방식입니다.");
	}



}
