package arrary;

public class Student {
	//멤버변수
	private int studentID;
	private String name;
	private static int serialNum = 1000;
	
	//생성자
	public Student(String name) {
		this.name = name;
		this.studentID = ++serialNum;
	}
	
	//메서드
	
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}
}
