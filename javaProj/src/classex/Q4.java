package classex;


class MyDog {
	//멤버변수
	String name;
	String type;

	
	//생성장
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}


	@Override
	public String toString() {
		return name + type;
	}
	
	
	
}



public class Q4 {

	public static void main(String[] args) {
		MyDog dog = new MyDog("멍멍이", "진돗개");
		System.out.println(dog);
	}

}
