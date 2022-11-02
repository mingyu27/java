package chapter9.step1;

public class CarTest {

	public static void main(String[] args) {
		//bus, autoCar 인스턴스 생성
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();

		//달리기
		//run은 똑같이 출력되도록, 상위Car에 concrete선언
		bus.run();
		autoCar.run();
		
		//refuel
		//각각 관련없이 출력하므로, 상위Car에 abstract String refuel();
		bus.refuel();
		autoCar.refuel();
		
		//사람,짐 넣기
		//메서드 이름도 달라서, 상위에는 적지 않기
		bus.takePassenger();
		autoCar.load();
		
		//stop
		//메서드명 같고, 실행도 같아서, 상위에만 메서드적기.
		bus.stop();
		autoCar.stop();
		
	}

}
