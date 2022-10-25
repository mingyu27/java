package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		
		CarFactory factory = CarFactory.getInstance();	//유일 CarFactory 인스턴스 get()	
		Car mySonata = factory.createCar(); 			// Sonata 인스턴스 생성
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());		// mySonata의 carid return
		System.out.println(yourSonata.getCarNum());
		
	}

}
