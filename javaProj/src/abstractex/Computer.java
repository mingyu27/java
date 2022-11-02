package abstractex;

public abstract class Computer {
	//abstract 메서드 사용목적: 구현에 대한 책임을 하위클래스에 위임한다.
	public abstract void display();	
	public abstract void typing();
	
	//concrete 메서드: 상하위 클래스에서 공통으로 사용할 메서드를 구현함.
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
