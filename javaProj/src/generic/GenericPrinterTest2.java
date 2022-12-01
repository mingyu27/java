package generic;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		//GenericPrinter에서 printing()메서드가 호출
		//멤버변수에 대입된 클래스의 doPrinting()이 호출됨
		//Powder에서의 doPrinting()호출예정
		powderPrinter.printing();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
		
		
	}

}
