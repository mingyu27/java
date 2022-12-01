package string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		//서로 다른 두개의 인스턴스
		
		System.out.println(str1 == str2);	//주소값 > false
		System.out.println(str1.equals(str2));	//String클래스 equals()재정의 o > true
		
		String str3 = "abc";	
		String str4 = "abc";
		//상수풀에서 이미 생성돼있는 "abc"참조, str1과 str2와는 다른 것~!
		
		System.out.println(str3 == str4);	//주소값 > true
		System.out.println(str3.equals(str4));	//String클래스 equals()재정의 o > true
		
		
	}

}
