package singleton;

public class Car {
	// 멤버변수
	private static int serialNum = 1000;	//외부에서 serialNum 수정ban, 인스턴스 여부에 상관없는 serialNum
	private int carID;
		 
	//생성자
	public Car() {							//new Car(), 순서대로 carID각각 생성
		carID = ++serialNum;
	}
		
	//메서드
	public int getCarNum() {
		
		return carID;
	}
		 
		 
		 
}
