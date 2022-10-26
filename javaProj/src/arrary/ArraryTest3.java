package arrary;

public class ArraryTest3 {

	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 5;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;		//다음행부터 size == 5
		
		for(int i = 0; i < size; i++) {
			System.out.println(data[i]);
		}

	}

}
