package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);	//인스턴스주소 출력예정!
		
		Class pClass = Class.forName("classex.Person");	//Class변수에 Person클래스 입력됨!
		Person person2 = (Person)pClass.newInstance();	
		//person2에 Person형으로 형변환된, pClass(Person이 입력된)의 새로운 인스턴스가 대입됨.
		System.out.println(person2);
		
		
		
	}

}
