package arrary;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];				//2행3열 이차원배열 형성, 배열명: arr
		
		for(int i = 0; i <arr.length; i++) {		// 행만큼 반복할것, 2번
			for(int j = 0; j < arr[i].length; j++) {	// 열만큼 반복할 것, 3번
				System.out.println(arr[i][j]);		// [0][0~2]...
			}
			System.out.println();		//[0]행 반복하고, 한칸 띄울것
		}
		System.out.println(arr.length);	//열길이, 2출력예정
		System.out.println(arr[0].length);	//arr[0]의 행길이 출력, 3출력예정
	}

}
