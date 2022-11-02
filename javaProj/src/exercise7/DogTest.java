package exercise7;

public class DogTest {

	public static void main(String[] args) {
		Dog[] set = new Dog[5];		//Dog형 길이5인 배열, 배열명:set
		
		set[0] = new Dog("a", "atype");	//set Dog형 배열에 각각 인스턴스 생성
		set[1] = new Dog("b", "bType");
		set[2] = new Dog("c", "cType");
		set[3] = new Dog("d", "dType");
		set[4] = new Dog("e", "eType");
		
		//그냥 for문으로 배열정보 출력하기
		for(int i = 0; i < set.length; i++) {
			Dog dog = new Dog(set[i].getName(), set[i].getType());
			System.out.println(dog.dogInfo());
		}
		System.out.println();
		
		//향상된 for문으로 배열정보 출력하기
		for(Dog dog : set) {
			System.out.println(dog.dogInfo());
		}
	}

}
