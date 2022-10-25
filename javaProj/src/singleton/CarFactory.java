package singleton;

public class CarFactory {
	
	 
	
	
	
	//생성자, 유일인스턴스
	private CarFactory() {		// private으로 선언 > 외부에서 생성자 사용하지 못하게
		
	}
	
	private static CarFactory instance = new CarFactory(); // CarFactory 유일인스턴스 생성, private으로 외부에서 생성하지 못하게
	
	public static CarFactory getInstance() {		//외부에서 유일인스턴스 돌려받도록 CarFactory형 public으로 선언
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	//메서드
	public Car createCar() {				//공장에서 차생산하는 메서드, Car형 클래스변수로 return
		return new Car();
	}
	
	
}
