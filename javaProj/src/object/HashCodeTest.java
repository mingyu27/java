package object;

public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//String 클래스는 같은 문자열인 경우, equals()메서드값이 true
		//따라서 hashCode() 메서드도 같은 주소를 출력예정!
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		//Integer 클래스도 String처럼 출력예정!
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}
