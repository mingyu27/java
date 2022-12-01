package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		//Customer클래스인 customer를 인터페이스형인 buyer에 대입하여 형변환(묵시적)
		//buyer는 Buy인터페이스의 메서드만 호출가능
		//팔고살수 있는 손님의 기능을 파는 사람으로 제한하기.
		Buy buyer = customer;
		buyer.buy();
		buyer.order();	
		//Buy인터페이스 > default로 선언, Customer클래스 > 인터페이스의 default를 재정의
		//buy라는 행위를 하고싶어서, customer클래스의 인터페이스를 만들어서 인터페이스형으로 대입함.
		//customer 인터페이스가 대입된것이니, customer에서 재정의된 메서드가 호출될 예정.
		
		//buyer였던 Customer를 seller로 역할 변환.
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			customer2.buy(); 
			customer2.sell();
		}
		// seller를 하위클래스형인 Customer형변환 (묵시적 인터페이스형변환 된것을 클래스형으로 원상복귀)

		customer.order();
	}

}
