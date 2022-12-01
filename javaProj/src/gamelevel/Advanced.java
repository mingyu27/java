package gamelevel;

public class Advanced extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
		
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i < count; i ++) {
			System.out.println("높이 jump합니다.");
		}
		
	}

	@Override
	public void turn() {
		System.out.println("Turn할줄 모르지롱");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");
		
	}

}
