package chapter9.step1;

public abstract class Car {
	//멤버변수
	
	//생성자

	
	//메서드
	
	//(각각)run
	public abstract void run();
	
	//(각각) refuel 
	public abstract void refuel();
	
	//(공통) stop
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	
	
}
