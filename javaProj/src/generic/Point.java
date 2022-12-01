package generic;

public class Point<T, V> {
	
	//멤버변수
	// T,V는 자료형 매개변수이므로, Object임 그냥..
	T x;
	V y;
	
	//생성자
	// 자료형 상관없이 x와 y를 받아서 순서대로 멤버변수 x, y에 대입하자
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	//메서드
	// x, y 각각의 자료형으로 출력함 (캐스트 연산자 필요없음)
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}

}
