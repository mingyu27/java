package chapter9.step1;

public class AutoCar extends Car {

	
	
	
	//메서드

	//refuel()
	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
		
	//load()
	public void load() {
		System.out.println("짐을 싣습니다.");
	}

	@Override
	public void run() {
		System.out.println("차가 달립니다.");
		
	}
}
