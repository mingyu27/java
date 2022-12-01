package object;

class Point {
	//멤버변수
	int x;
	int y;
	
	//생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	
}

class Circle implements Cloneable {
	//멤버변수
	Point point;
	int radius;
	
	//생성자
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}


	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); 
	}
	
	
	
}


public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();	
		// clone()메서드 이용 > circle 인스턴스를 copyClone에 복사!ㅃ
		
		System.out.println(circle);
		System.out.println(copyCircle);
		// toString()메서드 재정의 > 같은 내용을 출력할 예정..? 인스턴스복제...?
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		// 진짜 주소를 출력할 것이니, 내용만 같은 서로다른 두개 인스턴스 > 다른 값 출력예정?
		
	}

}
