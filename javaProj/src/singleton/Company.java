package singleton;

public class Company {
	
	private static Company instance = new Company(); //유일하게 생성한 인스턴스, static을 선언..(프로그램 시작과 동시에 생성, 따로 인스턴스를 만들지 않기 때문)
	
	
	
	private Company () {							// 생성자를 private으로 선언해서 > 외부에서 절대 호출하지 못하도록!
		
	}
	
	public static Company getInstance() {			// 유일인스턴스 get()메서드, 왜 static일까요..instance가 static으로 선언되어서..?
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
	
	
	
	
	
	
}
