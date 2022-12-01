package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		//GenericPrinter클래스 인스턴스 만들것
		//자료형 매개변수 > Powder
		//Powder가 들어간 것이 아니고, Powder형만 받을 수 있다고 선언했을 뿐~!
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		//setMaterial()메서드는 매개변수로 Powder형을 받아야함..!
		//Powder형 인스턴스 생성과 동시에 매개변수로 사용
		powderPrinter.setMaterial(new Powder());
		
		//getMaterial()메서드가 Powder형 멤버변수를 return
		Powder powder = powderPrinter.getMaterial();
		
		//GenericPrinter에서 toString()메서드 재정의
		//재정의를 대입된 멤버변수의 toString()으로 재정의함!
		System.out.println(powderPrinter);	
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
