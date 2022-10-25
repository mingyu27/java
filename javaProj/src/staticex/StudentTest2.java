package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");					// 인스턴스 생성, 학번부여됨(1001)
		System.out.println(studentLee.serialNum);			// 1001출력
		// System.out.println(Student1.serialNum); , 똑같이 1001출력됨, static변수는 클래스 변수랑 같음
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID); // 이지원 학번: 1001
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID); // 손수경 학번: 1002

	}

}
