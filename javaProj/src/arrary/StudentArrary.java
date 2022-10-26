package arrary;

public class StudentArrary {

	public static void main(String[] args) {
		Student[] team = new Student[3];
		
		team[0] = new Student("James");
		team[1] = new Student("Tomas");
		team[2] = new Student("Edward");
		
		for(int i = 0; i < team.length; i++) {
			team[i].showStudentInfo();
		}

	}

}
