package arrary;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5];		// data: double형 배열, 일단 5개로 선언
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i = 0; i < data.length; i++) {	// 10.0, 20.0, 30.0, ? ?
			System.out.println(data[i]);
		}

	}

}
