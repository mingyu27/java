package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열주소: " + System.identityHashCode(javaStr));
		// javaStr 원래주소
		
		StringBuilder buffer = new StringBuilder(javaStr);
		//javaStr을 StringBuilder 클래스변수에 대입 > append할 준비!
		System.out.println("연산전 buffer 메모리주소: " + System.identityHashCode(buffer));
		//buffer 원래주소
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		//연장한 후까지만해도 buffer의 주소는 변함이 없었는데..?
		
		javaStr = buffer.toString(); //buffer.toString()은 String클래스에서 재정의 > 문자열 그대로 출력됨!
		// StringBuilder형 buffer의 주소 > javaStr에 대입
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr문자열 주소: " + System.identityHashCode(javaStr));
		// buffer의 원래 주소랑 같지 않을까..? > 변화해버렸다.
	}

}
