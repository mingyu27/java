package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();		//Company1, 2는 하나의 static한 인스턴스를 참조하게됨.
		System.out.println(myCompany1 == myCompany2);	//같다고 출력할 것임

	}

}
