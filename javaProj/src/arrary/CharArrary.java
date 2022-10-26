package arrary;

public class CharArrary {

	public static void main(String[] args) {
		char[] alphabets = new char[26]; 	//char형 배열26개, alphabets
		char ch = 'A';	// char형 변수
		
		for (int i = 0; i < alphabets.length; i++, ch++) {		//26회반복, A,B,,, 순서대로 대입될예정
			alphabets[i] = ch;
		}
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int)alphabets[i]); // A, 65....이런식으로 출력예정
		}
		
		
		
	}

}
