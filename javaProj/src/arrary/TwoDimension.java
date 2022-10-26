package arrary;

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};			// 2행3열임
		
		for(int i = 0; i < arr.length; i++) {				//arr.length는 [행][열] 순서이기에, 행개수라고 예상, 2번반복됨, 맞았다!!
			for(int j = 0; j < arr[i].length; j++) {		//arr[].length는 열개수라고 예상..?, 3번반복됨
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

	}

}
