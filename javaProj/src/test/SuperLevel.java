package test;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주빨리 달립니다.");
	}

	@Override
	public void jump(int count) {
		if(count > 0) {
			for(int i = 0; i < count; i++) {
				System.out.println("아주높이 jump합니다.");
			}
		}
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 turn합니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");
		
	}

}
