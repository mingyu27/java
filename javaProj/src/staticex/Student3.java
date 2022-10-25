package staticex;

public class Student3 {
	public static int serialNum = 1000;
	private String studentName;
	int studentID;
	int cardNum;
	
	public Student3() {		// 순서대로 학번, 카드번호 부여
		serialNum++;
		studentID = serialNum;
		cardNum = serialNum + 100;
	}
	
	public void setStudentName(String name) {		//이름 set()메서드
		studentName = name;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	
	
	
	
}
