package arraylist;
import java.util.ArrayList;			//ArrayList 쓸거야~

public class Student {
	
	//멤버변수
	int studentID; //학번
	String studentName; //이름
	ArrayList<Subject> subjectList; 							// 왜 ArrayList를 썼을까요~?, 이유가 있겠지요?
	//ArrayList<Student> group = new ArrayList<Student>(); 활용버전임!
	
	//생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();					// 인스턴스 생성할 떄, new ArrayList<Subject>(); 생성할것임.
	}
	
	//메서드
	public void addSubject(String name, int score) {//학생~ 너의 과목명, 성적 입력할거야
		Subject subject = new Subject();	//과목관한거 입력할거니, Subject클래스 생성부터하자
		subject.setName(name); 				//과목명 입력하자
		subject.setScore(score); 			//그과목 점수 입력하자
		subjectList.add(subject); 								//arrayList형에 Subject(클래스)형을 대입....
	}
	
	public void showStudentInfo() {//학생 성적구경좀 할까
		int total = 0;	//반복하면서 국영수 성적이 계속 더해질 것임.
		for(Subject s : subjectList) {		//Subject형 s에 Subject형 ArrayList인 subjectList가 길이만큼 반복되어 복붙될 예정임.
			total += s.getScorePoint();	//총점 더하기
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
	
}
