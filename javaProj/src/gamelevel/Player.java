package gamelevel;

public class Player {
	//멤버변수
	private PlayerLevel level;		// 외부클래스에서 접근할 수 없도록! > get() set()만들것
	
	
	

	//생성자
	public Player() {
		level = new Biginner();			// 상위클래스(PlayerLevel)에 하위클래스(Biginner)대입..
		level.showLevelMessage();		
		// showLevelMessage()는 PlayerLevel의 메서드임
		// 동시에 추상메서드여서 가상메서드가 적용됨,, 각 Biginner,Advanced,Super 클래스의 메서드가 호출될 예정
	} 
	//인스턴스 생성과 동시에 Biginner로 level초기화할것
	//Player인스턴스 생성과 동시에 각 level의 안내문구 출력예정
	
	
	
	
	//get() set()
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void setLevel(PlayerLevel playerLevel) {
		this.level = playerLevel;
	}
	
	
	
	
	//메서드
	
	
	final public void play(int count) {			
		level.run();
		level.jump(count);
		level.turn();
	} 
	//play()
	//showLevelMessage()~turn()메서드는 Player가 아닌 PlayerLevel의 멤버변수이다.
	
	
	public void upgradeLevel(PlayerLevel playerLevel) {
		level = playerLevel;
		level.showLevelMessage();
	}
	// upgradeLevel()
	// PlayerLevel형을 매개변수로 받아서, level(Player 멤버변수)에 대입할것.
	
	
}
