package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee"); 	//학번1001인 Lee라는 인스턴스 생성 
		studentLee.addSubject("국어", 100);	//Lee의 국어성적 100으로 입력;
		studentLee.addSubject("수학", 50); 	//Lee의 수학성적 50으로 입력;
		
		Student studentKim = new Student(1002,"Kim"); 	//학번 1002인 Kim이라는 인스턴스 생성
		studentKim.addSubject("국어", 70);		//Kim의 국어성적 70으로 입력;
		studentKim.addSubject("수학", 85);		//Kim의 수학성적 85로 입력;
		studentKim.addSubject("영어", 100);		//Kim의 영어성적 100으로 입력;
		
		studentLee.showStudentInfo(); // 2번반복(국수)
		studentKim.showStudentInfo(); // 3번반복(국영수)

	}

}
