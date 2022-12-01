package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);	//javaStr 주소 출력
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));
		
		// javaStr과 androidStr 문자열 이어서 javaStr에 대입
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소값: " + System.identityHashCode(javaStr));
		// 한번 생성된 문자열은 immutable > 다른 문자열이 생성되어서 대입된 것임. 
	}

}
