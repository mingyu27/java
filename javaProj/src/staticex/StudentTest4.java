package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");		//이지원 이름set()
		System.out.println(Student2.getSerialNum());	//이지원 학번get() 출력
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);	// 이지원 학번: (이지원학번)

		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");		//손수경 이름set()
		System.out.println(Student2.getSerialNum());	//손수경 학번 get()
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);	//손수경 학번: (손수경학번)
		
		
		
		
		
	}

}
