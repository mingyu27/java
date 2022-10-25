package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);  //serialNum 초기값 출력
		studentLee.serialNum++;						// 이지원 학번 초기화됨
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);	// static변수는 모든 인스턴스가 공유하므로 이지원이랑 같은 값일 것임.
		System.out.println(studentLee.serialNum);	// 초기화된 이지원 학번이 출력될 것 같음
		
		
		
		
	}

}
