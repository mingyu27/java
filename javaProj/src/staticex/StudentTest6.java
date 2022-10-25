package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이누구");
		System.out.println(studentLee.getStudentName() + " 학번은 " + Student3.serialNum + " 카드번호는 " + studentLee.cardNum);

	}

}
