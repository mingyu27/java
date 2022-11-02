package chapter9.step1;

public class Bus extends Car {
	//멤버변수
	
	//생성자
	
	
	
	//메서드
	
	//refuel()
	@Override
	public void refuel() {
		System.out.println("천연가스를 충전합니다.");
	}
	
	//load()
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}

}
