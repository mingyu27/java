package test;

public class Player {

	//멤버변수
	private PlayerLevel level;		//PlayerLevel클래스 만들기! > get() set()메서드 만들기!
	
	
	//생성자
	public Player() { 
		level = new BiginnerLevel();		
		// 각 level클래스 만들기, 상위클래스형에 하위클래스형 인스턴스 대입(형변환)
		// 자료형은 PlayerLevel형이기 때문에, PlayerLevel의 멤버변수와 메서드만 이용가능, but 가상메서드 적용가능(추상클래스)
		level.showLevelMessage(); 	//각 level클래스에 showLevelMessage()메서드 완성할것.
	}
	
	//메서드
	final public void play(int count) {
		level.run();
		level.jump(count);
		level.turn();
	}
	//각 level클래스에 위3개메서드 완성할것.
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	
	//get() set()
	public PlayerLevel getLevel() {
		return level;
	}

	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
}
