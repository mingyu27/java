package template;

public abstract class Car {
	//추상
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	
	//공통
	public void startCar() {
		System.out.println("시동을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	
	//템플릿
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}




}

