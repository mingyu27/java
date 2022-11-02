package polymorphism;

/*
class Animal {							// Animal클래스
	//메서드
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {			// Human클래스 (Animal의 하위)
	//메서드
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal {
	//메서드
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	//메서드
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

*/

public class AnimalTest1 {

	public static void main(String[] args) {
		
		AnimalTest1 aTest = new AnimalTest1();	//클래스 자체에서 aTest라는 인스턴스 생성
		aTest.moveAniaml(new Human());	
		aTest.moveAniaml(new Tiger());
		aTest.moveAniaml(new Eagle());
		
		
		
		
	}
	
	public void moveAniaml(Animal animal) {	//Animal형 변수를 받아서, 매개변수란에서 인스턴스 생성시킬것 같음.
		animal.move();						//생성된 인스턴스의 클래스에서 void move() 메서드가 정의돼야함.
	}

}
