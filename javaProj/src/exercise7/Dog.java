package exercise7;

public class Dog {
	//멤버변수
	private String name;
	private String type;
	
	//생성자
	public Dog(String name, String type) {
		this.type = type;
		this.name = name;
	}
	
	//메서드
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public String dogInfo() {
		return name + ", " + type;
	}
	
	
}
