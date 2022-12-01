package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		//처음생성하면 Biginner로 초기화되도록 할것.
		Player player = new Player(); 
		player.play(1); // Player클래스에 public void play(int count) 메서드 생성!

		//level에 대입하기 전에, 대입될 Advanced인스턴스를 미리생성할것.
		Advanced aLevel = new Advanced();	
		player.upgradeLevel(aLevel);	//Player클래스에 public void upgradeLevel(PlayerLevel playerLevel)메서드 생성!
		player.play(2);			//level == Advanced, 가상메서드에 의해 Advanced의 run(),,,등이 실행될예정
		
		//level에 대입하기 전에, 대입될 Super인스턴스를 미리 생성할것.
		Super sLevel = new Super();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
	}

}
