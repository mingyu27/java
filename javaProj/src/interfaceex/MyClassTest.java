package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {

		//모든 인터페이스의 메서드 사용하고싶어서, 최하위 계층의 인스턴스를 구현한 클래스로 인스턴스를 형성!!
		MyClass mClass = new MyClass();
		
		//mClass를 X인터페이스 기능으로 제한함
		//MyClass에서 재정의된 메서드중, X인터페이스에서 선언된 추상메서드만 사용할 것임~
		X xClass = mClass;
		xClass.x();
		
		//Y인터페이스까지 제한
		Y yClass = mClass;
		yClass.y();
		
		//X와 Y를 상속받는 MyInterface인터페이스로 기능을 제한
		//MyInterface의 메서드(X,Y,자신) 모두 사용가능.
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		
	}

}
