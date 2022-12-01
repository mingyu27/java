package generic;

public class GenericMethod {

	//메서드
	
	// 인스턴스 생성전에 필요한 메서드인가봄..
	// double형 넓이를 return이 목적
	// Point<T, V>형 변수(점 2개)를 매개변수로 받을 것 > 두 점을 받아서, 높이랑 넓이 구하는 과정일 듯?
	// 
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	
	
	
	public static void main(String[] args) {
		// 점 2개를 받을것임
		// Point형 인스턴스(x축은 정수형, y축은 실수형) 2개 생성~!
		Point<Integer, Double> p1 = new Point<Integer,Double> (0, 0.0);
		Point<Integer, Double> p2 = new Point<Integer,Double> (10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
	}

}
