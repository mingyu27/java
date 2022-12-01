package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		//Class형에 Class형 대입
		Class pClass1 = person.getClass();	//.getClass()는 클래스형 반환!
		System.out.println(pClass1.getName());	//Class 클래스에 public Class getName()메서드가 있을것~
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");	
		//Class클래스에 public Class forName(String className)메서가 있을것~
		System.out.println(pClass3.getName());
	}

}
