package test;

public class MainBoard {

	public static void main(String[] args) {

		Player player = new Player(); 	//Player클래스 만들기, 생성자에서 기본level을 Biginner형으로 초기화할것!
		player.play(1);					//@Player, final public void play(int count)메서드 만들기!

		AdvancedLevel aLevel = new AdvancedLevel(); //Advanced 인스턴스 형성
		player.upgradeLevel(aLevel);				
		//player에 public void upgradeLevel(PlayerLevel level)메서드 만들기!
		//upgrade메서드에 변경된 level의 showLevelMessage()메서드 출력시킬것.
		player.play(2); 	//AdvancedLevel로 2번play예정
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
