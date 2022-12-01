package sorting;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort 오름차순정렬합니다.");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort 내림차순정렬합니다.");
		
	}

	@Override
	public void description() {
		System.out.println("QuickSort 방식입니다.");
	}

	
}
