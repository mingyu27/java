package arrary;
import java.util.ArrayList;				//ArrayList import하기

public class StudentArraryList {

	public static void main(String[] args) {
		

		 ArrayList<Student> group = new ArrayList<Student>();		//student를 ArrayList형 배열로 만들것임, 배열명: group
		 
		 group.add(new Student("James"));
		 group.add(new Student("Thomas"));
		 group.add(new Student("Edward"));		// 학생3명을 ArrayList에 인스턴스변수로 선언함.
		
		 // group배열 내용을 출력하고 싶어~
		 for(int i = 0; i < group.size(); i++) {
			 Student student = group.get(i); 			// 임시의 Student클래스 변수인 student를 형성 
			 student.showStudentInfo();					// 후 대입하여, 그때그떄 출력하는 방식
		 }
		 
		 //방법2
		 for(Student student : group) {					//향상된 for문 (대입될 변수 : 복사할 대상)
			 student.showStudentInfo();
		 }
	}

}
