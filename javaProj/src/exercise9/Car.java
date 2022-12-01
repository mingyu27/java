package exercise9;

public abstract class Car {
	//멤버변수
	
	
	//생성자
	
	
	//메서드
	final public void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}	
	// 4개 매서드 Car에서 선언할것.
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
}
