package exercise7;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> set = new ArrayList<Dog>();		//Dog형 ArrayList만들기
		
		
		set.add(new Dog("a", "atype"));	//Dog형 ArrayList set에 Dog형 인스턴스 5개 형성
		set.add(new Dog("b", "bType"));
		set.add(new Dog("c", "cType"));
		set.add(new Dog("d", "dType"));
		set.add(new Dog("e", "eType"));
		
		
				
		//향상된 for문으로 배열정보 출력하기
		for(Dog dog : set) {
			System.out.println(dog.dogInfo());
		}
		
		
		
	}

}
