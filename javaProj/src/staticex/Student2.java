package staticex;

public class Student2 {
	private static int serialNum = 1000;		//private으로 serialNum 클래스변수로 선언
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {						// 생성자초기화, 학번 순서대로 부여됨, serialNum이 private이므로 메스드로 수정하게함.
		studentID  = ++serialNum;
	}
	
	public String getStudentName() {		// 이름get()메서드
		return studentName;
	}
	
	public void setStudentName(String name) {	//이름set()메서드
		studentName = name;
	}
	
	public static int getSerialNum() {		//static메서드, serialNum의 get()메서드
		//int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) { //serialNum의 set() 메서드
		Student2.serialNum = serialNum;
	}
	
	
}

